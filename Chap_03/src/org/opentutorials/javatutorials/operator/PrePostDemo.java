package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
	public static void main(String[] args) {
        int i = 3;
        
        i++;  // i = i + 1
        
        System.out.println(i); // 4 출력
        
        ++i;
        
        System.out.println(i); // 5
        System.out.println(++i); // 6 ->  i라는 변수에 1이라는 값을 더한 결과를 괄호안에 치환해서 그 결과를 println
        System.out.println(i++); // 6 -> 괄호 안에서 더해지는 것이 아니라, 이 문장이 끝나고 나면 i에 1을 더해라(값 반영안됨)
        System.out.println(i); // 7 -> 그래서 print(i)하면 값이 7이 나오는 것이다
    }
}
