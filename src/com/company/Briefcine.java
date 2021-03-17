package com.company;


import java.util.Scanner;

public class Briefcine {


    public static void main(String[] args) {


        // On declare un scanner pour lire les entrees de la console
        Scanner sc = new Scanner(System.in);

        //Creation du tableau 2d

        String[][] cinema = new String[7][10];

        //Index variables declarées

//message pour accueillir le client
        System.out.println("Bonjour et bienvenue dans votre cinema Pathe");
        sc.nextLine();

        //Demander quelle est la rangée pour la réservation et recuperer le numéro de rang
        System.out.println("Selectionner votre rangée entre 0 et 6: ");
        int rangeeSelectionnee = sc.nextInt();
        sc.nextLine();

        if (rangeeSelectionnee > 6) {
            System.out.println("Selection impossible, merci de sélectionner une autre rangée entre 0 et 6: ");
            rangeeSelectionnee = sc.nextInt();
            sc.nextLine();
        }


        //Demander le nombre de place a reserver
        System.out.println("Combien de places souhaitez vous reserver(10 max) : ");
        int nbreDePlaceDemandes = sc.nextInt();
        sc.nextLine();

        // Verifier la disponiblite sur la rangée concernée


        //parcourir et afficher le tableau


        for (int lines = 0; lines < cinema.length; lines++) {

            for (int columns = 0; columns < cinema[lines].length; columns++) {
//
                String siegeVide = "[-]";
                if ((cinema[lines][columns]) == null) {
                    cinema[lines][columns] = siegeVide;


                }
                System.out.print(cinema[lines][columns] + " ");

//on imprime le tableau

            }
            System.out.println();
        }

    }
}































