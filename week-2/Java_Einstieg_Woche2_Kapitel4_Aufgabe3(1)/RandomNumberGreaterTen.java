class RandomNumberGreaterTen {
    
    RandomNumber rand = new RandomNumber();
    
    int greaterTen(){
        int i = rand.giveNumber();
        while (i <= 10) {
            i = rand.giveNumber();
        } return i;
    }
    
}