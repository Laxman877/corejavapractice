package starpattern;
//Pyramid Pattern
public class StarPattern01 {
	public static void main(String[] args) {
//		int n=5;
//		pyarmidPattern(n);
		for(int i=1;i<=5;i++) {//for the rows
			for(int j=5;j>i;j--)//for the space
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)//print star
			{
				System.out.print("* ");
			}
			System.out.println();//next line
		}
	}
}
