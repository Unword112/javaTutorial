public class PackageRiceBage {
	public Boolean packageRice(Integer big, Integer small, Integer goal) {
	    boolean packageRice = false;
        if (big * 5 >= goal) {
            if (small >= goal % 5)
            packageRice = true;
        } else {
            if (small >= goal - big * 5) {
                packageRice = true;
            }
        }
        return packageRice;
	}
	public static void main(String[] args) {
	    PackageRiceBage pac = new PackageRiceBage();
	    System.out.println(pac.packageRice(2, 2 , 12));
	    System.out.println(pac.packageRice(2, 1 , 12));
	    System.out.println(pac.packageRice(2, 1 , 5));
	    System.out.println(pac.packageRice(5, 3 , 24));
	    System.out.println(pac.packageRice(2, 7 , 18));
	    System.out.println(pac.packageRice(2, 10 , 18));
	}
}