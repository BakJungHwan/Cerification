import java.util.*;

public class Sinagong20 
{
	public static void main(String[] args) 
	{
		int k, i, j, m;
		int[] a = new int[99];

		k = 1;

		do
		{
			k++;
			a[k - 2] = k;
		} while (k < 100);

		i = 0;
		j = 0;

		while (true)
		{
			do
			{
				i++;
				if (i > 99)
				{
					System.out.printf("%d\n", j);
					System.exit(0);
				}
			} while (a[i-1]==0);

			j++;
			
			m = i-1;

			while (true)
			{
				m+=(i+1);
				if (m <= 99)
				{
					a[m] = 0;
				}
				else
				{
					break;
				}
			}
		}
	}
}
