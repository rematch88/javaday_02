package java_02;

public class Day02ConditionLogic {

	public static void main(String[] args) {
		int a = 10;
		//a>5 true && a++ > 10
		boolean result = a > 5 && (a++ > 10);
		System.out.println("결과:"+ result);
		System.out.println("a:"+ a);
		
		//a<5 false
		//앞의 문자이 거짓이어서 뒤의 문장을 수행하지 않기 때문에 a의 값은 증가하지 않음
		result = a < 5 && (a++ > 10);
		System.out.println("결과:"+ result);
		System.out.println("a:"+ a);

	}

}
