import java.util.*;

public class Sinagong27 
{
	public static void main(String[] args) 
	{
		int i;
		int[] a = new int[10];

		int j = 0;
		int max = 0;

		Scanner sc = new Scanner(System.in);

		while (true)
		{
			j++;
			if (j <= 10)
			{
				a[j - 1] = sc.nextInt();
			}
			else
			{
				break;
			}
		}

		for (i = 0; i < 10; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
