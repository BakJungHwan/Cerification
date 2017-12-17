import java.util.*;

public class Sinagong18 
{
	public static void main(String[] args) 
	{
		int a;
		int j;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		j = 2;
		
		while (true)
		{
			if (j <= Math.sqrt(a))
			{
				if (a % j == 0)
				{
					System.out.printf("This is not Prime number\n");
					break;
				}
				else
				{
					j++;
				}
			}
			else
			{
				System.out.printf("This is Prime number\n");
				break;
			}
		}
	}
}
