package utile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
	public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
       
        set.add(n);
        int n1 = 0, n2 = n, n3, count;
        String s;
        do {
            set.add(n2);
            s = Integer.toString(n2);
            n1 = 0;
            for (int i = 0; i < s.length(); i++) {
                n3 = Integer.valueOf(s.charAt(i) + "");
                n1 += (n3*n3);
            }
            if (n1 == 1) {
                return true;
            }
            n2 = n1;
            System.out.println(n2);
        }while (!set.contains(n1));
        return false;
    }
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
