package Section03;

public class StaticTest {

	// static     ����� class�� ��� 
	//         -> ���⿡�� staic ���� �ֵ��� ��ü
	// non-static ����� object�� ���(StaticTest��� ��ü �ȿ� �����ϴ� ��)
	//         -> StaticTest test1 = new StaticTest(); �ؼ�
	//            test1�̶�� �ڽ� �ȿ� ���ִ� ��
	
	public static int s = 0; // s�� StaticTest test = new StaticTest()�� ������ ����
	public int t = 0;
	
	public static void print1() {
		System.out.println("s = " + s);
		// ���⿡ t�� ���� ����!! -> t�� �������� ����
		// System.out.println("t = " + t);
		
	}
	
	public void print2() {
		// ��ü �ȿ� �����ϴ� print2�� ������ s�� ����
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
