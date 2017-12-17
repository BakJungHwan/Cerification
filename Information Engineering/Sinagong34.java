public class  Sinagong34
{
	public static void main(String[] args) 
	{
		int dec, p, k;
		int i = 0;
		int[] s = {1,1,1,1,1,1,1,0};

		dec = 0;
		p = 0;
		
		do
		{
			k = 1;

			for (i = 0; i < p; i++)
			{
				k *= 2;
			}

			dec = dec + (k*s[p]);
			p++;
		} while (p < 8);

		if (dec > 128)
		{
			dec = 128 - dec;
			dec = (-1)*128 - dec;
		}

		System.out.printf("%d\n", dec);
	}
}
