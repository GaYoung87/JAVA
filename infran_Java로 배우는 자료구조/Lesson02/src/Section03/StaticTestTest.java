package Section03;

import jdk.incubator.vector.VectorOperators.Test;

public class StaticTestTest {
	
	public static void main(String[] args) {
		
		// t, print2�� ��ü�� ������� �Ŀ� ȣ��
		StaticTest test1 = new StaticTest();
		test1.t = 10;
		test1.print2();  // s, t�̾Ƴ��Ƿ� s�� ��� �������� 0 ���
		
		// s, print1�� �ٷ� ȣ��
		StaticTest.s = 1000;
		StaticTest.print1();
		
		test1.s = 88;  // ��� s�� class�� �ִ� �������̹Ƿ� s�� �ѹ� �ٲ�� �ٲ�ä�� �ٸ� ������ ��
		StaticTest.print1();
		
		StaticTest test2 = new StaticTest();
		test2.t = 7;
		test2.print2();
		StaticTest.print1();  // �ùٸ� ���
		test2.print1();
	}

}
