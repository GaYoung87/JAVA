package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {
	public static void main(String[] args) {
        String a = "Hello world";
        String b = new String("Hello world");
        
        // ==�� �ΰ��� ������ Ÿ���� �������� Ȯ��
        System.out.println(a == b);  // false
        
        //.equals�� ���ڿ� ���� ��
        System.out.println(a.equals(b));  // true
    }
}
