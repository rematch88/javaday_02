package java_02;

public class Day02ModPattern {

	public static void main(String[] args) {
		//빨강, 파랑, 노랑을 순서대로 1초마다 출력
		
		int i = 0;
		for(;;) {
			try {
				i = i % 3;
				if(i==0)
					System.out.println("빨강");
				else if(i==1)
					System.out.println("파랑");
				else
					System.out.println("노랑");
				i++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
