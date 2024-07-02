public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doMaintenance () {
        System.out.println("Обслуживаем: " + getModelName());
        updateTyre();
        checkEngine();
        }

}

