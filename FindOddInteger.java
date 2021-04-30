public class FindOddInteger {
    public static int findOdd(int[] arr) {
        int i;
        for(i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) count+=1;
            }
            if(count%2!=0) return arr[i];
        }
        return -1;
	}
    public static void main(String[] args) {
        FindOddInteger f = new FindOddInteger();
        int[] Arrays0 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] Arrays1 = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] Arrays2 = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        System.out.println(f.findOdd(Arrays0));
        System.out.println(f.findOdd(Arrays1));
        System.out.println(f.findOdd(Arrays2));
    }
}
