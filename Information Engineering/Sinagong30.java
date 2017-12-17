public class Sinagong30 
{
	public static void main(String[] args) 
	{
			int i = 0;
	int j = 0;
	int mok = 0;
	int nmg = 0;

	int a[] = int[12];
	int[] b = int[14];
	b = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,};

	Scanner sc = new Scanner(System.in);


	for (i = 0; i < 12; i++)
	{
		a = sc.nextInt();
	}

	if (a[0] != 0)
	{
		for (i = 0; i < 12; i++)
		{
			b[i + 2] = b[i + 2] + a[i];
		}
	}
	else
	{
		for (i = 13; i > 0; i--)
		{
			mok = (int)(b[i] / 10);
			nmg = b[i] % 10;
			b[i] = nmg;
			b[i - 1] = b[i - 1] + mok;
		}
	}

	if(b[i] < 10)
	{
		j = 1;
	}
	else
	{
		j = 0;
	}

	for (i = j; j < 14; j++)
	{
		System.out.printf("%d", b[i]);
	}
	System.out.printf("\n");
	}
}
