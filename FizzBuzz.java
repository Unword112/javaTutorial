/**
 Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.
 */
public class FizzBuzz {
    public String fizzBuzz(Integer i) {
            String res = "";
            if(i%3==0)
                res += "Fizz";
            if(i%5==0)
                res += "Buzz";
            if(res == "")
                res = i.toString();
        return res;
    }
}