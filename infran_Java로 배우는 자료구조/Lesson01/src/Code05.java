
public class Code05 {

	public static void main(String[] args) {
		
		// declare the array: ���� �迭 ����
		int [] grades;
		
		// allocate memory for 5 indices
		// ���� �迭�� ��������� ����
		grades = new int[5];
		
		// �ѹ��� ǥ��
		// int [] grades = = new int[5];
		
		// assign some values to the array
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
//		// print out each value
//		System.out.println(grades);
//		System.out.println(grades[0]);
//		System.out.println(grades[1]);
//		System.out.println(grades[2]);
//		System.out.println(grades[3]);
//		System.out.println(grades[4]);
//		
		// for������ �����ϰ� ǥ��
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Grade" + (i+1) + ": " + grades[i]);
		}
		
		// while������ ǥ��
		int idx = 0;
		
		while (idx < grades.length) {
			System.out.println("Grade" + (idx+1) + ": " + grades[idx]);
			idx++;
		}

	}

}
