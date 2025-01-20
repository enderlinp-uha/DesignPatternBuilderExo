public class CarDirector {
    public static Car makeCarOption1(int serialNumber) {
        return new Car.BuilderCar(serialNumber).setColor(EColor.RED).isAutomatic().build();
    }
    public static Car makeCarOption2(int serialNumber) {
        return new Car.BuilderCar(serialNumber).setColor(EColor.ORANGE).isESP().build();
    }
}
