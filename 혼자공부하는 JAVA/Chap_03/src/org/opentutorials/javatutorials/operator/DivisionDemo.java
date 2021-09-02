package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
        float d = 3.0F;
        
        System.out.println(a/b);  // int(정수)/int(정수): 3 (소수점 버림)
        System.out.println(c/d);  // float(실수)/float(실수): 3.33333
        System.out.println(a/d);  // int(정수)/float(실수) -> 형변환: 더 큰 것으로 자동 형변환하므로 정수가 실수가 됨: 3.33333  
	}
}
