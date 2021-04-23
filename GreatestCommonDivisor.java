/*
The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder.
Write a method that returns the Greatest Common Divisor of p and q. 
*/

public class GreatestCommonDivisor {
    public Integer gec(Integer p, Integer q) {
		int r;
		if(p>q) {
		    r=p;
		    p=q;
		    q=r;
		}
		r=q%p;
		while(r!=0){
		    q=p;
		    p=r;
		    r=q%p;
		}
		return p;
	}
	public static void main(String[] args){
	    GreatestCommonDivisor m = new GreatestCommonDivisor();
	    System.out.print(m.gec(24,18));
	}
}
