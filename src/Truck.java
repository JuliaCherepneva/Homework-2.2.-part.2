public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doMaintenance () {
        System.out.println("Обслуживаем: " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}

