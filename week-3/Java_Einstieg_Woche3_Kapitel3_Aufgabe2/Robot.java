class Robot {
	private boolean activated = false;

	public void printStatus() {
		System.out.println(activated);
	}
	
	
	public void setActivated(boolean boo) {
	    this.activated = boo;
	}
	
	public boolean isActivated() {
	    return activated;
	}
	

  }