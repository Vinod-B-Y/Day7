package day7;

public class iteration {

    public static void main(String[] args) {

        int amount = 10000;
        int withdrawal = 2000;

        for (int i = amount; i > 0; i = i - withdrawal) {
            System.out.println("Withdraw: $" + withdrawal);
        }

        System.out.println("Withdraw completed!");
    }
}