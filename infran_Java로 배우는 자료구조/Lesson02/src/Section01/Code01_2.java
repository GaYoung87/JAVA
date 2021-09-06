package Section01;

public class Code01_2 {

	public static void main(String[] args) {
		
		Person01 first = new Person01();  // new Person01(): �̸� ���� ��ü(=A) -> ������ ����Ǵ� ��
		// Person01 first: �������� ����(��ü�� �ּ� ����) -> ������ Person01()�� ��ü ����
		
		first.name = "John";
		first.number = "010-4561-5306";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);

		Person01 second = first;  // second�� first�ּ� ���� -> �̸����� ��ü(=A) �ּ� ����
		                          // ��ü�� �ϳ�, first, second �� �� ������ ��ü ���� 
		second.name = "Alice";
		
		// first, second�� ���� ��ü�� �����ϱ� ������ second�� ����������, first�� ������
		System.out.println("Name: " + first.name + ", Number: " + first.number);

		// System.out.println("Name: " + second.name + ", Number: " + second.number);

	
		Person01 [] members = new Person01 [1000];  // �迭 members�� Ÿ�� = Person01
		// members = _ _ _ _ _ .. -> ������ _�� Person01 Ÿ���� ����������
		//                        -> ������ _�� ��������
		members[0] = first;
		members[1] = second;
		
		System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
		
		
		// Error��
		// members[2].name = "Daviud";
		// members[2].number = "18245678912";
		members[2] = new Person01();
		members[2].name = "David";
		members[2].number = "18245678912";
		
	}

}
