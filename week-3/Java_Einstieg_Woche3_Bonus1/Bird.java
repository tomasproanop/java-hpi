public class Bird {
    protected boolean canFly;
    
    public void sayHello() {

    }

    public void sayIfCanFly() {
        if (canFly){
            System.out.println("Ich kann fliegen");
        } else {
            System.out.println("Ich kann nicht fliegen");
        }
    }
}