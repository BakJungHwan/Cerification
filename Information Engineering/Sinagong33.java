import java.util.*;

public class Sinagong33 
{
	public static void main(String[] args) 
	{
		int n, c, k, y;
		int[] s = new int[20];

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		if (n < 2)
		{
			System.exit(1);
		}

		c = -1;

		do
		{
			k = 2;
			while(n % k != 0)
			{
				k++;
			}
			
			c++;
			s[c] = k;
			n = n / k;
			
		} while (n != 1);

		if (c == 0)
		{
			System.out.printf("Prime number\n");
		}
		else
		{
			for (y = 0; y < c; y++)
			{
				System.out.printf("%d * ", s[y]);
			}
		}
		System.out.printf("%d\n",s[c]);
	}
}
