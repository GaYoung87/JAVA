package org.opentutorials.javatutorials.condition;

// switch: 조건이 많다면 switch문이 로직을 보다 명료하게 보여줄 수 있다.
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

// switch 뒤의 괄호에 숫자로 1이 주어지면 case 1에 해당하는 로직 이후의 모든 case들이 실행
// System.out.println(); 밑에 break가 있다면
// switch(1)
// one
// switch(2)
// two
// switch(3)
// three
// 이렇게 나옴