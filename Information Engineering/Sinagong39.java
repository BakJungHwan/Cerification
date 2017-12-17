public class Sinagong39 
{
	public static void main(String[] args) 
	{
		int m, i, j, k, x;
		int[] data = {5,23,10,33,77,71,79,21,777,7};

		m = 0;
		
		i = -1;

		do
		{
			i++;
			j = i;

			do
			{
				j++;
				if (data[i] > data[j])
				{
					k = data[i];
					data[i] = data[j];
					data[j] = k;
				}
			} while (j < 9);
		} while (i < 8);

		for (x = 0; x <= 9; x++)
		{
			System.out.printf("%d ", data[x]);
		}
		System.out.printf("\n");
	}
}
