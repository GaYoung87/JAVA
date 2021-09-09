package Section01;

public class Computer {

	// ����Ÿ ����� public�� ���°� �׷��� ���� ����� �ƴ� -> private�� ����
	// private�� �ٲٸ� Notebook�� toString()���� ���Ұ�
	// protected�� �ڽ�Ŭ���������� ������ ����
	// Notebook���� super.toString()�� ����߱� ������ private�̿��� �����ȳ�
	protected String manufacturer;
	protected String processor;
	protected int ramSize;
	protected int diskSize;
	protected double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	
	public double computerPower() {
		return ramSize * processorSpeed;
	}
	
	// public�� �ƴ� private int ramSize�� ��� �ۼ�
	public int getRamSize() {
		return ramSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public int getDistSize() {
		return diskSize;
	}
	
	public String toString() {
		String result = "Manufacturer: " + manufacturer +
						"\nCPU: " + processor +
						"\nRAM: " + ramSize +
						"\nDisk: " + diskSize +
						"\nProcessor Speed: " + processorSpeed + "gigahertz";
		
		return result;
	}
	
	
}
