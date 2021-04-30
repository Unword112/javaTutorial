import java.util.Arrays;

public class Test {
        public static void main(String[] args) {
            int num = 7;
            int length = 5;
            int[] Arr = new int[length];
                for(int i=1;i<Arr.length;i++){
                    Arr[i] = i * num;
        };
        System.out.print(Arrays.toString(Arr));
    }
}
