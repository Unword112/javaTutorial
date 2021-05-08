import java.util.ArrayList;

public class stringTimes {
    public ArrayList<String> stringTimes(String str, int n) {
        ArrayList<String> count = new ArrayList<>();
        for(int i=0;i<n;i++){
            count.add(str);
        }
        return count;
    }
    public static void main(String[] args) {
        stringTimes s = new stringTimes();
        System.out.println(s.stringTimes("Hi", 2));
        System.out.println(s.stringTimes("Hi", 3));
        System.out.println(s.stringTimes("Hi", 1));
        System.out.println(s.stringTimes("Hi", 0));
        System.out.println(s.stringTimes("Hi", 5));
        System.out.println(s.stringTimes("Oh Boy!", 2));
        System.out.println(s.stringTimes("code", 2));
    }
}
