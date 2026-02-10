public class SalutLume {

    public static double sum(double nr1, double nr2)
    {
        return nr1 + nr2;
    }

    // Metoda 'main' este punctul de start al oricărei aplicații Java
    public static void main(String[] args)
    {
        // Comanda care afișează text în consolă
        System.out.println("Salut, Lume! Primul meu program cu Gradle!");
        System.out.println("Salut din nou!");

        int varsta = 33;
        System.out.println("1. Varsta mea este: " + varsta);

        varsta = 34;
        System.out.println("2. Varsta mea este: " + varsta);

        varsta = 40;
        System.out.println("3. Varsta mea este: " + varsta);

        double nr1 = 0.1;
        double nr2 = 0.2;
        double suma = nr1 + nr2;

        double suma2 = sum(1, 5);

        System.out.println("Suma este: " + suma);
        System.out.println("Suma calculata cu ajutorul functiei sum(): " + suma2);

        // Exemple pentru operatorul logic SI &&
        boolean esteMajor = true;
        boolean areBuletinul = true;

        boolean poateVota = esteMajor && areBuletinul;

        System.out.println("Poate vota? " + poateVota);

        // Exemple operator logic SAU ||

        boolean mergLaMare = false;
        boolean mergLaMunte = true;

        boolean maDistrez = mergLaMare || mergLaMunte;
        System.out.println("Ma distrez? --> " + maDistrez);

        boolean negatieMaDistrez = !maDistrez;
        System.out.println("Afisam rezultatul negat al lui ma distrez: " + negatieMaDistrez);

    }
}
