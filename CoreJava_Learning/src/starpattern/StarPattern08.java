package starpattern;
//pyramid
public class StarPattern08 {
	public static void main(String[] args) {
		int line=5;
		int starcount=1;
		int spacecount=line-1;
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=spacecount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=starcount;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcount+=2;
			spacecount--;
		}
	}
}
