import java.util.ArrayList;
import java.io.*;

public class EquipeMed implements NotRoom{
    private ArrayList<Observer> observers;
    private String name;

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