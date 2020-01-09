package java_02;

import java.util.Scanner;

public class ConsoleInput {
	public static void main(String[] args) {
		//이름과 나이를 입력받아서 출력하기
		Scanner sc = new Scanner(System.in);
		//이름을 입력 받기
		System.out.print("이름 입력:");
		String name = sc.nextLine();
		//나이를 입력받기
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		
		//출력
		System.out.println("이름은" + name + "나이는" + age);
		
		sc.close();
		
		
	}

}
