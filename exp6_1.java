// class name exp6_1

import java.util.*;

public class exp6_1 {
    public static void main(String[] args) {
        System.out.println("For matrix A");
        System.out.println("Enter the number of rows.");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the number of column.");
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];
        System.out.println("Enter the elements of A");
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.println("a" + i+ j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("For matrix B");
        System.out.println("Enter the number of rows.");
        
        int p = sc.nextInt();
        System.out.println("Enter the number of column.");
        int q = sc.nextInt();
        
        int b[][] = new int[p][q];
        System.out.println("Enter the elements of B");
        for(int i = 0; i<p; i++){
            for(int j = 0; j<q; j++){
                System.out.println("b" + i+ j);
                b[i][j] = sc.nextInt();
            }
        }
        if(r == p && c == q){
            System.out.println("The resultant matrix is:");
            int d[][] = new int[r][c];
            for(int i = 0; i<r; i++){
                for(int j =0; j<c; j++){
                    d[i][j] = a[i][j] + b[i][j];
                    System.out.print(" "+ d[i][j]);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("matrix addition is not possible.");
        }
    }
    
}

