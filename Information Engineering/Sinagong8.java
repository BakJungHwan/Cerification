public class Sinagong8 
{
	public static void main(String[] args) 
	{
		int i, j, k, l;

		i = 0;
		j = 1;
		k = -1;
		l = -1;

		do
		{
			i++;
			j += i;
			l *= -1;
			k = k + (j*l);
		} while (i < 19);
	System.out.printf("%d\n",k);
	}
}
