package Section01;

public class Notebook extends Computer {  // ��� �����͸��+�޼��� -> ���
	
	// �Ѵ��� ��Ʈ���� ǥ���ϴ� class �߰�
	// Notebook -> Computer + screen size, weight

	// �߰� �����͸���� �ۼ�
	private double screenSize;
	private double weight;

	// super class�� ������ �� �Ű����� ����Ʈ�� ��ġ�ϴ� ������ ȣ��
	// super()�� ȣ���� ��� �ݵ�� ������ ������ ù�����̾����
	// ������: Ŭ������ �ʱⰪ�� �Ű������� �޾� �� �ʱ�
	// ���� ���⿡�� super�� ���� �ʴ´ٸ�, no-parameter������ ȣ��
	//  -> Computer���� no-parameter������ ����(�Ű����� �޴� �����ڴ� ������, no-parameter�����ڴ� ����)
	public Notebook(String manufacturer, String processor, int ramSize, int diskSize, 
			double processorSpeed, double screenSize, double weight) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		// Computer�����ڿ��� ��������ϱ� this.manufacturer = manufacturer; �����ʿ����
		this.screenSize = screenSize;
		this.weight = weight;
	}

	// method overriding: Computer�� toString()�� ������, Notebook�� �ٽ� �ۼ��ϴ� ��
	public String toString() {
		// Computer�� ������ ����� private�̸� ���⼭ ����� �� ����-> ��ӹ����žƴѰ�?
		// ��Ģ : �θ��ڽ� ���̿��� private�̸� ������ ��
		String result = super.toString() + // �θ� ���� �״�� -> �̷��� �Ǹ�, Computer�� ������ ����� private�̿��� ������
						"\nScreenSize: " + screenSize + 
						"\nWeight: " + weight;
		
		return result;
	}
	
	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "15", 4, 1000, 3.2, 15, 1.2);
		
		System.out.println(test.computerPower());
		System.out.println(test.toString());  // �̰� Computer�ȿ� �ִ� ���̶� Notebook�� ���� ����Ʈ���� ����

		// Computer: super, Notebook: sub
		// ** ������ type�� ���� ����/�����ϴ� type�� �����ؾ�������, �̴� ���� -> ������
		// ** �� ���⼺�� ������ super/sub class ���̿����� ����
		// super classŸ���� ������ sub class Ÿ���� ��ü �ּ� ���� ����
		// ���� �Ұ���
		Computer computer = new Notebook("Dell", "15", 4, 1000, 3.2, 15, 1.2);  // ����
		// �Ұ��� : Notebook notebook = new Computer("Dell", "15", 4, 1000, 3.2, 15, 1.2);
		
		// Notebook, Computer �Ѵ� toString()������ ���� -> ���⼭�� NotebookŬ������ toString()����
		// -> �������ε�
		System.out.println(computer.toString());
		
		
	}
	
	
}
