package starpattern;

import java.util.Scanner;

//diamond star pattern
public class StarPattern04 {
	
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<(i*2);k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=5;i>=1;i--)
//		{
//			for(int j=1;j<(i*2);j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			for(int k=5;k>=i;k--)
//			{
//				System.out.print(" ");
//			}
//			
//		}
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			
		}
		
//		int i,j,n,space=1;
//		System.out.println("Enter The number of rows");
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt();
//		space=n-1;
//		for(j=1;j<=n;j++)
//		{
//			for(i=1;i<=space;i++)
//			{
//				System.out.print(" ");
//			}
//			space--;
//			for(i=1;i<=2*j-1;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		space =1;
//		for(j=1;j<=n;j++)
//		{
//			for(i=1;i<=space;i++)
//			{
//				System.out.print(" ");
//			}
//			space++;
//			for(i=1;i<=2*(n-j)-1;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		space =1;
	}
}
