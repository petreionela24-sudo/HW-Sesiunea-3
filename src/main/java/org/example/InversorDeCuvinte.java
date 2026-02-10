package org.example;

public class InversorDeCuvinte {

        static void main(String[] args) {

            String text = "Java";

            // Apelăm metoda și salvăm rezultatul
            String textInversat = inverseazaCuvant(text);

            // Afișăm rezultatul
            System.out.println("Cuvântul original: " + text);
            System.out.println("Cuvântul inversat: " + textInversat);
        }

        public static String inverseazaCuvant(String cuvant) {

            String rezultat = ""; // Aici am construit noul cuvânt

            // Am pornit de la  (lungime - 1) până la 0
            for (int i = cuvant.length() - 1; i >= 0; i--) {
                rezultat = rezultat + cuvant.charAt(i);
            }

            return rezultat;
        }
    }

