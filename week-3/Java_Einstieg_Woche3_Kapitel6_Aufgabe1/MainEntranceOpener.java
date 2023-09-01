class MainEntranceOpener extends AbstractOpener {

    @Override
	public boolean open(String isString){
	    if (isString.equals("MainEntrance")) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
