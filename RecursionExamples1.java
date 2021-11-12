public class RecursionExamples1
{
	public static double factorial(int n)
	{
		System.out.println("n is " + n);
		if(n == 1)
		{
			return 1;
		}
		else
		{
			System.out.println("need " + (n-1) + "!");
			double answer = factorial(n-1);
			System.out.println((n-1) + "! is " + answer);
			return n * answer;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(factorial(4));
	}
}
