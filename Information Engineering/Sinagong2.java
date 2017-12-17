public class Sinagong2
{
	public static void main(String[] args) 
	{
		int i = -1;
		int j = 0;
		do
		{
			i+=2;
			j+=i;
		}
		while (i<99);
		System.out.printf("%d\n", j);
	}
}
