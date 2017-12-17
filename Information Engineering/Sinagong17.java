import java.util.*;

public class Sinagong17 
{
	public static void main(String[] args) 
	{
		int a, j;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();

		j = 2;

		while (true)
		{
			if (a % j != 0)
			{
				j++;
			}
			else
			{
				if (a==j)
				{
					System.out.printf("Prime number\n");
				}
				else
				{
					System.out.printf("This is not Prime number\n");
				}
				break;
			}
		}

		}
}
