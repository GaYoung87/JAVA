package Section01;

public class Code01 {

	public static void main(String[] args) {
		
		int x;
		x = 100;
		
		double y = 1.0023;
		
		// Person01Ÿ���� ������ ����� a���ٰ� �̸��� ��ȭ��ȣ�� �����Ѵ�.
		// Person01 Ŭ������ �ϳ��� Ÿ���̴�.
		Person01 first;  // ������ Ÿ�� -> ����� ���� Ÿ��
		first = new Person01();  // ��ü
		
		first.name = "John";
		first.number = "010-4561-5306";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);

		Person01 [] members = new Person01 [100];
		members[0] = first;
		members[1] = new Person01();
		members[1].name = "David";
		members[1].number = "824-555-6456";
		
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);

		
	}

}
