// difference between composition and inheritance -
// inheritance has "is" relationship which means that the subclass is a type of superclass and composition has "has" relationship which means that the class has a type of another class.
class Engine { //parent1 class
    void start() {
        System.out.println("Engine started");
    }
}
class Car {//parent2 class
    Engine e = new Engine(); //composition 
    void stop() {
        System.out.println("Car stopped");
        e.start();
    }
}
//when u want to connect to parent classes to child class then we use composition

public class Composition {
    public static void main(String[] args) {
        Car c = new Car();
        c.stop(); //it will automatically execute the start method of Engine class

    }

}
