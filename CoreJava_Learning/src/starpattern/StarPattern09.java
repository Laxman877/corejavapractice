package starpattern;
//diamond
public class StarPattern09 {
	public static void main(String[] args) {
//		int line=7;
//		int starcount=1;
//		int spacecount=line -1;
//		int mid=(line/2)+1;
//		for(int i=1;i<=line;i++)
//		{
//			for(int j=1;j<spacecount;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=starcount;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			if(i<mid)
//			{
//				starcount+=2;
//				spacecount--;
//			}
//			else {
//				starcount-=2;
//				spacecount++;
//			}
//		}
		int line=7;
		int starcount=1;
		int spacecount=line-1;
		int mid=(line/2)+1;
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<spacecount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=starcount;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				starcount+=2;
				spacecount--;
			}
			else
			{
				starcount-=2;
				spacecount++;
			}
		}
	}
}
