public class Sinagong37 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int su1 = 0;
		int su2 = 0;
		int su3 = 0;

		while (true)
		{
			if (i != 100)
			{
				i++;
				su1 = i % 3;
				su2 = i % 5;
				su3 = su1 + su2;

				if (su3 == 0)
				{
					System.out.printf("%d\n", i);
				}
				else
				{
					continue;
				}

			}
			else
			{
				break;
			}
		}
	}
}
