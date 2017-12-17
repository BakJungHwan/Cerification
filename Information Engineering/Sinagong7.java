public class  Sinagong7
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 0;
		int k = 0;

		do
		{
			i++;
			j += i;
			k += j;

			System.out.printf("%d %d %d\n", i, j, k);
		} while (i < 20);
		System.out.printf("%d\n", k);
	}
}
