
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
        
    private HashMap<LicensePlate, String> list ;
    
    public VehicleRegistry()
    {
        list = new HashMap<>();        
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(list.containsKey(licensePlate)){            
            return false;
        }        
        list.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return list.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(list.containsKey(licensePlate))
        {
            list.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate p : list.keySet())
        System.out.println(p.toString());
    }
    
    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();                
        for(String p : list.values())
        {
        if(names.contains(p))
        {
           continue; 
        }
        else{
            names.add(p);
        }
        }
        for(String name : names)
        System.out.println(name);
    }
    
}