package java_02;

import java.util.Scanner;

public class Condition3 {
	public static void main(String[] args) {
		// 키보드로부터 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		// 정수 입력받기
		System.out.print("점수입력:");
		int score = sc.nextInt();

		// 점수가 90-100 사이면 A, 80-90미만이면 B
		// 점수가 70-80미만이면 C, 60-70미만이면 D		
		// 점수가 0-60미만이면 F 라고 출력
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score < 90){
			System.out.println("B");
		} else if(score >= 70 && score < 80){
			System.out.println("C");
		} else if(score >= 60 && score < 70){
			System.out.println("D");
		} else if(score >= 0 && score < 60){
			System.out.println("F");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		//else는 예외적인 상황 발생에 대한 처리를 해주는 것이 좋습니다.
		sc.close();
	}
}