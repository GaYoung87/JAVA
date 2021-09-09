package Section03;

import jdk.incubator.vector.VectorOperators.Test;

public class StaticTestTest {
	
	public static void main(String[] args) {
		
		// t, print2는 객체를 만들어준 후에 호출
		StaticTest test1 = new StaticTest();
		test1.t = 10;
		test1.print2();  // s, t뽑아내므로 s의 경우 기존값인 0 출력
		
		// s, print1은 바로 호출
		StaticTest.s = 1000;
		StaticTest.print1();
		
		test1.s = 88;  // 어떻든 s는 class에 있는 실제값이므로 s가 한번 바뀌면 바뀐채로 다른 곳으로 감
		StaticTest.print1();
		
		StaticTest test2 = new StaticTest();
		test2.t = 7;
		test2.print2();
		StaticTest.print1();  // 올바른 방법
		test2.print1();
	}

}
