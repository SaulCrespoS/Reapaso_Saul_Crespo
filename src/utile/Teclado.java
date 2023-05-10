package utile;

import java.util.Scanner;

public class Teclado {
	public Scanner s;
	
	Teclado() {
		s = new Scanner(System.in);
	}
	
	public int nextInt() {
		Scanner s =new Scanner(System.in);
		int n;
		try {
			n = Integer.valueOf(s.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid integer: Typing 0");
			n = 0;
		};
		s.close();
		return n;
	}
	
	public int nextInt(boolean retry) {
		Scanner s =new Scanner(System.in);
		int n;
		try {
			n = Integer.valueOf(s.nextLine());
		} catch (Exception e) {
			if (retry) {
				System.out.println("Invalid Integer: Try again.");
				nextInt(retry, 3);
			}
			System.out.println("Invalid integer: Typing 0");
			n = 0;
		};
		s.close();
		return n;
	}
	
	@SuppressWarnings("resource")
	public int nextInt(boolean retry, int num) {
		Scanner s =new Scanner(System.in);
		int n;
		try {
			n = Integer.valueOf(s.nextLine());
		} catch (Exception e) {
			if (retry) {
				if (num > 0) {
					System.out.println("Invalid Integer: Try again.");
					return nextInt(retry, num - 1);
				}
			}
			System.out.println("Invalid integer: Typing 0");
			n = 0;
		};
		s.close();
		return n;
	}
	
	public float nextFloat() {
		Scanner s =new Scanner(System.in);
		float n;
		try {
			n = Float.valueOf(s.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid float: Typing 0");
			n = 0;
		};
		s.close();
		return n;
	}
	
	public float nextFloat(boolean retry) {
		Scanner s =new Scanner(System.in);
		float n;
		try {
			n = Float.valueOf(s.nextLine());
		} catch (Exception e) {
			if (retry) {
				System.out.println("Invalid Integer: Try again.");
				nextFloat(retry, 3);
			}
			System.out.println("Invalid integer: Typing 0");
			n = 0;
		};
		s.close();
		return n;
	}
	
	@SuppressWarnings("resource")
	public float nextFloat(boolean retry, int num) {
		Scanner s =new Scanner(System.in);
		float n;
		try {
			n = Integer.valueOf(s.nextLine());
		} catch (Exception e) {
			if (retry) {
				if (num > 0) {
					System.out.println("Invalid Float: Try again.");
					return nextFloat(retry, num - 1);
				}
			}
			System.out.println("Invalid Float: Typing 0");
			n = 0;
		};
		s.close();
		return n;
	}
	
	
	public void close() {
		s.close();
	}
}
