import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		
		int number = 123;
		
		// keyboard -> ���Ƿ� ���� ������
		// System.in : ǥ���Է�
		// �� import�ؾ��� �� �𸣴� ��� �ڵ��ۼ� �� Ŭ�� or Ctrl+Shifh+O
		Scanner keyboard = new Scanner(System.in);  // ���� �Է¹޴¹��
		
		System.out.print("Please enter an integer: ");
		
		int input = keyboard.nextInt();
		
		if (input == number) {
			System.out.print("Numbers match! :-)");
		} else {
			System.out.print("Numbers do not match! :-(");
		}
		
		// Scanner �����ϰ� �ݾ��ֱ� -> �ȴݾƵ� ���๮���¾�����
		keyboard.close();

	}

}
