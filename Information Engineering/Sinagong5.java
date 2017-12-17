public class  Sinagong5
{
	public static void main(String[] args) 
	{
	int i = 0;
	double j = 1.0;

	do
	{
		i++;
		if (i % 2 == 0)
		{
			j *= i;
		}
		else
		{
			j *= i*(-1);
		}
	} while (i < 100);
	System.out.println(j);
	}
}
