class  Sinagong15
{
	public static void main(String[] args) 
	{
		int q, m;
	int p = 0, h = 0;

	do
	{
		p++;
		q = 78 - p;
		m = q*p;
		h += m;
	} while (p < 77);
	System.out.printf("%d\n", h);
	}
}
