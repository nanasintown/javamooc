
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> Storage = new HashMap<>();

    public StorageFacility() {
        this.Storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.Storage.putIfAbsent(unit, new ArrayList<>());
        this.Storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.Storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        if(!this.Storage.get(storageUnit).equals("null"))
        {
            this.Storage.get(storageUnit).remove(item);
            if(this.Storage.get(storageUnit).size()==0){
            this.Storage.remove(storageUnit);
            }            
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> unit = new ArrayList<>();         
        for(String s : this.Storage.keySet()){
            unit.add(s);
        }
        return unit;
    }
    
   
    
}