import java.util.Scanner;

public class prob81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				for(int j=0;j<n*2-1;j++)
				{
					System.out.print("#");
				}
				return;
			}
			for(int j=n-i;j>1;j--)
				System.out.print(" ");
			System.out.print("#");
			for(int j=1;j<2*i;j++)
				System.out.print(" ");
			if(i!=0)
				System.out.print("#");
			
			System.out.print("\n");
		}

	}

}
