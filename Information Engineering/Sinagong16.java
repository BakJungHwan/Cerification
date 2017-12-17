import java.util.*;

public class Sinagong16 
{
	public static void main(String[] args) 
	{
		int a;
		int i;
		int j;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		i = a;
		j = 2;

		while (true)
		{
			if (j == i)
			{
				System.out.printf("Prime number\n");
				break;
			}
			else
			{
				if (a%j == 0)
				{
					System.out.printf("This isn't Prime number=\n");
					break;
				}
				else
				{
					j++;
				}
			}
		}
	}
}
