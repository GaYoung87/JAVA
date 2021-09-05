package org.opentutorials.javatutorials.condition;

// switch: ������ ���ٸ� switch���� ������ ���� ����ϰ� ������ �� �ִ�.
public class SwitchDemo {
	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(1) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
	}
}
// switch(1)
// one
// two
// three
// switch(2)
// two
// three
// switch(3)
// three

// switch ���� ��ȣ�� ���ڷ� 1�� �־����� case 1�� �ش��ϴ� ���� ������ ��� case���� ����
// System.out.println(); �ؿ� break�� �ִٸ�
// switch(1)
// one
// switch(2)
// two
// switch(3)
// three
// �̷��� ����