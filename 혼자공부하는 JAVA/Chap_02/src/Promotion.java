// 자동 타입 변환: 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 발생
// 크기별로 타입 정리: bype(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class Promotion {
	public static void main(String[] args) {
		// 자동 변환
		byte byteValue = 10;
		int intValue = byteValue;  // byte -> int: 자동 타입 변환 발생
		System.out.println(intValue);  // 10
		
		int intVal = 200;
		double doubleVal = intVal;  // int -> double
		System.out.println(doubleVal);  // 200.0
		
		char charValue = '가';
		intValue = charValue;  // char -> int
		System.out.println("가의 유니코드=" + intValue);  // 가의 유니코드=44032
		
		intValue = 500;
		long longValue = intValue;  // int -> long
		System.out.println(longValue);  // 500	
		
	}
}
