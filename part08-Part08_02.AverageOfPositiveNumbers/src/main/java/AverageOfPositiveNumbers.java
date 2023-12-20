
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double counter = 0;

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input > 0){
                counter += 1;
                sum = sum + input;
            }
            if(input == 0){
                if(sum == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }else{
                    double avg = sum / counter;
                    System.out.println(avg);
                    break;
                }
                
            }
            
            
        }

    }
}
