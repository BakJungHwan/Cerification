public class Sinagong11 
{
	public static void main(String[] args) 
	{
		int q;
		int m;

		int p = 0;
		int h = 0;

		do {
			p++;
			q = 78 - p;
			m = q*p;
			h = h + m;
		} while (p < 77);
		System.out.printf("%d\n", h);
	}
}
