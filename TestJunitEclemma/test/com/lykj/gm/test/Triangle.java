package com.lykj.gm.test;

public class Triangle {

	public String testTriangleTyle(int a, int b, int c) {
		
		String s = "";
		
		if (a > 0 && b > 0 && c > 0) {
			
			if ((a + b > c) && (a + c > b) && (b + c) > a) {
				
				if ((a == b) || (a == c) || (b == c)) {
					
					if ((a == b) && (b == c)) {
						s = "这是等边三角形";
					} else {
						s = "这是等腰三角形";
					}
				} else {
					s = "这是不等边三角形";
				}
			} else {
				s = "不能构成三角形";
			}
		} else {
			s = "不能构成三角形";
		}
		
		return s;
	}
}
