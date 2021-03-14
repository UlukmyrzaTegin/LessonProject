package less_11_1_enum.models;

/**
 * TheSusanin
 * 3/14/2021 Mar
 */
public enum Season {
    SPRING(20), WINTER(-18), AUTUMN(15), SUMMER(25);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
