import java.util.Scanner;

public class ATM {



    public static void main(String[] args) {



        int balance = 2000, withdraw, deposite, num;

        Scanner scanner = new Scanner(System.in);



        while (true){

            System.out.println("\nWelcone to ABC bank");

            System.out.println("1. Withdraw");

            System.out.println("2. Deposite");

            System.out.println("3. Check balance");

            System.out.println("4. EXIT");

            int input = scanner.nextInt();

            switch (input){
                case 1:
                    System.out.print("Enter amount of withdrawal: $");
                    withdraw = scanner.nextInt();

                    if (withdraw <= balance){
                        balance = balance - withdraw;
                        System.out.println("Your total balance: $"+ balance);
                        System.out.println("Please collect money");
                    }
                    else {
                        System.out.println("You don't have enough money");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount of deposit: $");
                    deposite = scanner.nextInt();

                    balance = deposite + balance;

                    System.out.print("Your total balance: $" + balance);
                    break;
                case 3:
                    System.out.print("You have $"+ balance);
                    break;
                case 4:
                    System.exit(0);


            }
        }
    }
}
