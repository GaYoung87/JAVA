package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
        float d = 3.0F;
        
        System.out.println(a/b);  // int(����)/int(����): 3 (�Ҽ��� ����)
        System.out.println(c/d);  // float(�Ǽ�)/float(�Ǽ�): 3.33333
        System.out.println(a/d);  // int(����)/float(�Ǽ�) -> ����ȯ: �� ū ������ �ڵ� ����ȯ�ϹǷ� ������ �Ǽ��� ��: 3.33333  
	}
}
