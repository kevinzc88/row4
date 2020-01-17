// Example class for Git exercise
// Do not use library functions for any of these

public class Stuff {

    // Returns the Fibonnaci sequence's nth number
    // ex. 1, 1, 2, 3, 5, 8 - 2 would be the third number
    static int fib(int n);

    // Sorts a list of integers from smallest to largest
    // Build your own - don't use a library sorting method
    static int[] sort(int[] a);

    // Returns the number of occurances of each letter (ABCD...) in a given string
    static int[] letterCount(String s);

    // Returns the GCD of two numbers
    // Must use Euclid's algorithm
    static int gcd(int a, int b)
	{
		if (b > a) // a is x and b is y
		{
			if (b == 0)	return a;
			else
			{
				gcd(b, a % b);
			}
		}			
		else // b is x and a is y
		{
			if (a == 0)     return b;
                        else
                        {
                                gcd(a, b % a);
                        }
		}
	}

    // Returns all prime factors of a number
    static int[] factorize(int a) {
	int p=2;
	while (a%p != 0) {
		p++;
	}
	int[] x = factorize(a/p);
	int[] y = new int[x.length];
	y[0] = p;
	for (int i=1; i<y.length; i++) {
		y[i] = x[i-1];
	}
    }

}
