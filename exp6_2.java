//class name exp6_2

import java.util.*;

public class exp6_2 {

    //multiplication of matrix
    public static void main (String args[]){
        int a,b,c,d,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Welcome to the matrix Multiplication program:");
        System.out.println(" ");
        System.out.println("Enter the number of rows for first matrix");
        a=sc.nextInt();
        System.out.println("Enter the number of columns for first matrix");
        b=sc.nextInt();
        int m1[][]=new int [a][b];
        System.out.println("Enter the elements of first matrix");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
            System.out.print("Element"+i+""+j+":");  
            m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows for second matrix");
        c=sc.nextInt();
        System.out.println("Enter the number of columns for second matrix");
        d=sc.nextInt();
        int m2[][]= new int[c][d];
        System.out.println("Enter the elements of second matrix");
        for(int i=0; i<c; i++){
            for(int j=0; j<d; j++){
             System.out.print("Element"+i+""+j+":"); 
            m2[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Entered matrix 1 is: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
           System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Entered matrix 2 is: ");
        for(int i=0; i<c; i++){
            for(int j=0; j<d; j++){
           System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        int result[][] =new int [b][c]; 
        System.out.println("Multipication of entered matrix:");
        for(int i=0; i<a; i++){
            for(int j=0; j<d; j++){
                for(int k=0; k<b; k++){
                 sum=sum+m1[i][k]*m2[k][j];
                }
                result[i][j]=sum;
                sum=0;
            }
        } 

        for(int i=0; i<a; i++){
            for(int j=0; j<d; j++){
           System.out.print(result[i][j]+" ");
            }
            System.out.println();
          }
        }
    }
