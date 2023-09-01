abstract public class AbstractLock {
    
int secretNumber;
String secretWord;
int numberOfAttempts;
    
public abstract boolean openWithSecretNumber(int number, int attempt);

public abstract boolean openWithSecretWord(String word);

}
