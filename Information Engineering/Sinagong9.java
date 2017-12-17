public class  Sinagong9
{
	public static void main(String[] args) 
	{
		int i, j, k;
		i = 1;
		k = 1;
		j = 1;

		do
		{
			i++;
			j *= i;
			k += j;
		} while (i < 10);
		System.out.printf("%d\n", k);
	}
}
