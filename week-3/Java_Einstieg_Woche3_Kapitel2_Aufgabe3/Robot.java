class Robot {
	private String internalStorage = "416e737765723f203432";
	
	private void flushStorage() {
	    
	    internalStorage = "";
	    
	}
	
	public void safeFlushStorage(String str){
	   
	   String pw = "pw_duke";
	   
	   if (str == pw){
	        System.out.println(internalStorage);
	        flushStorage();
	    }
	}

}
