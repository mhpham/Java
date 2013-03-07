//Display the first n numbers of the Fibonacci sequence

public class Fibonacci{
	public static void main (String[] args) {
		int num = 10;
		for(int i = 0;i <=num;i++)
		{
			System.out.print(fib(i) + " ");
		}
	}

	private static int fib(int num) {

	if (num <= 1)
		return num;
	else
		return fib(num-1) + fib(num-2);
	}
}
