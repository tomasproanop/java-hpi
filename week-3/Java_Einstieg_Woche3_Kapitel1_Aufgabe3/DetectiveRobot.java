class DetectiveRobot extends Robot {

    int spareBatteryRuntime = 5;
    
    int giveTotalBatteryRuntime() {
        
        int a = this.giveBatteryRuntime();
        
        return spareBatteryRuntime + a;
    }
    
}
