public class Sinagong40 
{
	public static void main(String[] args) 
	{
		int n, i, j, k;
		int[] data = { 5,23,10,33,77,71,79,21,777,7 };
		n = 0;

		i = -1;
		do
		{
			i++;
			j = -1;
			do
			{
				j++;
				if (data[j] > data[j + 1])
				{
					k = data[j];
					data[j] = data[j + 1];
					data[j + 1] = k;
				}
			} while (j < 8-i);
		} while (i < 8);

		for (i = 0; i < 10; i++)
		{
			System.out.printf("%d ", data[i]);
		}
		System.out.printf("\n");
	}
}
