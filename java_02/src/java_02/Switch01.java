package java_02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수 입력받기
		System.out.print("메뉴 입력(1-한식 2-중식 3-분식 기타-일식):");
		int menu = sc.nextInt();
		
		final int KOREA = 1;
		final int CHINA = 2;
		final int SNACKBAR = 3;
		
		switch(menu) {
		case KOREA:
			System.out.println("한식");
			break;
		case CHINA:
			System.out.println("중식");
			break;
		case SNACKBAR:
			System.out.println("분식");
			break;
		default:
			System.out.println("일식");
			break;
		}
		sc.close();

	}

}
