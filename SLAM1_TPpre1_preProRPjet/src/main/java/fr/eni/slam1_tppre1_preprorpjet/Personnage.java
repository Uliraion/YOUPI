/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.slam1_tppre1_preprorpjet;

/**
 *
 * @author erwan
 */
public class Personnage {
    private String nom;
    private String classe;
    private int niveau;
    private int pv;
    private int sagesse;
    private int force;
    private int intelligence;
    private int agilite;
    private int chance;
    private int pointDeCompetence;
    private Sort sortUn;
    private Sort sortDeux;
    private Sort sortTrois;
    public Personnage(String unNom, String uneClasse, int unNiveau, Sort unSortUn, Sort unSortDeux, Sort unSortTrois)
    {
        this.nom = unNom;
        this.classe = uneClasse;
        this.niveau = unNiveau;
        this.sortUn = unSortUn;
        this.sortDeux = unSortDeux;
        this.sortTrois = unSortTrois;
        this.pv = 50;
        this.sagesse = 0;
        this.force = 0;
        this.intelligence = 0;
        this.agilite = 0;
        this.chance = 0;
        this.pointDeCompetence = (this.niveau-1)*5;
    }

    public void remettreZeroStats()
    {
        /*
        Remettre les statistiques à zéro (sauf la statistique PV qui sera remise à 50).
        Cette fonction rendra de nouveau disponible TOUS les points de compétence. 
        */
    }
    public void affStats()
    {
        /*
        Cette fonction affiche la classe, le nom du personnage ainsi que toutes les statistiques.
        Vous pourrez vous aider des fonctions affX()que vous écrirez par la suite.
        */
    }   
    public void affPv()
    {
        // Affiche la statistique pv. 
    }
    public void affSages()
    {
        // Affiche la statistique sagesse.
    }
    public void affIntel()
    {
        // Affiche la statistique intelligence.
    }
    public void affForce()
    {
        // Affiche la statistique force.
    }
    public void affChanc()
    {
        // Affiche la statistique chance.
    }
    public void affAgili()
    {
        // Affiche la statistique agilité.
    }    
    
    public void affSorts()
    {
        /*
        Afficher les 3 sorts (sortUn, sortDeux, sortTrois) à l'aide de la fonction affSort (disponible dans la classe Sort).
        */
    }
    
    public void affSortsCombat()
    {
        /*
        Utiliser affDegatSort sur les trois sorts du personnage.
        Cela servira à afficher les dégâts des sorts en combat :
        -> Contrairement à affSorts qui affiche les dégâts de base.
        */
    }
    
    public void augmenterStats(int nbAugmenter, int choixStats)
    {
        /*
        Augmente la statistiques de nbAugmenter choisies via choixStats :
        -> 1 : Vitalité
        -> 2 : Sagesse
        -> 3 : Intelligence
        -> 4 : Force
        -> 5 : Chance
        -> 6 : Agilité
        
        Dépense autant de points de compétence qu'une statistique a été augmentée.
        /!\ Attention, on ne peut pas dépenser les points que nous n'avons pas.
        Dans ce cas, il faudra afficher "Pas assez de point".
        */   
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getSagesse() {
        return sagesse;
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getPointDeCompetence() {
        return pointDeCompetence;
    }

    public void setPointDeCompetence(int pointDeCompetence) {
        this.pointDeCompetence = pointDeCompetence;
    }

    public Sort getSortUn() {
        return sortUn;
    }

    public void setSortUn(Sort sortUn) {
        this.sortUn = sortUn;
    }

    public Sort getSortDeux() {
        return sortDeux;
    }

    public void setSortDeux(Sort sortDeux) {
        this.sortDeux = sortDeux;
    }

    public Sort getSortTrois() {
        return sortTrois;
    }

    public void setSortTrois(Sort sortTrois) {
        this.sortTrois = sortTrois;
    }
    
}
