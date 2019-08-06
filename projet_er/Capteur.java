
import java.util.Observable;
import java.util.ArrayList;

/**
 * Write a description of interface Capteur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  Capteur extends Observable
{
    /** ConcreteSubject est composÃ© d'une liste list */
	private ArrayList<String> list;

	public Capteur() {
		list = new ArrayList<String>();
	}

	public void insert(String name) {
		list.add(name);
		setChanged();
		notifyObservers(name);
	}

	public String toString() {
		return list.toString();
	}
}
