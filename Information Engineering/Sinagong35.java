import java.util.*;

public class Sinagong35 
{
	public static void main(String[] args) 
	{
		int a, b, n;
		int sum = 0;
		int cnt = 0;
		int i = 0;
		float avg = 0;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b)
		{
			n = a - b - 1;
			for (i = 0; i < n; i++)
			{
				sum = sum + b + 1 + i;
				cnt = cnt + 1;
			}
		}
		else
		{
			n = b - a - 1;
			for(i=0; i<n; i++)
			{
				sum = sum + a + 1 + i;
				cnt = cnt + 1;
			}
		}
		avg = (float)sum / cnt;

		System.out.printf("sum=%d, avg=%4.2f", sum, avg);
	}
}
