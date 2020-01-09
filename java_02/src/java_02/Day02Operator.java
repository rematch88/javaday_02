package java_02;

public class Day02Operator {

	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println("a:" + a); //11출력
		
		//a가 11인 상태에서 명령에 먼저 사용하고 1증가
		//11이 출력되고 a는 12가 됩니다.
		System.out.println("a:" + (a++)); //11이 출력되고 12
		
		//a를 먼저 증가시켜서 13을 만들고 명령에 사용
		System.out.println("a:" + (++a)); //13

		a = 0;
		int result = ++a + ++a;
		System.out.println("result:" +result); //3이 출력됨 a가 0에서 ++a는 1이되고 뒤의 ++a는 2

	}

}
