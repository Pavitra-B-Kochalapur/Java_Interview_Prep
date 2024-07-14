package com.pavitra.patternQuestions;

public class Pattern {
	
/*	*
	* *
	* * *
	* * * *  */

	public static void main(String[] args) {
		
//		Pattern1(4);
//		Pattern2(5);
		Pattern3(3);
//		Pattern4(4);
	//Pattern5(4);
		Pattern8(4);
	Pattern9(4);

	}
	
	static void Pattern1(int n) {
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	static void Pattern2(int n) {
		/*   *****
		     *****
		     *****
		     *****
		     *****
		 */
		System.out.println();
		for(int row=1;row<=n;row++)
		{
			for(int col=1; col<=n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern3(int n) {
		/*   
		    * * *
		    * *
		    *    
		 */
		System.out.println();
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern4(int n) {
		/*
		 1
		 1 2
		 1 2 3
		 */
		System.out.println();
		for(int row=1;row<=n;row++)
		{
			for(int col=1; col<=row;col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	static void Pattern5(int n)
	{
		System.out.println();
		
		for(int row=0;row<2*n;row++)
		{
			int totalRowsinaCols = row > n ? 2 * n - row  : row;
			for(int col=0; col< totalRowsinaCols; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern6(int n)
	{
		System.out.println();
		for(int row=0; row<2*n;row++)
		{
			int totalRowsInacols = row>n ? 2*n - row : row;
			int noOfSpaces = n - totalRowsInacols;
			for(int s=0; s<noOfSpaces;s++) {
				System.out.print(" ");
			}
			
			for(int col=0; col<totalRowsInacols; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void Pattern7(int n)
	{
		
		System.out.println();
		for(int row=1; row<=n;row++)
		{
			for(int s=1; s<= n-row; s++) {
				System.out.print("  ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print("Kgf" +" ");
			}
			for(int col=2; col<=row;col++) {
				System.out.print("RRR"+" ");
			}
			System.out.println();
		}
	}
	
	static void Pattern8(int n)
	{
		System.out.println();
		for(int row=1; row<= 2 * n;row++)
		{
			int c = row > n ? 2 * n - row : row;
			for(int s=1; s<= n-c; s++) {
				System.out.print("  ");
			}
			for(int col=c;col>=1;col--) {
				System.out.print(col+" ");
			}
			for(int col=2; col<=c;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	static void Pattern9(int n) {
		int orginalN = n;
		n = 2 * n ;
		for(int row=0;row<=n;row++) {
			for(int col=0; col<=n; col++) {
				int atEveryIndex = orginalN - Math.min(Math.min(row,col ),Math.min(n-row, n-col));
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
	}

}
