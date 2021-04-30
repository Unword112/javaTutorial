/* 
Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
*/

public class SevenBoom {
    public String sevenBoom(int[] arr) {
        for(int i=0;i<arr.length;i++){ 
        //can be for(int i : arr) but choose change conv at arr[i] to i;
            String conv = Integer.toString(arr[i]);
            if(conv.contains("7")){
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
    public static void main(String[] args) {
        SevenBoom s = new SevenBoom();
        int[] count0 = {1, 2, 3, 4, 5, 6, 7};
        int[] count1 = {8, 6, 33, 100};
        int[] count2 = {33, 68, 400, 5};
        System.out.println(s.sevenBoom(count0));
        System.out.println(s.sevenBoom(count1));
        System.out.println(s.sevenBoom(count2));
    }
}
