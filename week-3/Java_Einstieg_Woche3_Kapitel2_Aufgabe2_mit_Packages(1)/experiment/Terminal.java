package experiment;

public class Terminal extends TestRobot {
    
    public void hackRobot(TestRobot tr) {
        
        System.out.println(tr.numberOfProcessorCores);
        System.out.println(tr.id);
        System.out.println(tr.hasFirewall);
        
    }

}
