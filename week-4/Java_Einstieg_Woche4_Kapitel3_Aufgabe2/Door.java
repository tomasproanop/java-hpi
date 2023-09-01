import java.util.HashMap;

class Door {

	public HashMap<String, AccessCode> doorCodes = new HashMap<>();

	public HashMap<String, AccessCode> getDoorCodes() {
		return doorCodes;
	}
	
	public void addDoorKey(String str, AccessCode aC) {
	    this.doorCodes.put(str, aC);
	}
	
	
	public void useCode(String customer){

    if (doorCodes.containsKey(customer)){

        int wasUsed = 0;

        wasUsed = doorCodes.get(customer).getNumberOfTimesUsed();
        wasUsed +=1;
        doorCodes.get(customer).setNumberOfTimesUsed(wasUsed);

        if (doorCodes.get(customer).getNumberOfTimesUsed()>2){
            doorCodes.get(customer).setValid(false);
            System.out.println("Schlüssel nicht mehr gültig");
        } else {
        System.out.println("Schlüssel gültig");
        }
    }
}

	
}
