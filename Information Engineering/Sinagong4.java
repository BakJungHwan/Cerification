public class Sinagong4
{
	public static void main(String[] args) 
	{
	int i = 0;
	int j = 0;

	while (true)
	{
		i++;
		j += i;
		if (i >= 99)
		{
			break;
		}
		i++;
		j -= i;
	}
	System.out.printf("%d", j);
	}
}
