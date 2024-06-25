public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void doMaintenance () {
        System.out.println("Обслуживаем: " + getModelName());
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}

