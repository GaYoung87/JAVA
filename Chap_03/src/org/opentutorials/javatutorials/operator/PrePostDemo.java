package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
	public static void main(String[] args) {
        int i = 3;
        
        i++;  // i = i + 1
        
        System.out.println(i); // 4 ���
        
        ++i;
        
        System.out.println(i); // 5
        System.out.println(++i); // 6 ->  i��� ������ 1�̶�� ���� ���� ����� ��ȣ�ȿ� ġȯ�ؼ� �� ����� println
        System.out.println(i++); // 6 -> ��ȣ �ȿ��� �������� ���� �ƴ϶�, �� ������ ������ ���� i�� 1�� ���ض�(�� �ݿ��ȵ�)
        System.out.println(i); // 7 -> �׷��� print(i)�ϸ� ���� 7�� ������ ���̴�
    }
}
