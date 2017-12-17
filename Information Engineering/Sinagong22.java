import java.util.*;

public class Sinagong22 
{
	public static void main(String[] args) 
	{
		int b;
		int mok;
		int nmg;
		int i;
		int[] a = new int[100];

		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		
		int c = 0;
		int d = 0;
		
		while (true)
		{
			c++;
			if (c == b)
			{
				System.out.printf("%d\n", b);
				break;
			}
			else
			{
				mok = (int)(b / c);
				nmg = b - mok*c;

				if (nmg == 0)
				{
					a[d] = c;
					d++;
				}
			}
		}

		for (i = 0; i < d; i++)
		{
			System.out.printf("%d\n", a[i]);
		}
	}
}
