package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {
	public static void main(String[] args) {
        String a = "Hello world";
        String b = new String("Hello world");
        
        // ==은 두개의 데이터 타입이 동일한지 확인
        System.out.println(a == b);  // false
        
        //.equals는 문자와 문자 비교
        System.out.println(a.equals(b));  // true
    }
}
