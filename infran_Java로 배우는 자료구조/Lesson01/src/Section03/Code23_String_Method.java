package Section03;

public class Code23_String_Method {

	public static void main(String[] args) {
		// StringŬ���� �⺻ �޼���
		// ���ڿ� ���ϼ� �˻�
		String str1 = "java";
		String str2 = "Java";
		boolean equals = str1.equals(str2);
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);

		// ���ڿ� ������ ����
		String str3 = "absolute";
		String str4 = "base";
		int result = str3.compareTo(str4);  // > = < 0

		// ���ڿ� ����
		String str5 = "abcdefg";
		int length = str5.length();  // 6

		// Ư�� ��ġ�� ����
		String str6 = "ABCDEF";
		char ch = str6.charAt(2);  // C

		// ������ ������ ��ġ �˻�
		String str7 = "abcdefg";
		int index = str7.indexOf("d");  // 3 // index=-1�̸� �׷� ���� ����

		// ������ ������ �κ� ���ڿ�
		String str8 = "ABCDEF";
		String substr = str8.substring(0, 2);  // (0, 2) -> [0, 2) -> 0~1: AB

	}

}
