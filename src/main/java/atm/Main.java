package atm;

import java.util.Scanner;

public class Main {
    public void add(int a, int b){
        if (a<0){throw new IllegalArgumentException();}

    }
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args) {
        int amount = scanner.nextInt();

        ATM atm = new ATM();
        atm.process(amount);

    }
}
