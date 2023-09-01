public class Zoo{
    public static void main(String[] args) {
        
        Bird[] animals = {new Duck(), new Parrot(), new Penguin()};
        
        for (int i=0; i < animals.length; i++){
            animals[i].sayHello();
            animals[i].sayIfCanFly();
        }
    }
}