public class  Sinagong3
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 0;
		int sw = 0;

		do
		{
			i++;
			if(sw==0)
			{
				j += i;
				sw = 1;
			}
			else
			{
				j -=i;
				sw = 0;
			}
		}
		while (i<100);
		System.out.printf("%d\n", j);
	}
}
