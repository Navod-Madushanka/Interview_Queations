package design_patterns.Observer;

import java.util.HashSet;

interface Observer{
    void update(String message);
}

class Subject{
    private HashSet<Observer> observerSet;

    public Subject(){
        this.observerSet = new HashSet<>();
    }

    public void addObserver(Observer observer){
        if(!observerSet.contains(observer)){
            observerSet.add(observer);
        }
    }

    public void removeObserver(Observer observer){
        observerSet.remove(observer);
    }

    public void notifyObservers(String message){
        for(Observer observer : observerSet){
            observer.update(message);
        }
    }
}

class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Observer: " + name + " received: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver concreteObserver1 = new ConcreteObserver("Observer 1");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("Observer 2");

        subject.addObserver(concreteObserver1);
        subject.addObserver(concreteObserver2);

        subject.notifyObservers("This is a Message");

        subject.removeObserver(concreteObserver1);

        subject.notifyObservers("Another Message");


    }
}
