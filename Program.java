/** Array of Multiples 
 * Create a function that takes two numbers as arguments (num, length) and returns 
   an array of multiples of num until the array length reaches length.
*/

import java.util.Arrays;

public class Program {
	public static int[] arrayOfMultiples(int num, int length){
        int[] Arrays = new int[length];
        for(int i=0;i<length;i++){
            Arrays[i] = num * (i+1);
        }
        return Arrays;
	}
    public static void main(String[] args) {
        Program p = new Program();
        int arr[] = p.arrayOfMultiples(7, 5);
        System.out.println(Arrays.toString(arr));
    }
}
