package starpattern;
//triangle og 1 or 0 
public class StarPattern06 {
	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++) {
//				System.out.print(j%2+" ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j%2+" ");
//			}
//			System.out.println();
//		}
		int n=6;
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
}
