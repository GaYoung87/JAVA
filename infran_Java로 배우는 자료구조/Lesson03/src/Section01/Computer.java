package Section01;

public class Computer {

	// 데이타 멤버는 public을 쓰는게 그렇게 좋은 방법이 아님 -> private로 두자
	// private로 바꾸면 Notebook의 toString()에서 사용불가
	// protected는 자식클래스에서는 엑세스 가능
	// Notebook에서 super.toString()을 사용했기 때문에 private이여도 에러안남
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
	
	// public이 아닌 private int ramSize인 경우 작성
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
