package roundG2018;

import java.util.*;
import java.io.*;
import java.math.*;

public class ProblemC_small {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); 
        
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int m = in.nextInt();
            int e= in.nextInt();
            int sr= in.nextInt()-1;
            int sc= in.nextInt()-1;
            int tr= in.nextInt()-1;
            int tc= in.nextInt()-1;
            int[][] map = new int [n][m];
            for (int j = 0;i<n;i++) {
            	for (int k = 0;k<m;k++) {
            		map[j][k]=in.nextInt();
            	}
            }
            e = energy(sr,sc,n,m,tr,tc,e,map);
            if(e>=0)
            	System.out.println("Case #" + i + ": " + e);
            else
            	System.out.println("Case #" + i + ": " + "-1");
          }
    }
    
    public static int energy(int sr, int sc,int n, int m, int r, int c, int e, int[][] map) {
    	if(r==sr&&c==sc) {
    		return e;
    	}
    	if(r==0&&c==0) {
    		int temp = map[r][c];
    		map[r][c]=0;
    		return temp+Math.max(energy(sr,sc,n,m,r+1,c,e,map),energy(sr,sc,n,m,r,c+1,e,map));
    	}
    	else if(r==n-1&&c==m-1) {
    		int temp = map[r][c];
    		map[r][c]=0;
    		return temp+Math.max(energy(sr,sc,n,m,r-1,c,e,map),energy(sr,sc,n,m,r,c-1,e,map));
    	}
    	else if(r==0&&c>0&&c<m-1) {
    		int temp = map[r][c];
    		map[r][c]=0;
    		return temp+Math.max(energy(sr,sc,n,m,r,c-1,e,map),energy(sr,sc,n,m,r,c+1,e,map));
    	}
    	else if(c==0&&r>0&&r<n-1) {
    		int temp = map[r][c];
    		map[r][c]=0;
    		return temp+Math.max(energy(sr,sc,n,m,r-1,c,e,map),energy(sr,sc,n,m,r+1,c,e,map));
    	} else {
    		int temp = map[r][c];
    		map[r][c]=0;
    		int temp1 = Math.max(energy(sr,sc,n,m,r-1,c,e,map),energy(sr,sc,n,m,r,c-1,e,map));
    		int temp2 = Math.max(energy(sr,sc,n,m,r+1,c,e,map),energy(sr,sc,n,m,r,c+1,e,map));
    		return temp+Math.max(temp1, temp2);
    	}
    }

}
