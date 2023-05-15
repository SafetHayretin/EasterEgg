package Observers;

public class Chick implements Observer {
    @Override
    public void update() {
        System.out.println("The eggs are ready!");
    }
}