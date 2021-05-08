public class TestTwist {
    public static int totalPoints(String[] guesses, String word) {
        int point = 0;
        for(String s : guesses){
            if(isComplete(s, word)) point += getPoint(s, word);
        }
        return point;
    }
    public static boolean isComplete(String str, String word){
        StringBuilder s = new StringBuilder(str);
        StringBuilder w = new StringBuilder(word);

        while(s.length()> 0){
            char c = s.charAt(0);
            int index = w.indexOf(Character.toString(c));
            if(index == -1) break;
            s.deleteCharAt(0);
            w.deleteCharAt(index);
        }

        if(s.length()>0) return false;

        return true;
    }
    public static int getPoint(String word, String master){
        int point = 0;
        if(word.length() == 3) point += 1;
        else if(word.length() ==4) point += 2;
        else if(word.length() ==5) point += 3;
        else if(word.length() ==6) point += 54;
        return point;
    }
    public static void main(String[] args) {
        TestTwist t = new TestTwist();
        String[] guesse0 = {"cat", "create", "sat"};
        String[] guesse1 = {"trance", "recant"};
        String[] guesse2 = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
        System.out.println(t.totalPoints(guesse0,"caster"));
        System.out.println(t.totalPoints(guesse2, "tossed"));
        System.out.println(t.totalPoints(guesse1,"recant"));
    }   
}


/**
 * char c = 'a';
String s = String.valueOf(c);             // fastest + memory efficient
String s = Character.toString(c);
String s = new String(new char[]{c});
String s = String.valueOf(new char[]{c});
String s = new Character(c).toString();
String s = "" + c;                        // slowest + memory inefficient
 */