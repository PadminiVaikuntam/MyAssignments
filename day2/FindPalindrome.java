package week1.day2;

public class FindPalindrome {
	int orgjnal = 121;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindPalindrome f = new FindPalindrome();
int y = f.reversNumber(f.orgjnal);
if (y==f.orgjnal)
System.out.println("The Given number "+f.orgjnal+" is palindrome");
else
System.out.println("The Given number "+f.orgjnal+" is not a  palindrome");
	}

	
	static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        
        return reversed_n;
    }
}
