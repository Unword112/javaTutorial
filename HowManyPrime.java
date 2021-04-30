public class HowManyPrime {
    public int primeNumbers(int num) {
        int count = 0;
        boolean c;
        for(int i=2;i<=num;i++){
            c = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    c = false;
                }
            }
            if(c) count+=1;
        }
        return count;
	}
    public static void main(String[] args) {
        HowManyPrime h = new HowManyPrime();
        System.out.println(h.primeNumbers(10));
    }
}
