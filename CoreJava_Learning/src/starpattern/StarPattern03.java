package starpattern;
//left triangle
public class StarPattern03 {
	
//	public  static void leftTriangle(int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//			for(int j=2*(n-i);j>=0;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
//		int n=5;
//		leftTriangle(n);
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=2*(n-i);j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
