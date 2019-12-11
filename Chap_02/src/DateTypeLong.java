
public class DateTypeLong {  // 수치가 큰 데이터를 다룬다면 필수!
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20;
//		long var3 = 100000000000000;  // 컴파일 에러 -> int 저장범위 넘음
		long var4 = 100000000000000L;  // long 타입 변수 초기화 -> 숫자 뒤에 L 필요
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
