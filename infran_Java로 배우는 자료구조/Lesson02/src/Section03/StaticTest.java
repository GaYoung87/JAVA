package Section03;

public class StaticTest {

	// static     멤버는 class의 멤버 
	//         -> 여기에서 staic 붙은 애들은 실체
	// non-static 멤버는 object의 멤버(StaticTest라는 객체 안에 존재하는 것)
	//         -> StaticTest test1 = new StaticTest(); 해서
	//            test1이라는 박스 안에 들어가있는 것
	
	public static int s = 0; // s는 StaticTest test = new StaticTest()에 속하지 않음
	public int t = 0;
	
	public static void print1() {
		System.out.println("s = " + s);
		// 여기에 t를 쓰면 오류!! -> t는 실존하지 않음
		// System.out.println("t = " + t);
		
	}
	
	public void print2() {
		// 객체 안에 존재하는 print2기 때문에 s는 존재
		System.out.println("s = " + s);
		System.out.println("t = " + t);
	}
	
	public static void main (String []args) {
		s = 100;
		// t = 100;
		print1();
		// print2();
		
		StaticTest test = new StaticTest();
		test.t = 100;
		test.print2();
	}
}
