package roundF2018;

import java.util.*;
import java.io.*;
import java.math.*;

public class ProblemA_small {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); 

        for (int r = 1; r <= t; ++r) {
            int l = in.nextInt();
            String a = in.next();
            String b = in.next();
            char[] aList = a.toCharArray();
            char[] bList = b.toCharArray();
            int count = 0;
            for (int i = 0; i<l; i++) {
            	for (int j = i; j<l;j++) {
            		
            		// get part of the array
            		char[] tempA = Arrays.copyOfRange(aList, i, j+1);
            		Arrays.sort(tempA);
            		String stringA = new String(tempA).trim();
            		K: for (int k = 0; k < l - j + i; k++) {
            			char[] tempB = Arrays.copyOfRange(bList, k, j-i+k+1);
            			Arrays.sort(tempB);
            			String stringB = new String(tempB).trim();
            			if(stringA.equals(stringB)) {
            				count++;
            				break K;
            			}
            		}
            	}
            }
            System.out.println("Case #" + r + ": " + count);
          }
    }

}
