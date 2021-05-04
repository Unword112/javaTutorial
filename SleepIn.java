/* 
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday 
or we're on vacation. Return true if we sleep in.
*/


public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepIn = false;
        if(weekday == false){
            if(vacation == true || vacation == false) 
                return sleepIn = true; 
        }
        if(weekday == true){
            if(vacation == false) return sleepIn;
            if(vacation == true) return sleepIn = true;
        }        
        return sleepIn;
    }
    public static void main(String[] args) {
        SleepIn sl = new SleepIn();
        System.out.println(sl.sleepIn(false, false));
        System.out.println(sl.sleepIn(true, false));
        System.out.println(sl.sleepIn(false, true));
    }    
}
