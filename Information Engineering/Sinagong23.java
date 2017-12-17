import java.util.*;

public class Sinagong23 
{
	public static void main(String[] args) 
	{
		int i;
		int b, c, d, e, nmg;
		int mok = 0;
		int[] a = new int[100];

		Scanner sc = new Scanner(System.in);

		b = sc.nextInt();

		c = 0;

		d = 2;

		while(true)
		{
			e = (int)(Math.sqrt(b));

			while(true)
			{
				if (d > e)
				{
					d = b;
					break;
				}
				mok = (int)(b / d);
				nmg = b - mok * d;

				if (nmg != 0)
				{
					d++;
				}
				else
				{
					break;
				}
			}

			a[c] = d;
			c++;

			if (b != d)
			{
				b = mok;
			}
			else
			{
				break;
			}
		}

		for (i = 0; i < c; i++)
		{
			System.out.printf("%d\n", a[i]);
		}
	}
}
