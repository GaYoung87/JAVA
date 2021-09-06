package Section01;

public class Study01_Class_Object {

	public static void main(String[] args) {
		// 클래스와 객체
		// 클래스는 하나의 타입이다!
		// 참조변수와 객체를 찍어내기 위한 설계도!(실체 아님)
		// 실체는 객체임
		
		// 프리미티브 타입이 아닌 모든 변수는 참조변수이다!!!
		
		int [] numbers = new int [8];
		// 배열은 프리미티브 타입이 아니다. 프리미티브 타입의 배열이라고 하더라도 프리미티브 타입이 될 수 없다.
		// 배열의 이름 numbers는 참조변수
		// numbers(참조변수): _ -> _ _ _ _ _ _ _ _ (배열의 각 칸은 int 타입의 프리미티브 타입)
		// numbers = new int [8];를 수행하는 순간 8칸을 가진 배열이 실제로 만들어지고, 그 주소가 참조변수 numbers에 저장됨
		
		Person01 [] members = new Person01 [8];
		// members는 배열의 이름이므로 당연히 참조변수
		// members(참조변수): _ -> _ _ _ _ _ _ _ _ (배열의 각 칸은 Person01 타입 -> 프리미티브 타입X)
		// 배열의 각 칸은 Person01타입. Person01은 프리미티브타입이 아니다. -> 배열의 각 칸도 참조변수
		// 이 상태에서 배열의 각 칸에 다음과 같이 바로 이름과 번호 저장할 수 없음
		// 각 칸도 참조변수!!!!!!
		// 각 칸에 직접 name, number를 저장할 수 없다 -> 저장할 객체를 따로 new Person01()을 통해 만들어줘야함!!!!
		
	}

}
