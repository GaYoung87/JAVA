package Section01;

public class Notebook extends Computer {  // 모든 데이터멤버+메서드 -> 상속
	
	// 한대의 노트북을 표현하는 class 추가
	// Notebook -> Computer + screen size, weight

	// 추가 데이터멤버만 작성
	private double screenSize;
	private double weight;

	// super class의 생성자 중 매개변수 리스트가 일치하는 생성자 호출
	// super()을 호출할 경우 반드시 생성자 내에서 첫문장이어야함
	// 생성자: 클래스의 초기값을 매개변수로 받아 값 초기
	// 만약 여기에서 super을 쓰지 않는다면, no-parameter생성자 호출
	//  -> Computer에는 no-parameter생성자 없음(매개변수 받는 생성자는 있지만, no-parameter생성자는 없음)
	public Notebook(String manufacturer, String processor, int ramSize, int diskSize, 
			double processorSpeed, double screenSize, double weight) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		// Computer생성자에서 가지고오니까 this.manufacturer = manufacturer; 해줄필요없음
		this.screenSize = screenSize;
		this.weight = weight;
	}

	// method overriding: Computer에 toString()이 있지만, Notebook에 다시 작성하는 것
	public String toString() {
		// Computer의 데이터 멤버가 private이면 여기서 사용할 수 없다-> 상속받은거아닌가?
		// 규칙 : 부모자식 사이에도 private이면 개별로 봄
		String result = super.toString() + // 부모 원본 그대로 -> 이렇게 되면, Computer의 데이터 멤버가 private이여도 괜찮다
						"\nScreenSize: " + screenSize + 
						"\nWeight: " + weight;
		
		return result;
	}
	
	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "15", 4, 1000, 3.2, 15, 1.2);
		
		System.out.println(test.computerPower());
		System.out.println(test.toString());  // 이건 Computer안에 있는 것이라 Notebook의 모든걸 프린트하지 못함

		// Computer: super, Notebook: sub
		// ** 변수의 type과 실제 저장/참조하는 type이 동일해야하지만, 이는 예외 -> 다형성
		// ** 이 다향성은 오로지 super/sub class 사이에서만 가능
		// super class타입의 변수가 sub class 타입의 객체 주소 참조 가능
		// 역은 불가능
		Computer computer = new Notebook("Dell", "15", 4, 1000, 3.2, 15, 1.2);  // 가능
		// 불가능 : Notebook notebook = new Computer("Dell", "15", 4, 1000, 3.2, 15, 1.2);
		
		// Notebook, Computer 둘다 toString()가지고 있음 -> 여기서는 Notebook클래스의 toString()실행
		// -> 동적바인딩
		System.out.println(computer.toString());
		
		
	}
	
	
}
