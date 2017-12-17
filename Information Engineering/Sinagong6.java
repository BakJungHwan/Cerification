public class  Sinagong6
{
	public static void main(String[] args) 
	{
		int i = 0;
		float j = 0;

		do
		{
			i++;
			if (i / 2 == i / 2.0)
			{
				j += i / (i + 1.0);
			}
			else
			{
				j -= i / (i + 1.0);
			}
			System.out.printf("i=%d, j=%f\n", i, j);
		} while (i < 99);
		System.out.printf("%f\n", j);
	}
}
