class Parrot extends Animal {

	void speak() {
		System.out.println("Ich kann sprechen");
	}
	
	void speak(String str) {
		System.out.println(str);
	}
	
	
	@Override
	void move() {
		System.out.println("Ich fliege");
	}

}