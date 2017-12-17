public class  Sinagong13
{
	public static void main(String[] args) 
	{
		int a;
		int d;
		int hap;

		hap = 1;
		a = 1;

		do
		{
			d = 1 / a;
			hap = hap + d;
			a++;
		} while (a != 10);
		System.out.printf("%d\n", hap);
	}
}
