import java.util.*;

public class Sinagong26
{
	public static void main(String[] args) 
	{
		int d;
		float e;
		String a = new String();

		Scanner sc = new Scanner(System.in);

		a = sc.next();

		float b = 0.0f;
		int c = 0;

		while (true)
		{
			c++;
			if (c > 10)
			{
				break;
			}

			d = a.charAt(10 - c) - 0x30;
			e = d*(float)(Math.pow(2, c-6));
			b += e;
		
		}
		System.out.printf("%f\n", b);
	}
}
