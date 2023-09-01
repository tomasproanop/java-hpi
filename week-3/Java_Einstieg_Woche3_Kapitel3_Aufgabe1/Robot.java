class Robot {
    
	private int batteryRuntime = 0;
	
    private boolean notNegative(int checkNumber) {  
    return checkNumber >= 0;
}

	public void setBatteryRuntime(int newTime) {
	    
	    if (notNegative(newTime)) {
		    batteryRuntime = newTime;
		    }
	}

	public int getBatteryRuntime() {
		return batteryRuntime;
	}

}
