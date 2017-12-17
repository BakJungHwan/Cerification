public class Sinagong36 
{
	public static void main(String[] args) 
	{
		int num;
		int totodd = 0;
		int toteven = 0;
		int tot10su = 0;

		num = 100;

		while (true)
		{
			num++;

			if (num > 500)
			{
				break;
			}
			else
			{
				if (num % 2 == 0)
				{
					toteven += num;

					if (num % 5 == 0)
					{
						tot10su += num;
					}
					else
					{
						continue;
					}
				}
				else
				{
					totodd += num;
					continue;
				}
			}
		}
		System.out.printf("totodd=%d, toteven=%d, tot10su=%d\n", totodd, toteven, tot10su);
		}
}
