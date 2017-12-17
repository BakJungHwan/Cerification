import java.util.*;

public class Sinagong29 
{
	public static void main(String[] args) 
	{
		int cnt, hap, mok, nmg, i;

		cnt = 0;
		hap = 0;

		for (i = 1; i <= 100; i++)
		{
			mok = (int)(i / 5);
			nmg = i % 5;

			if (nmg == 0)
			{
				cnt++;
				hap += i;
			}
		}
		System.out.printf("%d %d\n", cnt, hap);
	}
}
