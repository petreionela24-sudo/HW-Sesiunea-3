import java.util.Scanner; // 1. Importăm unealta

public class Interactiune {
    public static void main(String[] args) {
        // 2. Creăm obiectul Scanner conectat la tastatură (System.in)
        Scanner cititor = new Scanner(System.in);

        System.out.print("Cati ani ai? ");
        // 3. Citim un număr întreg
        int varsta = cititor.nextInt();

        System.out.println("Peste un an vei avea: " + (varsta + 1));

        // 4. Închidem scannerul (bună practică)
        cititor.close();
    }
}

