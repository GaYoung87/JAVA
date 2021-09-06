package Section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {

	// 수정부분1.
	// static Person01 [] members;
	static Person01 [] members = new Person01 [100];  // 각각의 칸들도 참조변수
	static int count = 0;
	
	public static void main(String[] args) {
		// data.txt로부터 사람들의 이름과 전화번호를 입력받아 배열 members에 저장
		// 이후 입력된 순서대로 출력하라고 한다. 
		// 이 코드에서 잘못된 점들을 찾아 수정하라
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while (in.hasNext()) {
				String str1 = in.next();
				String str2 = in.next();
				
				// 수정부분2.
				// 각각의 칸도 참조변수이므로 Person01()객체 필요
				members[count] = new Person01();  // members[count] 마다의 새로운 객체 필요
				
				members[count].name = str1;
				members[count].number = str2;
				
				count++;
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists.");
			System.exit(1);
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(members[i].name + "'s phone number is " + members[i].number);
		}

	}

}
