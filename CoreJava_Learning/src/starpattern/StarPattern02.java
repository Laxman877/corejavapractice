package starpattern;
//right triangle
public class StarPattern02 {
	
	public  static void rightTriangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		rightTriangle(n);
		
		for(int i=0;i<=5;i++)//for the rows
		{
			for(int j=0;j<=i;j++)//for the column
			{
				System.out.print("* ");//print  star
			}
			System.out.println();//next line
		}
	}
}
