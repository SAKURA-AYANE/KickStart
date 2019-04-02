package roundF2018;

import java.util.*;
import java.io.*;
import java.math.*;

public class ProblemB_small {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); 
        for (int i = 0; i < t; i++) {
        	int v = in.nextInt();
        	int e = in.nextInt();
        	String [] villageProduct = new String [v];
        	for(int j = 0; j<e; j++) {
        		villageProduct[in.nextInt()] = "Veg";
        		villageProduct[in.nextInt()] = "Fru";
        	}
        }
    }
}
