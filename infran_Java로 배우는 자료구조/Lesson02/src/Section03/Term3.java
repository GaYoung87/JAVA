package Section03;

public class Term3 {
	
	// int coef; int exp; 하면 Section03 패키지 내에서는 사용가능, 이외 패키지 사용불가능
	
	private int coef;  // public int coef에서 refactor-encapsulated field하면 
	                   // 자동으로 private, getter, setter, 값가지고오는방법 변경 
	private int exp;
	
	// main 함수가 속해 있는 클래스 안에 있는 것은 모두 static
	// 아닌 경우(이 파일) static 붙이지 않음
	
	// 클래스와 동일한 이름을 가지며 return 타입이 없는 메서드를 "생성자"라고 함
	// (설명은 Term2)
	public Term3(int c, int e) {
		setCoef(c);
		exp = e;
	}
	
	// getter method
	// exp의 값은 생성자에서 한번 정해지면 다시 바뀔 일 없음 -> getter만 제공
	public int getExp() {
		return exp;
	}
	
	// coef는 이 클래스의 외부에서 읽고 쓰고 가능해야하므로 public을 private으로 변경하는 대신
	// getter, setter 필요	
	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}
	
	// Term2의 일부분이며 "자기자신"의 값을 계산한여 반환 -> 매개변수로 어떤 항을 받을 필요없음
	// 실체가 아님(설계도임) -> 실행 / 호출 불가 -> 객체를 만들어야 호출 가능
	public int calcTerm(int x) {
		return (int) (getCoef() * Math.pow(x, exp));  // double로 결과가 나오므로 int로 변경
	}

	// Term2의 일부분이며 "자기자신"의 값을 계산한여 반환 -> 매개변수로 어떤 항을 받을 필요없음
	// 실체가 아님(설계도임) -> 실행 / 호출 불가 -> 객체를 만들어야 호출 가능
	public void printTerm() {
		System.out.print(getCoef() + "x^" + exp);
		
	}
	
	// calcTerm, printTerm을 호출하고 싶다면
	// Term2 t = new Term2();
	// t.coef = 3;
	// t.exp = 2;
	// int result = t.calcTerm( exp );
	// t.printTerm();
}
