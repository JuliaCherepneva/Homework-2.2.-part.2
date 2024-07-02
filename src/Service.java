public interface Service {

    void doMaintenance();

    public default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
