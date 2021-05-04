/**
 * Create a function that takes an array of number out. And return new Arrays.
 */

import java.util.ArrayList;

public class FilterOutString {
    public static ArrayList<String> filterArray(String[] str) {
        boolean isInteger = false;
        ArrayList<String> filterArray = new ArrayList<String>();
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		for(int i=0;i<str.length;i++){
            for(int j=0;j<number.length;j++){
                if(str[i].contains(number[j])){
                    isInteger = true;
                    filterArray.add(str[i]);
                }
            }
            if(isInteger) continue;
        }
        return (filterArray);
	}
    public static void main(String[] args) {
        FilterOutString f = new FilterOutString();
        String[] char0 = {"1", "2", "a", "b"};
        String[] char1 = {"1", "a", "b", "0", "15"};
        String[] char2 = {"1", "2", "aasf", "1", "123"};
        System.out.println(f.filterArray(char0));
        System.out.println(f.filterArray(char1));
        System.out.println(f.filterArray(char2));
    }
}
