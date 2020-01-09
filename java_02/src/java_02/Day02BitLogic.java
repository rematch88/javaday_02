package java_02;

public class Day02BitLogic {

	public static void main(String[] args) {
		int a = 20; //00000000 00000000 00000000 00010100
		int b = 13; //00000000 00000000 00000000 00001101 

		//2개 모두 1인 경우에만 1
		System.out.println("a&b:" + (a&b)); // 결과는 100 -> 4
		
		//2개 모두 0인 경우에만 0 나머지 경우는 1
		System.out.println("a|b:" + (a|b)); // 결과는 11101 -> 29
		
		//2개 같은 경우는 0 다른 경우는 1
		System.out.println("a^b:" + (a^b)); // 결과는 11001 -> 25

	}

}
