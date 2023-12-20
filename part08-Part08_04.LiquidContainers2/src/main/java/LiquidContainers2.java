
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container f = new Container();
        Container s = new Container();

        while (true) {

            System.out.println("First: " + f.toString());
            System.out.println("Second: " + s.toString());

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            String cmd = parts[0];
            int amt = Integer.valueOf(parts[1]);
        
            if(cmd.equals("add")){
                f.add(amt);
            }
        
            if(cmd.equals("move")){
                if(f.contains()>0& f.contains()>=amt){
                f.remove(amt);
                s.add(amt);
                }else if(f.contains()<amt){
                    s.add(f.contains());
                    f.remove(amt);                   
                }
            }
            
            
            if(cmd.equals("remove")){
                s.remove(amt);
            }
        
        
        
        
        }
    }

}