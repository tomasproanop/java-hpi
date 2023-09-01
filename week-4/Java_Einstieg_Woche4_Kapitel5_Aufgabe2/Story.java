public class Story {

    public static void main(String[] args) {
        TheChase theChase = new TheChase();
        Parrot paco = new Parrot();     
        Robot ronja = new Robot();      
        SuperVillain eikeVil = new SuperVillain();

        theChase.addEntity(paco);
        theChase.addEntity(ronja);
        theChase.addEntity(eikeVil);

        theChase.chase();
    }

}