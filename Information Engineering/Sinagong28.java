import java.util.*;

public class Sinagong28 
{
	public static void main(String[] args) 
	{
		int m, min, max, hap;
		float avg;
		int i;

		int[] a = new int[7];

		m = 0;

		Scanner sc = new Scanner(System.in);

		do
		{
			m++;
			a[m-1] = sc.nextInt();
		} while (m < 7);

		min = a[0];
		max = a[0];
		hap = a[0];

		i = 0;

		while (true)
		{
			if (i < 6)
			{
				i++;
				hap += a[i];

				if (a[i] < min)
				{
					min = a[i];
				}
				if (a[i] > max)
				{
					max = a[i];
				}
			}
			else
			{
				break;
			}
		}

		hap = hap - min - max;
		avg = hap / 7.0f;

		System.out.printf("%d %d %d %f\n", min, max, hap, avg);
	}
}
