package roundG2018;

import java.util.*;
import java.io.*;
import java.math.*;

public class ProblemA_small {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); 
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int [] list = new int [n];
            for(int j = 0;j<n;j++) {
            	list[j]=in.nextInt();
            }
            int count = 0;
            Arrays.sort(list);
            for(int k =0;k<n-2;k++) {
            	for(int l=k+1;l<n-1;l++) {
            		for(int m=l+1;m<n;m++) {
            			BigInteger bl = BigInteger.valueOf(list[l]);
            			BigInteger bk = BigInteger.valueOf(list[k]);
            			BigInteger bm = BigInteger.valueOf(list[m]);
            			
            			if(bl.equals(bk.multiply(bm)) || bk.equals(bl.multiply(bm)) || bm.equals(bk.multiply(bl))) {
            				count++;
            			}
            		}
            	}
            }
            System.out.println("Case #" + i + ": " + count);
          }
    }
}
