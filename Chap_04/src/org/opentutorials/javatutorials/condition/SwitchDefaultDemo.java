package org.opentutorials.javatutorials.condition;
 
public class SwitchDefaultDemo{
 
    public static void main(String[] args) {
         
        System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(4)");
        switch(4){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
 
    }
 
}

// switch���� ���ѵ� ������ Ÿ�Ը� ��밡�� : byte, short, char, int, enum, String, Character, Byte, Short, Integer

// �־��� ���̽��� ���� ��� default���� �����
// switch(1)
// one
// switch(2)
// two
// switch(3)
// three
// switch(4)
// default