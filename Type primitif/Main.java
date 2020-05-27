/* Challenge :
Créer un variable de type byte avec n'importe quelle valeur valide
Créer un variable de type short avec n'importe quelle valeur valide
Créer un variable de type int avec n'importe quelle valeur valide
Créer un variable de type long avec comme valeur : 50000 + 10 fois la somme des valeurs de la variable byte + la variable short + la variable int
*/
public class Main {
    public static void main(String[] args) {
        byte varByte = 8;
        short varShort = 2211;
        int varInt = 9999999;

        /* Transtypage automatique car les variables sont de type hiérarchiquement inférieur et
        ne nécessitent donc pas de transtypage manuel */
        long resultat = 50000L + 10L * ( varByte + varShort + varInt );
        System.out.println(resultat);
    }
}
