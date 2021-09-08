package Section02;

public class Term3 {
	
	int coef;
	int exp;
	
	// main 함수가 속해 있는 클래스 안에 있는 것은 모두 static
	// 아닌 경우(이 파일) static 붙이지 않음
	
	// 클래스와 동일한 이름을 가지며 return 타입이 없는 메서드를 "생성자"라고 함
	// 생성자는 객체를 생성할 때 자동으로 실행
	// 생성자가 없는 Term 의 경우는 객체 생성 후 따로 데이터값 초기화
	// 생성자가 있는 Term3의 경우는 객체 생성과 초기화 한번에 진행
	//  ex) Term3 t3 = new Term3(3, 2);
	public Term3(int c, int e) {
		coef = c;
		exp = e;
	}
	
	// Term2의 일부분이며 "자기자신"의 값을 계산한여 반환 -> 매개변수로 어떤 항을 받을 필요없음
	// 실체가 아님(설계도임) -> 실행 / 호출 불가 -> 객체를 만들어야 호출 가능
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, exp));  // double로 결과가 나오므로 int로 변경
	}

	// Term2의 일부분이며 "자기자신"의 값을 계산한여 반환 -> 매개변수로 어떤 항을 받을 필요없음
	// 실체가 아님(설계도임) -> 실행 / 호출 불가 -> 객체를 만들어야 호출 가능
	public void printTerm() {
		System.out.print(coef + "x^" + exp);
		
	}
	
	// calcTerm, printTerm을 호출하고 싶다면
	// Term2 t = new Term2();
	// t.coef = 3;
	// t.exp = 2;
	// int result = t.calcTerm( exp );
	// t.printTerm();
}
