// Example class for Git exercise
// Do not use library functions for any of these

public class Stuff {

    // Returns the Fibonnaci sequence's nth number
    // ex. 1, 1, 2, 3, 5, 8 - 2 would be the third number
    static int fib(int n);
	{
	if (n<= 1) return n;
	return fib(n-1) + fib(n-2); 
	}

    // randomly moves around the array until it finds the correct combination
    static int[] sort(int[] a) {
        while(!isSorted(i)) {
            for(int x = 0; x < i.length; ++x) {
                int index1 = (int) (Math.random() * i.length),
                        index2 = (int) (Math.random() * i.length);
                int a = i[index1];
                i[index1] = i[index2];
                i[index2] = a;
            }
        }
        for(int x : i) {
            System.out.print(x + ", ");
        }
    }

    public boolean isSorted(int[] i) {
        for(int x = 0; x < i.length - 1; ++x) {
        if(i[x] > i[x+1]) {
            return false;
        }
    }
    return true;
    }

    // Returns the number of occurances of each letter (ABCD...) in a given string
    static int[] letterCount(String s) {
        char[] charArray = s.toCharArray();
        Set<Char> noDupes = new HashSet<Char>();
        for (char letter : charArray) {
            noDupes.add(letter);
        }
        for (char letter : noDupes) {
            int counter = 0;
            for (char innerLetter : charArray) {
                if (innerLetter == letter) {
                    counter += 1;
                }
            }
            System.out.println("there are " + counter + String.valueOf(letter));
        }
    }

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


