package Section01;

public class Code01_2 {

	public static void main(String[] args) {
		
		Person01 first = new Person01();  // new Person01(): 이름 없는 객체(=A) -> 실제로 저장되는 곳
		// Person01 first: 참조변수 선언(객체의 주소 저장) -> 실제로 Person01()의 객체 참조
		
		first.name = "John";
		first.number = "010-4561-5306";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);

		Person01 second = first;  // second에 first주소 저장 -> 이름없는 객체(=A) 주소 저장
		                          // 객체는 하나, first, second 둘 다 동일한 객체 참조 
		second.name = "Alice";
		
		// first, second가 같은 객체를 참조하기 때문에 second를 수정했지만, first도 수정됨
		System.out.println("Name: " + first.name + ", Number: " + first.number);

		// System.out.println("Name: " + second.name + ", Number: " + second.number);

	
		Person01 [] members = new Person01 [1000];  // 배열 members의 타입 = Person01
		// members = _ _ _ _ _ .. -> 각각의 _가 Person01 타입을 가지고있음
		//                        -> 각각의 _은 참조변수
		members[0] = first;
		members[1] = second;
		
		System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
		
		
		// Error남
		// members[2].name = "Daviud";
		// members[2].number = "18245678912";
		members[2] = new Person01();
		members[2].name = "David";
		members[2].number = "18245678912";
		
	}

}
