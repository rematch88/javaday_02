package java_02;

public class Day02Literal {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 11;
		//a와 b는 동일한 데이터를 저장했기 때문에 해시코드가 동일
		//c는 다른 데이터를 저장했기 때문에 다른 해시코드를 출력
		System.out.println("a:"+ System.identityHashCode(a));
		System.out.println("b:"+ System.identityHashCode(b));
		System.out.println("c:"+ System.identityHashCode(c));

		int age = 20;
		double height = 176.53;
		System.out.printf("나이는 %d 키는 %.1f 입니다.", age, height);

	}

}
