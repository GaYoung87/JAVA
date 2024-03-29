package Section02;

import java.util.Scanner;

// Code06에서 upgrade
public class Code07 {

	static Polynomial2 [] polys = new Polynomial2 [100];  // 다항식의 배열 저장
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
				polys[n] = new Polynomial2();
				polys[n].name = name;
				polys[n].nTerms = 0;
				polys[n].terms = new Term2 [100];
				
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
					polys[index].addTerm(c, e);
					
				}
				
			} 
			else if (command.equals("calc")) {
				
				char name = keyboard.next().charAt(0);  // 어떤 함수를 print할 것인지 확인 필요
				int index = find(name);  // 그 함수가 있는지 확인
				
				if (index == -1) {  // 기존에 존재하지 않는 다항식 -> f만 존재하는데 입력으로 g 2 3을 받은 경우
					System.out.println("No such polynomial exists.");
				} else {
					int x = keyboard.nextInt();
					int result = polys[index].calcPolynomial(x);
					
					System.out.println(result);
				}
				
			} 
			else if (command.equals("print")) {
				
				char name = keyboard.next().charAt(0);  // 어떤 함수를 print할 것인지 확인 필요
				int index = find(name);  // 그 함수가 있는지 확인
				
				if (index == -1) {  // 기존에 존재하지 않는 다항식 -> f만 존재하는데 입력으로 g 2 3을 받은 경우
					System.out.println("No such polynomial exists.");
				} else {
					polys[index].printPolynomial();
				}
				
			} 
			else if (command.equals("exit")) {
				break;
			}

		}
		keyboard.close();				
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
