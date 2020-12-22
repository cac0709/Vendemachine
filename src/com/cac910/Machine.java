package com.cac910;

import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		int c = 25;
		int total = 0;

		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("請投幣或購買商品 當前金額:" + total);
			String sc = s.next();
			if (sc.startsWith("a") == true) {
				total = total - a;
			} else if (sc.startsWith("b") == true) {
				total = total - b;
			} else if (sc.startsWith("c") == true) {
				total = total - c;
			} else {
				int co = Integer.parseInt(sc);
				total = total + co;
				  if(co == 0) {
					  System.out.println("退幣:" + total);
					  break;
				  }
			}
		
		}
	}
}
