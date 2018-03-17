/**
 * class of secret number.
 * @author Piyaphol Wiengperm.
 */
public class Secret extends java.util.Observable{
    private int secret;

    /**
     * Constructor of Secret class.
     */
    public Secret(){ this.secret = 0;}

    /**
     * Set secret number that recieved from guessing game when user play the game.
     * @param secretNumber is secret number.
     */
    public void setSecret(int secretNumber){
        secret = secretNumber;
        setChanged();
        notifyObservers();
    }

    /**
     * get secret number to use.
     * @return secret number.
     */
    public int getSecret(){
        return secret;
    }
}
