import java.util.HashMap;

public class IOU {
  private HashMap<String, Double> own;
  
  public IOU(){
    this.own = new HashMap<>();
  }


  public void setSum(String toWhom, double amount){
    this.own.put(toWhom, amount);
  }


  public double howMuchDoIOweTo(String toWhom){
    if(this.own.containsKey(toWhom)){
      return this.own.get(toWhom);
    }else{
      return 0.0;
    }
  }


}
