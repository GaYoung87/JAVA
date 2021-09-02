
public class VariableScope {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		System.out.println(v2);
		}
		
		// int v3 = v1 + v2 + 5;   // 이때 v2에 빨간줄이 생기는 이유?
								// v2변수는 로컬변수라 v2변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}

}
