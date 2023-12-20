
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        while(true){
            String input = scanner.nextLine();
            if(!input.equals("end")){
                int integer = Integer.valueOf(input);
            System.out.println(integer * integer * integer);
            }else{
                break;
            }
            
            
        }

    }
}
