import java.util.Observable;
import java.util.Observer;
import java.util.Stack;



public class NotRoom implements Observer{
    
    private Stack<Observable> senders;
	private Stack<Object> arguments;

	public NotRoom() {
		senders = new Stack<Observable>();
		arguments = new Stack<Object>();
	}

	/**
	 * implÃ©mentation de la seule mÃ©thode de l'interface java.util.Observer Ã 
	 * chaque exÃ©cution de cette mÃ©thode, celle-ci se contente d'empiler les
	 * paramÃ¨tres transmis observable et arg respectivement dans 2 piles senders
	 * et arguments
	 */
	public void update(Observable observable, Object arg) {
		senders.push(observable);
		arguments.push(arg);
	}

	public Stack<Observable> senders() {
		return senders;
	}

	public Stack<Object> arguments() {
		return arguments;
	}
	
    
}