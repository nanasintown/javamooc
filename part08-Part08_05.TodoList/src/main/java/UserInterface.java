import java.util.Scanner;

public class UserInterface {

  private TodoList todo;
  private Scanner scan;

  public UserInterface(TodoList todo, Scanner scan){
    this.todo = todo;
    this.scan = scan;
  }

  public void start(){
    while(true){
      System.out.println("Command: ");
      String command = scan.nextLine();
      if (command.equals("add")){
        System.out.println("To add: ");
        String addItem = scan.nextLine();
        todo.add(addItem);
      }
      else if(command.equals("list")){
        todo.print();
      }
      else if(command.equals("remove")){
        System.out.println("Which one is removed: ");
        int index = Integer.valueOf(scan.nextLine());
        todo.remove(index);
      }else if(command.equals("stop")){
        break;
      }
    }
    
  }
  
}
