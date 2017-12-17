public class Sinagong32 
{
	public static void main(String[] args) 
	{
		int lm, n, j, sum, k, r;

		lm = 0;
		k = 0;
		sum = 0;

		for (n = 4; n <= 1000; n++)
		{
			sum = 0;
			k = (int)(n / 2);

			for (j = 1; j <= k; j++)
			{
				r = n % j;
				if (r == 0)
				{
					sum += j;
				}
			}

			if (n == sum)
			{
				System.out.printf("%d\n", n);
				lm++;
			}
		}
		System.out.printf("%d\n", lm);
	}
}
