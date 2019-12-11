
// 변수 선언과 초기화
public class Variable {
	// {}은 클래스 블록
	public static void main(String[] args) {
		// {}은 메소드 블록: 모든 변수는 메소드 블록 내에 존재한다(로컬 변수)
		// 로컬변수는 메소드 실행이 끝나면 메모리에서 자동으로 없어짐
		
		
		// 10을 변수 value의 초기값으로 저장
		int value = 10;
		
		// 변수 value값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		// 변수 result값을 읽고 콘솔에 출력
		System.out.println(result);
	}
}
