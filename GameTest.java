package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	int flag = 0;// 승패 저장
	int Non = 0;// 무승부
	int player = 0;
	int a = (int) (Math.random() * 3) + 1;// 랜덤숫자

	public int Winlose(String ABC) {

		switch (ABC) {
		case "가위":
			player = 1;
			break;
		case "바위":
			player = 2;
			break;
		case "보":
			player = 3;
			break;
		default:
			break;
		}
		
		
		
		switch(player) {
		case 1:
			switch (a) {
			case 1:
				System.out.println("비겼습니다!!!");
				Non++;
				break;
			case 2:
				System.out.println("졌습니다!!!");
				break;
			case 3:
				System.out.println("이겼습니다!!!");
				flag++;
				break;
				default:
					break;
			}
			
		case 2:
			switch (a) {
			case 1:
				System.out.println("이겼습니다!!!");
				flag++;
				break;
			case 2:
				System.out.println("비겼니다!!!");
				Non++;
				break;
			case 3:
				System.out.println("졌겼습니다!!!");
				break;
				default:
					break;
			}
			
		case 3:
			switch (a) {
			case 1:
				System.out.println("졌습니다!!!");
				break;
			case 2:
				System.out.println("이겼습니다!!!");
				flag++;
				break;
			case 3:
				System.out.println("비겼습니다!!!");
				Non++;
				break;
				default:
					break;
			}
			
			
			
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.random() * 3) + 1;// 랜덤

		Scanner scan = new Scanner(System.in);
		GameTest g;
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");

		System.out.println("번호를 입력하세요.");
		int Num = scan.nextInt();

		// String RCP = scan.next();

		switch (Num) {
		case 1:
			for (int i = 0; i < 5; i++) {// 5판
				System.out.println("가위바위보 중 한 입력: ");
				String RCP = scan.next();
				
				Winlose(RCP);

			}
			break;

		case 2:
			for (int i = 0; i < 5; i++) {// 3판
				System.out.println("가위바위보 중 한 입력: ");
				String RCP = scan.next();
			}
			break;
		case 3:
			for (int i = 0; i < 5; i++) {// 단판
				System.out.println("가위바위보 중 한 입력: ");
				String RCP = scan.next();
			}
			break;

		default:
			break;
		}

		System.out.println("가위바위보 중 한 입력: ");
		String RCP = scan.next();

	}

}
