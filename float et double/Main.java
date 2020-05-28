/*
Challenge :
 - Créer une variable avec le type approprié pour stocker le nombre de pounds qui sera converti en kilogramme
 - Calculer le nombre de kilogramme basé sur le contenue de la variable précédente et stocker le résultat dans une autre variable
 - Afficher le résultat
 */

public class Main {
    public static void main(String[] args) {
        double pounds = 5d;
        double poundsConvertToKg = pounds * 0.45359237d;
        System.out.println(poundsConvertToKg);
    }
}
