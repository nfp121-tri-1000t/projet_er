import java.util.ArrayList;

public class Medecine implements EquipeMed{
    private ArrayList<Observer> observers;

    public void notificationsGrabber(){
        observers = new ArrayList<Observer>();
    }
    
    public void register(Observer newObserver){
        observers.add(newObserver);
    }
    
    public void unregister(Observer deleteObserver){
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer "+ (observerIndex+1)+ " deleted");
        observers.remove(observerIndex);
        
    }
    public void notifyObserver(){
        for(Observer observer:observers){
            observer.update();
        }
    }
        
    
    
}