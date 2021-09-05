package Section03;

public class Code23_String_Method {

	public static void main(String[] args) {
		// String클래스 기본 메서드
		// 문자열 동일성 검사
		String str1 = "java";
		String str2 = "Java";
		boolean equals = str1.equals(str2);
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);

		// 문자열 사전식 순서
		String str3 = "absolute";
		String str4 = "base";
		int result = str3.compareTo(str4);  // > = < 0

		// 문자열 길이
		String str5 = "abcdefg";
		int length = str5.length();  // 6

		// 특정 위치의 문자
		String str6 = "ABCDEF";
		char ch = str6.charAt(2);  // C

		// 지정한 문자의 위치 검색
		String str7 = "abcdefg";
		int index = str7.indexOf("d");  // 3 // index=-1이면 그런 문자 없음

		// 지정된 범위의 부분 문자열
		String str8 = "ABCDEF";
		String substr = str8.substring(0, 2);  // (0, 2) -> [0, 2) -> 0~1: AB

	}

}
