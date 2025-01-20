public class Main {
    /*
        Votre tâche est de créer un système de commande de voiture. Un client doit pouvoir choisir différentes options pour sa voiture.
        Les options sont en Enum et non en String.
        Créer au moins 2 exemples de voiture avec le Director, et un exemple libre. Afficher le contenu via un toString.
    */
    public static void main(String[] args) {
        Car car1 = CarDirector.makeCarOption1(1001);
        System.out.println(car1);

        Car car2 = CarDirector.makeCarOption2(1002);
        System.out.println(car2);

        Car.BuilderCar car3 = new Car.BuilderCar(1003);
        car3.setColor(EColor.YELLOW);
        car3.isAutomatic();
        car3.isESP();
        System.out.println(car3.build());
    }
}