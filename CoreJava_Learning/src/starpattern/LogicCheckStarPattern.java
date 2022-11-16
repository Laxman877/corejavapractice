package starpattern;

public class LogicCheckStarPattern {
	public static void main(String[] args) {
		/*
		 * for(int i=0;i<5;i++) { for(int j=0;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

//		for(int i=0;i<5;i++)
//		{
//			for(int k=5;k>i+1;k--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i+(i+1);j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=5-1;i>=0;i--)
//		{
//			for(int j=1;j<5-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i+(i+1);k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//3 & 5 
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
			{
				System.out.println("Divide by 3 "+i);
			}
		}
		System.out.println("*****");
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
			{
				System.out.println("Divide by 5 "+i);
			}
		}
		System.out.println("*****");
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Divide by 3 & 5 "+i);
			}
		}
	}
}
