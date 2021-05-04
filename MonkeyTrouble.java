public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean trouble = false;
        if(aSmile == bSmile) return trouble = true;
        else return trouble;
    }
    public static void main(String[] args) {
        MonkeyTrouble m = new MonkeyTrouble();
        System.out.println(m.monkeyTrouble(true, true));
        System.out.println(m.monkeyTrouble(false, false));
        System.out.println(m.monkeyTrouble(true, false));
    }    
}
