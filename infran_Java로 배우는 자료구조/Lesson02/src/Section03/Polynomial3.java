package Section03;

public class Polynomial3 {

	private char name;  // 다항식의 이름: f, g ..
	// nTerms, terms를 private으로 바꿔도 에러가안남 -> 외부에서 직접적으로 연결하는 경우 없음
	private int nTerms;  // 다항식을 구성하는 항의 개수
	private Term3[] terms;  // 다항식을 구성하는 항들을 저장할 배열

	// 생성자가 반드시 매개변수를 받아야하는 것은 아님
	// 생성자는 객체에게 필요한 초기화 작업을 하기에 적절
	public Polynomial3() {
		nTerms = 0;
		terms = new Term3 [100];  // 배열 terms 생성
	}
	
	// 매개변수 가지는 생성자
	// 생성자 여러개 가질 수 있음
	public Polynomial3(char name) {
		this.name = name;  // 이름이 동일하다면 this.A = A로 작성
		// name = str;  
		// 매개변수 이름 = name 
		// ->위에서 설정한 name인지 매개변수 name인지 구분불가 -> 매개변수 이름 변경
		nTerms = 0;
		terms = new Term3 [100]; 
	}
	
	
	// 함수에 항 더해줌
	public void addTerm(int c, int e) {
		// 다항식에 새로운 항 추가할 때 차수가 e인 항이 있으면 계수값 더해주기
		// 차수가 e인 항이 없으면 넣어주기

		// 차수가 e인 항이 있는지 확인
		int index = findTerm(e);

		if (index != -1) {  // 기존에 차수가 e인 항이 있다면, 값을 더해주기
			terms[index].setCoef(terms[index].getCoef() + c);

		} else {  // 기존에 차수가 e인 항이 없을 때 차수 순대로 나열(insert의 문제)

			// polynomial: polys의 칸 중 하나의 칸으로 들어옴
			int i = nTerms - 1;  

			// 정렬(insert)
			// 만약 Term3에서 private int exp였다면, terms[i].exp하면 에러뜬다!! 접근 불가!!
			// * Term3에서 public int exp인 경우 terms[i].exp해야함
			//    1) 항 안에 있는 exp 읽을 수 있음
			//    2) exp값 변경 가능
			// * Term3에서 private int exp인 경우 terms[i].getExp()해야함
			//    1) 항 안에 있는 exp 읽을 수 있음
			//    2) exp값 변경 불가
			while (i >= 0 && terms[i].getExp() < 0) {
				terms[i+1] = terms[i];
				i--;
			}

			// 함수name : _ _ _ _ -> 각각 하나의 Term 타입을가지고있음
			terms[i+1] = new Term3(c, e);
			nTerms++;
		}
	}

	// e차 항이 있는지 없는지 확인
	private int findTerm(int e) {
		// 항의 차수가 e보다 작아졌다면, 뒤에거는 볼 필요없음 -> 차수대로 정렬되어있기 때문
		for (int i = 0; i < nTerms; i++) {  // 처음부터 전부 확인
			if (terms[i].getExp() == e) {
				return i;  // 항 있으면
			}
		}
		return -1; // 항 없으면
	}

	public int calcPolynomial(int x) {
		int result = 0;
		for (int i = 0; i < nTerms; i++) {
			result += terms[i].calcTerm(x);
		}
		return result;
	}

	public void printPolynomial() {

		for (int i = 0; i < nTerms; i++) {
			terms[i].printTerm();
			System.out.print(" + ");
		}
		System.out.println();
	}

	// 외부에서 name이라는게 필요하면 getName()이용.
	public char getName() {
		return name;
	}

}
