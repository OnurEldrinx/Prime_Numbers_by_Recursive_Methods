import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter a number to check if it is prime or not : ");
        number = scanner.nextInt();

        if (isItPrime(number,2)){

            System.out.println(number + " is a prime number!");

        }else{

            System.out.println(number + " is not a prime number!");

        }

    }

    static boolean isItPrime(int number,int divider){

        if (number <= 2)
            return number == 2;
        if (number % divider == 0)
            return false;
        if (divider * divider > number)
            return true;


        return isItPrime(number, divider + 1);


    }

}
