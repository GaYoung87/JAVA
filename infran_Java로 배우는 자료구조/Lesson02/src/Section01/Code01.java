package Section01;

public class Code01 {

	public static void main(String[] args) {
		
		int x;
		x = 100;
		
		double y = 1.0023;
		
		// Person01타입의 변수를 만들어 a에다가 이름과 전화번호를 저장한다.
		// Person01 클래스는 하나의 타입이다.
		Person01 first;  // 변수의 타입 -> 사용자 지정 타입
		first = new Person01();  // 객체
		
		first.name = "John";
		first.number = "010-4561-5306";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);

		Person01 [] members = new Person01 [100];
		members[0] = first;
		members[1] = new Person01();
		members[1].name = "David";
		members[1].number = "824-555-6456";
		
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);

		
	}

}
