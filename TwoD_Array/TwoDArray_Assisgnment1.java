package TwoD_Array;

import java.util.Scanner;

public class TwoDArray_Assisgnment1 {

	public static void main(String[] args) 
	{   
	int m, n, i, j;   
	Scanner sc=new Scanner(System.in);   
	System.out.print("Enter the number of rows for 1st matrix: ");   
	//taking row as input  
	m = sc.nextInt();   
	System.out.print("Enter the number of columns for 1st matrix: ");   
	//taking column as input  
	n = sc.nextInt();   
	
	int array[][] = new int[m][n];// Declaring the two-dimensional matrix   
	
	System.out.println("Enter the elements of the array for 1st matrix: ");// Read the matrix values      
	
	for (i = 0; i < m; i++)//for row   
	for (j = 0; j < n; j++) //for col  
	array[i][j] = sc.nextInt();   

	System.out.println("Elements of the array for 1st matrix: ");   
	for (i = 0; i < m; i++)   
	{   
	for (j = 0; j < n; j++)   
	//prints the array elements  
	System.out.print(array[i][j] + " ");   
	//throws the cursor to the next line  
	System.out.println();   
	}   
	
	
	//Taking inputs for 2nd array
	int r,s,k,l;
	System.out.print("Enter the number of rows for 2nd matrix: ");   
	//taking row as input  
	r = sc.nextInt();   
	System.out.print("Enter the number of columns for 2nd matrix: ");   
	//taking column as input  
	s = sc.nextInt();   
	
	int arr[][] = new int[r][s];// Declaring 2nd two-dimensional matrix   
	
	System.out.println("Enter the elements of the array for 2nd matrix: ");// Read the matrix values      
	
	for ( k = 0; k < r; k++)//for row   
	for ( l = 0; l < s; l++) //for col  
	arr[k][l] = sc.nextInt();   

	System.out.println("Elements of the array  for 2nd matrix: ");   
	for (k = 0; k < r; k++)   
	{   
	for (l = 0; l < s; l++)   
	//prints the array elements  
	System.out.print(arr[k][l] + " ");   
	//throws the cursor to the next line  
	System.out.println();   
	} 
	
	//Sum operation;
	int sum [][]=new int[n][r];
	
	for(int row=0;row<array.length;row++) {
		for(int col=0;col<array[0].length;col++) {
			sum[row][col]=array[row][col]+arr[row][col];
		}
	}
	System.out.println("Sum of 2 matrix is:");
	for(int row=0;row<array.length;row++) {
		for(int col=0;col<array[0].length;col++) {
			System.out.format("%d \t",sum[row][col]);
		}
		System.out.println("");
	}
	
	}   
	 

}
