import java.util.Scanner;

public class prob74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=2;j<=i;j++)
				System.out.print(" ");
			for(int j=n-i+1;j>0;j--)
			{
				System.out.print("#");
			}
			
			System.out.print("\n");
		}

	}

}
