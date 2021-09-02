package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {
	public static void main(String[] args) {
        if (true && true) {
            System.out.println(1);
        }
        
        if (true && false) {
            System.out.println(2);
        }
 
        if (false && true) {
            System.out.println(3);
        }
 
        if (false && false) {
            System.out.println(4);
        }
 
    }
}

// && = And -> true && true만 참, 둘중 하나라도 false면 false -> 위 예시에서 false는 실행되지 않음
