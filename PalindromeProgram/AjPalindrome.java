import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        int exit=1;
        Scanner sc=new Scanner(System.in);
        while(exit==1){
            System.out.println("\nChoose your option\n"+"1. Find Palindrome\n"+"2. Exit\n");
            int option=sc.nextInt();
        switch(option){
        case 1:
        System.out.println("Enter the String");
        String s=sc.next();
        int length=s.length();
        String temp="";
        for (int i = length-1; i >=0; i--) {
            temp=temp+s.charAt(i);
        }
        if(s.equals(temp)){
            System.out.println("The given string is palindrome\n");
        }else{
            System.out.println("The given string is not palindrome\n");
        }
        break;
        case 2:
                exit=0;
                System.out.println("Exit...");
                break;
        }
    }
}
}
