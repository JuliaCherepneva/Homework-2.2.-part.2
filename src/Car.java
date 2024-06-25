public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void doMaintenance () {
        System.out.println("Обслуживаем: " + getModelName());
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
        }

}

