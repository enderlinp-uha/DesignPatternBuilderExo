import java.util.ArrayList;

public class Car {

    private int serialNumber = 0;
    private String color = "";
    private ArrayList<String> options = new ArrayList<String>();

    private Car(BuilderCar builder) {
        this.serialNumber = builder.serialNumber;
        this.color = builder.color;
        this.options = builder.options;
    }

    public static class BuilderCar {
        private int serialNumber = 0;
        private String color = "";
        private ArrayList<String> options = new ArrayList<String>();

        public BuilderCar(int serialNumber) {
            this.serialNumber = serialNumber;
        }

        public BuilderCar setColor(EColor color) {
            this.color = color.toString();
            return this;
        }

        public BuilderCar isAutomatic() {
            this.options.add(EGear.AUTOMATIC.toString());
            return this;
        }

        public BuilderCar isESP() {
            this.options.add(ESecurity.ESP.toString());
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [serialNumber=" + this.serialNumber + ", color=" + this.color + ", options=" + this.options + "]";
    }

}
