public abstract class Transport implements Service {
    private String modelName;
    private int wheelsCount;
    Transport[] transports = new Transport[6];


    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.transports = transports;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Transport[] getTransports() {
        return transports;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public abstract void doMaintenance();

}
