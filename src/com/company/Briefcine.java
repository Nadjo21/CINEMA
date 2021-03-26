package com.company;


import java.util.Scanner;

public class Briefcine {

    //creation fonction pour afficher la salle
    private static void affichagedelasalle(String[][] salle) {
        for (int i = 0; i < salle.length; i++) {
            for (int j = 0; j < salle[i].length; j++) {


                System.out.print("[" + salle[i][j] + "]");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        //Declaration du scanner

        Scanner sc = new Scanner(System.in);

        //Déclaration du tableau pour representer la salle de cinema

        String[][] salle = new String[7][10];


        //Afficher la salle de cinema


        for (int i = 0; i < salle.length; i++) {
            for (int j = 0; j < salle[i].length; j++) {

                salle[i][j] = "-";

                System.out.print("[" + salle[i][j] + "]");
            }
            System.out.println();
        }


//Demarrage grande boucle pour répéter l'ensemble du code ci dessous

        for (int a = 0; a < 10; a++) {


            System.out.println("Bonjour et bienvenue dans votre cinéma!");

//demander au client quelle rangée reserver

            System.out.println("Pour reserver ,merci de choisir votre rangée de 1 a 7: ");
            int rangeeDemandee = sc.nextInt();
            sc.nextLine();
            if (rangeeDemandee > 7) {
                System.out.println("Merci de ressaisir un nombre de places entre 1 et 7: ");
                rangeeDemandee = sc.nextInt();
                sc.nextLine();
            }


//demander au client combien de places il souhaite reserver

            System.out.println("Combien de place souhaitez vous reserver(max 10): ");
            int placesAreserver = sc.nextInt();
            sc.nextLine();

            if (placesAreserver > 10) {
                System.out.println("Merci de ressaisir un nombre de places entre 0 et 10: ");
                placesAreserver = sc.nextInt();
                sc.nextLine();
            }

//Boucle pour parcourir la salle de cinema en y incluant les informations recuperees precedemment (sans imprimer le tableau)



            for (int l = 0; l < salle.length; l++) {
                if (l == rangeeDemandee - 1) { //on precise le -1 pour prendre en compte le demarrage à 0 de l'index du tableau
                    for (int c =0; c < salle[l].length && c < placesAreserver; c++) {
                        if (salle[l][c] == "-") {
                            salle[l][c] = "X";

                        }

                    }

                }

                //on reimprime le tableau avec les informations

                affichagedelasalle(salle);

            }

        }

    }


}

































