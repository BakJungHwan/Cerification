import java.util.*;

public class Sinagong21 
{
	public static void main(String[] args) 
	{
	int a, b, big, small, mok, nmg, gcm, lcm;

	Scanner sc = new Scanner(System.in);

	a = sc.nextInt();
	b = sc.nextInt();

	if (a < b)
	{
		big = b;
		small = a;
	}
	else
	{
		big = a;
		small = b;
	}

	while (true)
	{
		mok = (int)(big / small);
		nmg = big % small;

		if (nmg == 0)
		{
			System.out.printf("GCM = %d\n", small);
			System.out.printf("LCM = %d\n", a*b / small);
			break;
		}
		else
		{
			big = small;
			small = nmg;
		}
	}
	}
}
