public class Robot {
	private String name;
	private String[] accessCodes = new String[]{"Mein ", "Zugangscode ", "ist ", "mein ", "Name: "};

	public Robot(String name) {
	this.name = name;
	}


	public String getAccessCode() {
		// Füge hier dein Code ein
		
		 String zugangscode = "";
		for (String str : this.accessCodes) {
		    zugangscode += str;
		}
		return zugangscode + this.name;
	}
}
