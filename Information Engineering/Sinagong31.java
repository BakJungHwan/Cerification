import java.util.*;

public class  Sinagong31
{
	public static void main(String[] args) 
	{
		int i, z, c, j;
		int[] x = new int [10];
		int[] y = new int [10];
		int[] a = new int [10];

		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 10; i++)
		{
			x[i] = sc.nextInt();
		}

		for (i = 0; i < 10; i++)
		{
			y[i] = sc.nextInt();
		}

		z = 0;
		c = 0;
		j = 9;

		do
		{
			z = x[j] + y[j] + c;

			if (z < 2)
			{
				c = 0;
				a[j] = z;
			}
			else
			{
				c = 1;
				a[j] = z % 2;
			}

			j--;
		} while (j >= 0);

		if (c == 0)
		{
			while (j < 9)
			{
				j++;
				System.out.printf("%d", a[j]);
			}
			System.out.printf("\n");
		}
		else
		{
			System.out.printf("overflow!!\n");
		}
	}
}
