package app.DI;

public class Car implements Veichel {


    private DatabaseOperation databaseOperation;

    //constractor
    public Car(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    @Override
    public void save() {
        databaseOperation.saveToDatabase("car");
    }
}
