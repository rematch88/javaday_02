package java_02;

public class Day02 {
	//자바 애플리케이션의 시작 메소드
	public static void main(String[] args) {
		//short에 32767보다 큰 숫자는 그냥은 저장 안 됨
		//강제 형 변환을 통해서만 저장 됨
		//16비트 앞쪽의 비트는 짤리게 됨 - Overflow
		//가장 작은 숫자부터 다시 시작 - 음수가 저장됨
		short s = (short)32768;
		
		//저장된 데이터를 출력
		System.out.println("s:"+s);

	}

}
