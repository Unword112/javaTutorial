import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public class Challenge {
        public static boolean isEqual(int num1, int num2) {
            boolean isEqual = false;
            if(num1 == num2) return isEqual = true;
            else return isEqual;
      }
        return isEqual;
    }
    public static void main(String[] args) {
        String[] word = {"cup", null, "forest",
        "sky", "book", null, "theatre"};
        List<String> words = Arrays.asList(word);

        List<String> result = words.stream().filter(w -> w != null)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}