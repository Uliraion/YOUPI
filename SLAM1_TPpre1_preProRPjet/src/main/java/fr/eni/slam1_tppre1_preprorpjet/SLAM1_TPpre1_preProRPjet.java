/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.slam1_tppre1_preprorpjet;

/**
 *
 * @author erwan
 */
public class SLAM1_TPpre1_preProRPjet {
    static fonctionDofus f = new fonctionDofus();
    
    public static void main(String[] args) {
        Personnage joueur = f.introduction();
        String affMenu = "-----------------------------------------------------\n"
                + "Que voulez-vous faire ?\n"
                + "1 - Gestions des statistiques.\n"
                + "2 - Gestions des sorts.\n"
                + "3 - Recommencer.\n"
                + "4 - Quitter le menu statistiques/sorts.\n"
                + "-----------------------------------------------------";
        String affMenuStats = "-----------------------------------------------------\n"
                + "1 - Afficher les statistiques.\n"
                + "2 - Modifier les statistiques.\n"
                + "3 - Remettre les statistiques à zéro.\n"
                + "4 - (retour)\n"
                + "-----------------------------------------------------";
        String affMenuSorts = "-----------------------------------------------------\n" 
                + "1 - Afficher les sorts.\n"
                + "2 - Afficher les sorts en combat.\n"
                + "3 - (retour)\n"
                + "-----------------------------------------------------";
        String affStats = "-----------------------------------------------------\n"
                + "Quelle statistique voulez-vous augmenter ?\n"
                + "1 - Vitalité\n"
                + "2 - Sagesse\n"
                + "3 - Intelligence\n"
                + "4 - Force\n"
                + "5 - Chance\n"
                + "6 - Agilité\n"
                + "-----------------------------------------------------";
    }
}
