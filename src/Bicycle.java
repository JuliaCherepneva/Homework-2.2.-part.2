public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

        @Override
        public void doMaintenance () {
            System.out.println("Обслуживаем: " + getModelName());
            updateTyre();
        }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}


