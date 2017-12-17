import java.util.*;

public class  Sinagong25
{
	public static void main(String[] args) 
	{
		int b, c, d, e, f;
		
		char[] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		Scanner sc = new Scanner(System.in);
		
		b = sc.nextInt();
		c = sc.nextInt();

		d = 1;

		while (d < c)
		{
			d *= b;
		}

		while (true)
		{
			if (d > 1)
			{
				d = d / b;
			}

			e = (int)(c / d);
			f = c - e*d;
			System.out.printf("%c",a[e]);

			if (d == 1)
			{
				System.out.println();
				break;
			}
			c = f;
		}
	}
}
