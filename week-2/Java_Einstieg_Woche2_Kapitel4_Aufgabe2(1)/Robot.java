class Robot {
    String sentence = "Ich kann sprechen!";
    RandomNumber rand = new RandomNumber();
    
   public void speakSeveralTimes (int anzahl1){
       for (int i = 0; i < anzahl1; i++)
           System.out.println(sentence);
       }

    public void speak() {
        int anzahl2 = rand.giveNumber();
        speakSeveralTimes (anzahl2);
    }

}
