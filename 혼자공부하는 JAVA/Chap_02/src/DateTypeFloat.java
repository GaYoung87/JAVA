// 실수 타입 : float과 double은 int와 long의 크기와 같지만 더 큰 값 저장 가능
// + m * 10^n (m: 가수(0<=m<1), n: 지수)

// double: 1. 높은 정밀도로 계산 가능
//         2. 실수의 기본 타입 -> float + F
public class DateTypeFloat {
	public static void main(String[] args) {
		// 실수값 저장
		double var1 = 3.14;
		// float var2 = 3.14;  // Compile Error
		float var3 = 3.14F;
		
		// 정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		
		// JAVA는 "" 위주로 사용!
	    // ''사용하면 빨간 줄! 
		System.out.println("var1: " + var1);  // var1: 3.14
		System.out.println("var3: " + var3);  // var3: 3.14
		System.out.println("var4: " + var4);  // var4: 0.12345678901234568
		System.out.println("var5: " + var5);  // var5: 0.12345679
		// var4와 var5의 차이: double타입의 가수 bit수가 float타입의 가수 bit수보다 약 두배정도 큼
		
		
		// e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6: " + var6);  // var6: 3000000
		System.out.println("var7: " + var7);  // var7: 3000000.0
		System.out.println("var8: " + var8);  // var7: 3000000.0
		System.out.println("var9: " + var9);  // var9: 0.002
	}
}
