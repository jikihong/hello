package com.ssafy.java;

public class DigitTest1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (j < i)
					System.out.print("   ");
				else if(num>9) {
					System.out.print(num + " ");
					num++;
				}
				else {
					System.out.print(num + "  ");
					num++;
				}

			}
			System.out.println("");
		}

	}

}

