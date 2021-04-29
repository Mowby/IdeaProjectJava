package chifoumi;

public class JeuUnTour {
    private Joueur joueurA;
    private Joueur joueurB;

    public JeuUnTour(Joueur joueurA, Joueur joueurB) {
        this.joueurA = joueurA;
        this.joueurB = joueurB;
    }

    JeuUnTour(String nomJoueurA, String nomJoueurB){
        joueurA = new Joueur(nomJoueurA);
        joueurB = new Joueur(nomJoueurB);
        jouer();
    }

    public void jouer(){
        tour();
        joueurA.ecrireScore();
        joueurB.ecrireScore();
        conclure();
    }

    public void tour(){
        Choix choixA = joueurA.choisir();
        Choix choixB = joueurB.choisir();
        if( choixA.getFaiblesse() == choixB ) {
            joueurB.crediter();
        }
        if ( choixB.getFaiblesse() == choixA ) {
            joueurA.crediter();
        }
        if (choixA == choixB){
            System.out.println("Try again guys ! ");
        }
        /*else if (choixA == Choix.FEUILLE && choixB == Choix.PIERRE){
            joueurA.crediter();
        }
        else if (choixA == Choix.FEUILLE && choixB == Choix.CISEAUX){
            joueurB.crediter();
        }
        else if (choixA == Choix.PIERRE && choixB == Choix.FEUILLE){
            joueurB.crediter();
        }
        else if (choixA == Choix.PIERRE && choixB == Choix.CISEAUX){
            joueurA.crediter();
        }
        else if (choixA == Choix.CISEAUX && choixB == Choix.FEUILLE){
            joueurA.crediter();
        }
        else if (choixA == Choix.CISEAUX && choixB == Choix.PIERRE){
            joueurB.crediter();
        }*/
    }

    public void conclure(){
        if (joueurA.getScore() > joueurB.getScore()){
            System.out.println(joueurA.getNomJoueur() + " est le BOSS DU GAME !");
        }
        else
            System.out.println(joueurB.getNomJoueur() + " est le BOSS DU GAME !");
        }


};



