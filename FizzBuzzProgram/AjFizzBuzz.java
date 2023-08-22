/*    FizzBuzz Rules
      For multiples of 3, print "Fizz."
      For multiples of 5, print "Buzz."
      For multiples of both 3 and 5, print "FizzBuzz."
      For all other numbers, simply print the number.  */

public class AjFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
