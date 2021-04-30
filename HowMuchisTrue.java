/* 
Create a function which returns the number of true values there are in an array. 
*/

import java.util.*;

public class HowMuchisTrue {
    public int countTrue(boolean[] arr) {
        int countTrue = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==true){
                countTrue += 1;
            } else if(arr[i]!=true) continue;
            else return 0;
        }
        return countTrue;
    }
    public static void main(String[] args) {
        HowMuchisTrue how = new HowMuchisTrue();
        boolean[] arrCount0 = {true, false, false, true, false};
        boolean[] arrCount1 = {false, false, false, false};
        boolean[] arrCount2 = {};
        System.out.println(how.countTrue(arrCount0));
        System.out.println(how.countTrue(arrCount1));
        System.out.println(how.countTrue(arrCount2));
    }
}
