import java.util.*;

public class Sinagong19 
{
	public static void main(String[] args) 
	{
		int a, hap, k, j;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		hap = 0;
		k = 2;

		while (true)
		{
			j = 2;
			while(k % j != 0)
			{ 
				j++;
			}
			if (k == j)
			{
				hap = hap + k;
			}
				
			if (k != a)
			{
				k++;
			}
			else
			{
				System.out.printf("%d\n", hap);
				break;
			}
		}
	}
}
