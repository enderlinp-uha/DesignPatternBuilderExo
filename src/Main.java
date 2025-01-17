//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Votre tâche est de créer un système de commande de voiture. Un client doit pouvoir choisir différentes options pour sa voiture.
        Les options sont en Enum et non en String.
        Créer au moins 2 exemples de voiture avec le Director, et un exemple libre. Afficher le contenu via un toString.
        */
        Car car1 = CarDirector.makeCarOption1(1001);
        System.out.println(car1);

        Car car2 = CarDirector.makeCarOption2(1002);
        System.out.println(car2);
    }
}