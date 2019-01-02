package com.ssafy.java;

public class DigitTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for (int i = 0; i < 6; i++) {

			// for (int j = 0; j < 5; j++) {

			switch (i) {
			case 1:
				System.out.print(" ");
				for (int j = 0; j < 5; j++) {
					System.out.print(num + "    ");
					num++;
				}
				System.out.print("\n");
				break;

			case 2:
				System.out.print("      ");
				for (int j = 0; j < 3; j++) {
					System.out.print(num + "    ");
					num++;
				}
				System.out.print("\n");
				break;

			case 3:
				System.out.print("           ");
				System.out.print(num + "   ");
				num++;
				System.out.print("\n");
				break;

			case 4:
				System.out.print("     ");
				for (int j = 0; j < 3; j++) {
					System.out.print(num + "   ");
					num++;
				}
				System.out.print("\n");
				break;

			case 5:
				for (int j = 0; j < 5; j++) {
					System.out.print(num + "   ");
					num++;
				}
				System.out.print("\n");
				break;

			default:
				break;
			}

		}

	}

}
