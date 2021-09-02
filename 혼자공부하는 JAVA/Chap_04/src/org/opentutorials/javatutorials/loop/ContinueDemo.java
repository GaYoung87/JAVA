package org.opentutorials.javatutorials.loop;
 
public class ContinueDemo {
 
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
            	// continue는 실행을 즉시 중단하면서, 반복은 지속하게 한다.
                continue;
            System.out.println("Coding Everybody " + i);
        }
 
    }
 
}

// Coding Everybody 5일때가 없다! why? i == 5이면 continue이므로 print하지 않고 다음반복문으로 넘어감

// Coding Everybody 0
// Coding Everybody 1
// Coding Everybody 2
// Coding Everybody 3
// Coding Everybody 4
// Coding Everybody 6
// Coding Everybody 7
// Coding Everybody 8
// Coding Everybody 9