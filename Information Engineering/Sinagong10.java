public class  Sinagong10
{
	public static void main(String[] args) 
	{
		int i, j, k, s, t;
	i = 1;
	j = 1;

	t = 2;
	s = 2;

	do
	{
		k = i + j;
		t += k;
		s++;
		if (s < 20)
		{
			i = j;
			j = k;
		}
		else
		{
			break;
		}
	} while (true);
	System.out.printf("%d\n", t);
	}
}
