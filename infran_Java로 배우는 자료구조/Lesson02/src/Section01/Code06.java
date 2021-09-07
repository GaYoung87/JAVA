package Section01;

import java.util.Scanner;

public class Code06 {

	static Polynomial [] polys = new Polynomial [100];  // 다항식의 배열 저장
	static int n = 0;  // 다항식 개수
	
	public static void main(String[] args) {
		// 다항함수 : 항들의 합이며, 항은 계수와 지수에 의해 정의
		// 계수는 0이 아닌 정수이고, 지수는 음이아닌 정수라고 가정
		// ex) f(x) = -x^5 + 2x^4 - 10x - 3
		
		// 실행 예
		// $ create f : 다항함수 f = 0을 정의
		// $ add f 2 3 : f(x) = 2x^3
		// $ add f -1 1 : f(x) = 2x^3 - x 
		// ...
		// $ calc f 2 : f(2)값을 계산하여 출력
		// $ print f : 차수에 대한 내림차수능로 정렬해 다음과 같이 출력 
		//          동일한 차수의 항은 하나로 합치기
		// $ create g : 다항함수 g = 0 정의
		// ...
		// $ exit
		
		Scanner keyboard = new Scanner (System.in);
		
		while ( true ) {
			System.out.print("$ ");
			String command = keyboard.next();
			if (command.equals("create")) {
				
				// 함수 이름 입력받고
				char name = keyboard.next().charAt(0);  // nextChar()이 없는 이유: 공백도 하나의 문자로 처리되기 때문
				
				// Polynomial: 다항식을 표현하기 위한 클래스
				// ploys의 각 칸마다 존재하는 Polynomial객체마다 이름과 길이 저장
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].nTerms = 0;
				polys[n].terms = new Term [100];
				
				n++;  // polys의 갯수 -> polys의 index
			} 
			else if (command.equals("add")) {  // f 2 3
				
				// 함수명(f) 입력받고
				char name = keyboard.next().charAt(0);
				// 함수가 기존에 존재하는지 확인
				int index = find(name);
				
				// 기존에 존재하지 않는 다항식 -> f만 존재하는데 입력으로 g 2 3을 받은 경우
				if (index == -1) {  
					System.out.println("No such polynomial exists.");
				}
				// 존재하면
				else {
					// c, e(2, 3) 입력받고
					int c = keyboard.nextInt();
					int e = keyboard.nextInt();
					// 함수에 항 더해줌
					addTerm(polys[index], c, e);
					
				}
				
			} 
			else if (command.equals("calc")) {
				
				char name = keyboard.next().charAt(0);  // 어떤 함수를 print할 것인지 확인 필요
				int index = find(name);  // 그 함수가 있는지 확인
				
				if (index == -1) {  // 기존에 존재하지 않는 다항식 -> f만 존재하는데 입력으로 g 2 3을 받은 경우
					System.out.println("No such polynomial exists.");
				} else {
					int x = keyboard.nextInt();
					int result = calcPolynomial(polys[index], x);
					
					System.out.println(result);
				}
				
			} 
			else if (command.equals("print")) {
				
				char name = keyboard.next().charAt(0);  // 어떤 함수를 print할 것인지 확인 필요
				int index = find(name);  // 그 함수가 있는지 확인
				
				if (index == -1) {  // 기존에 존재하지 않는 다항식 -> f만 존재하는데 입력으로 g 2 3을 받은 경우
					System.out.println("No such polynomial exists.");
				} else {
					printPolynomial( polys[index]);
				}
				
			} 
			else if (command.equals("exit")) {
				break;
			}

		}
		keyboard.close();				
	}

	private static int calcPolynomial(Polynomial polynomial, int x) {
		int result = 0;
		for (int i = 0; i < polynomial.nTerms; i++) {
			result += calcTerm(polynomial.terms[i], x);
		}
		return result;
	}

	private static int calcTerm(Term term, int x) {
		return (int) (term.coef * Math.pow(x, term.exp));  // double로 결과가 나오므로 int로 변경
	}

	private static void printPolynomial(Polynomial polynomial) {
		
		for (int i = 0; i < polynomial.nTerms; i++) {
			printTerm(polynomial.terms[i]);
			System.out.print(" + ");
		}
		System.out.println();
	}

	private static void printTerm(Term term) {
		System.out.print(term.coef + "x^" + term.exp);
		
	}

	// 함수에 항 더해줌
	private static void addTerm(Polynomial polynomial, int c, int e) {
		// 다항식에 새로운 항 추가할 때 차수가 e인 항이 있으면 계수값 더해주기
		// 차수가 e인 항이 없으면 넣어주기
		
		// 차수가 e인 항이 있는지 확인
		int index = findTerm(polynomial, e);
		
		if (index != -1) {  // 기존에 차수가 e인 항이 있다면, 값을 더해주기
			polynomial.terms[index].coef += c;
			
		} else {  // 기존에 차수가 e인 항이 없을 때 차수 순대로 나열(insert의 문제)

			// polynomial: polys의 칸 중 하나의 칸으로 들어옴
			int i = polynomial.nTerms - 1;  
			
			// 정렬(insert)
			while (i >= 0 && polynomial.terms[i].exp < 0) {
				polynomial.terms[i+1] = polynomial.terms[i];
				i--;
			}
			
			// 함수name : _ _ _ _ -> 각각 하나의 Term 타입을가지고있음
			polynomial.terms[i+1] = new Term();
			polynomial.terms[i+1].coef = c;
			polynomial.terms[i+1].exp = e;
			polynomial.nTerms++;
		}
		
		
	}

	// e차 항이 있는지 없는지 확인
	private static int findTerm(Polynomial polynomial, int e) {
		// 항의 차수가 e보다 작아졌다면, 뒤에거는 볼 필요없음 -> 차수대로 정렬되어있기 때문
		for (int i = 0; i < polynomial.nTerms; i++) {  // 처음부터 전부 확인
			if (polynomial.terms[i].exp == e) {
				return i;  // 항 있으면
			}
		}
		return -1; // 항 없으면
	}

	// 함수명이 polys에 있는지 확인
	private static int find(char name) {  // f인지 g인지
		for (int i = 0; i < n; i ++) {  // polys를 돌면서 확인
			if (polys[i].name == name) {  // 기존에 있으면 몇번째 함수명인지 index반환
				return i;
			}
		}
		return -1;  // 존재하지 않는 함수명
	}

}
