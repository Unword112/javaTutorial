//Create a function that will recursively count the number of digits of a number.
//Conversion of the number to a string is not allowed, thus, the approach is recursive.

public class CountDigit {
    public static int digitsCount(long n) {
		int digitsCount = 0;
        if(n==0) return digitsCount = 1;
        while(n!=0){
            n /= 10;
            ++digitsCount;
        }
        return digitsCount;
	}
    public static void main(String[] args) {
        CountDigit c = new CountDigit();
        System.out.println(c.digitsCount(1289396387328L));
        System.out.println(c.digitsCount(0));
    }
}
