import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// String str = "Hello world";
		String str = "Hello";
		String input = null;  // �⺻���� �־��ִ� ��
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		
		input = keyboard.next();  // next�� �Է��� ù��° �ܾ �ν�
		// str = "Hello world"�ϸ� ��Ե� str == input �� �� ����
		
		// ==�����ڴ� ������Ƽ��Ÿ�Ը� ��밡��! -> String���Ұ�
		// ������Ƽ�� Ÿ��: byte, short, int, long, float, double, char, boolean
		if (str.equals(input)) {  // input.equals(str)�� ����
			System.out.print("Strings match! :-)");
		} else {
			System.out.print("Strings do not match! :-(");
		}
		
		keyboard.close();
	}

}
