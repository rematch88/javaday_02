package java_02;

import java.util.Scanner;

public class Condition2 {
	public static void main(String[] args) {
		//키보드로부터 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		//정수 입력받기
		System.out.print("점수입력:");
		int score = sc.nextInt();
		
		//정수가 60이상이면 합격 아니면 불합격 이라고 출력
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		sc.close();
	
	}
}
