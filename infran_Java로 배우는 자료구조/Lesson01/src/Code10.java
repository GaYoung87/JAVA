
public class Code10 {

	public static void main(String[] args) {
		// 1 ~ 100000사이의 모든 소수를 출력하는 프로그램
		for (int n = 2; n <= 100000; n++) {
			
			boolean isPrime = true;
			for (int i = 2; i <= n/2 && isPrime; i++) {  // 루트n보다 작은것만 돌아도 ok
				if (n % i == 0)
					isPrime = false;
			}
			
			if (isPrime)
				System.out.println(n);
		}
	}

}
