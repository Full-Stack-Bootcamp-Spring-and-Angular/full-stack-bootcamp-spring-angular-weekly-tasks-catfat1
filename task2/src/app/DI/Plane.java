package app.DI;

public class Plane implements Veichel {
    private DatabaseOperation databaseOperation;

    public Plane(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    @Override
    public void save() {
        databaseOperation.saveToDatabase("plane");
    }
}
