import java.util.ArrayList;
import java.util.HashMap;

 class Robot {

 public ArrayList<AccessCode> usedAccessCodes= new ArrayList<>();
 public ArrayList<AccessCode> unusedAccessCodes= new ArrayList<>();
 public HashMap<String, ArrayList> codeHashMap= new HashMap<>();

  Robot() {}

   public void saveCodes(ArrayList<AccessCode> liste) {  
      for (int i = 0; i < liste.size(); i++){
            AccessCode element = liste.get(i);
            if (element.getUsed() == true){
                    usedAccessCodes.add(element);
              } else {
                    unusedAccessCodes.add(element);
              }
      }
  }
public void buildHashMap() {
     codeHashMap.put("used",usedAccessCodes);
     codeHashMap.put("unused",unusedAccessCodes);
}

}