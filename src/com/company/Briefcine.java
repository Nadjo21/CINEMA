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

        //Initialisation du tableau pour representer la salle de cinema

        String[][] salle = new String[7][10];


        //Afficher la salle de cinema


        for (int i = 0; i < salle.length; i++) {
            for (int j = 0; j < salle[i].length; j++) {

                salle[i][j] = "-";

                System.out.print("[" + salle[i][j] + "]");
            }
            System.out.println();
        }

        //creation de la grande boucle pour repeter le code


        System.out.println("Bonjour et bienvenue dans votre cinéma!");


        Integer[] positionSurLaRangee = new Integer[7];
        positionSurLaRangee[0] = 0;
        positionSurLaRangee[1] = 0;
        positionSurLaRangee[2] = 0;
        positionSurLaRangee[3] = 0;
        positionSurLaRangee[4] = 0;
        positionSurLaRangee[5] = 0;
        positionSurLaRangee[6] = 0;



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

        System.out.println("Combien de places souhaitez vous reserver(max 10): ");
        int placesAreserver = sc.nextInt();
        sc.nextLine();

        if (placesAreserver > 10) {
            System.out.println("Merci de ressaisir un nombre de places entre 0 et 10: ");
            placesAreserver = sc.nextInt();
            sc.nextLine();
        }


        boolean siegeDispo = true;

        while (siegeDispo) {

            for (int i = 0; i < salle.length; i++) {

                if (i == rangeeDemandee - 1) {
                    int position = positionSurLaRangee[i];

                    for (int j = position; j < position + placesAreserver && j < salle[i].length; j++) {

                        if (salle[i][j] == "-") {
                            salle[i][j] = "x";
                            positionSurLaRangee[i]++;
                            System.out.println(positionSurLaRangee[i]);
                            if (positionSurLaRangee[i] >= 10) {
                                System.out.println("Plus de places disponibles sur la rangee " + rangeeDemandee);
                            }

                        }


                    }
                    affichagedelasalle(salle);




                    //demander au client quelle rangée reserver

                    System.out.println("Pour reserver ,merci de choisir votre rangée de 1 a 7: ");
                    rangeeDemandee = sc.nextInt();
                    sc.nextLine();
                    if (rangeeDemandee > 7) {
                        System.out.println("Merci de ressaisir un nombre de places entre 1 et 7: ");
                        rangeeDemandee = sc.nextInt();
                        sc.nextLine();
                    }


//demander au client combien de places il souhaite reserver

                    System.out.println("Combien de places souhaitez vous reserver(max 10): ");
                    placesAreserver = sc.nextInt();
                    sc.nextLine();

                    if (placesAreserver > 10) {
                        System.out.println("Merci de ressaisir un nombre de places entre 0 et 10: ");
                        placesAreserver = sc.nextInt();
                        sc.nextLine();
                    }


                }
            }
        }
    }

}














































