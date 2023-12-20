
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("First: " + first +"/100\n");
            System.out.print("Second: " + second + "/100\n");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")){
                if(amount >= 0 && (first + amount <=100)){
                    first += amount;
                }else if(amount >= 0 && (first + amount >=100)){
                    first = 100;
                }
            }
            else if(command.equals("move") && amount >= 0){
                if((second + amount <= 100) && (first - amount >=0)){
                    first -= amount;
                    second += amount;
                }else {
                    second = first;
                    first = Math.max(first-amount, 0);
                }
            }
            else if(command.equals("remove")){
                if(amount >= 0 && amount <= second){
                    second -= amount;
                }else{
                    second = 0;
                }
            }
            

        }
    }

}
