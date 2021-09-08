package Section02;

import Section01.Polynomial;
import Section02.Term2;

public class Polynomial2 {

	public char name;  // 다항식의 이름: f, g ..
	public int nTerms;  // 다항식을 구성하는 항의 개수
	public Term2 [] terms;  // 다항식을 구성하는 항들을 저장할 배열


	// 함수에 항 더해줌
	public void addTerm(int c, int e) {
		// 다항식에 새로운 항 추가할 때 차수가 e인 항이 있으면 계수값 더해주기
		// 차수가 e인 항이 없으면 넣어주기

		// 차수가 e인 항이 있는지 확인
		int index = findTerm(e);

		if (index != -1) {  // 기존에 차수가 e인 항이 있다면, 값을 더해주기
			terms[index].coef += c;

		} else {  // 기존에 차수가 e인 항이 없을 때 차수 순대로 나열(insert의 문제)

			// polynomial: polys의 칸 중 하나의 칸으로 들어옴
			int i = nTerms - 1;  

			// 정렬(insert)
			while (i >= 0 && terms[i].exp < 0) {
				terms[i+1] = terms[i];
				i--;
			}

			// 함수name : _ _ _ _ -> 각각 하나의 Term 타입을가지고있음
			terms[i+1] = new Term2();
			terms[i+1].coef = c;
			terms[i+1].exp = e;
			nTerms++;
		}


	}

	// e차 항이 있는지 없는지 확인
	public int findTerm(int e) {
		// 항의 차수가 e보다 작아졌다면, 뒤에거는 볼 필요없음 -> 차수대로 정렬되어있기 때문
		for (int i = 0; i < nTerms; i++) {  // 처음부터 전부 확인
			if (terms[i].exp == e) {
				return i;  // 항 있으면
			}
		}
		return -1; // 항 없으면
	}

	public int calcPolynomial(int x) {
		int result = 0;
		for (int i = 0; i < nTerms; i++) {
			result += terms[i].calcTerm(x);
		}
		return result;
	}

	public void printPolynomial() {

		for (int i = 0; i < nTerms; i++) {
			terms[i].printTerm();
			System.out.print(" + ");
		}
		System.out.println();
	}

}
