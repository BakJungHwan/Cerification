import java.util.*;

public class Sinagong24 
{
	public static void main(String[] args) 
	{
		int b, bb, c, mok, nmg, i;
		int[] a=new int[10];

		Scanner sc = new Scanner(System.in);

		b = sc.nextInt();

		bb = b;

		c = 0;

		while (true)
		{
			c++;
			mok = (int)(b / 2);
			nmg = b - mok * 2;
			a[c] = nmg;

			if (mok != 0)
			{
				b = mok;
			}
			else
			{
				break;
			}
		}

		System.out.printf("%d\n", bb);

		for (i = c; i >= 1; i--)
		{
			System.out.printf("%d", a[i]);
		}
		System.out.println();
	}
}
