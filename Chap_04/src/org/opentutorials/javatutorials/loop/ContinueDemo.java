package org.opentutorials.javatutorials.loop;
 
public class ContinueDemo {
 
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
            	// continue�� ������ ��� �ߴ��ϸ鼭, �ݺ��� �����ϰ� �Ѵ�.
                continue;
            System.out.println("Coding Everybody " + i);
        }
 
    }
 
}

// Coding Everybody 5�϶��� ����! why? i == 5�̸� continue�̹Ƿ� print���� �ʰ� �����ݺ������� �Ѿ

// Coding Everybody 0
// Coding Everybody 1
// Coding Everybody 2
// Coding Everybody 3
// Coding Everybody 4
// Coding Everybody 6
// Coding Everybody 7
// Coding Everybody 8
// Coding Everybody 9