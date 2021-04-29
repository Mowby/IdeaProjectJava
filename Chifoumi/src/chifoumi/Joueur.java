package chifoumi;

public class Joueur {
    private String nomJoueur;
    private int score = 0;
    private IHMSaisie saisie;

    Joueur(String nom){
        this.nomJoueur = nom;
        this.saisie = new IHMSaisie(nom);
    };

    public String getNomJoueur(){
        return nomJoueur;
    };

    public void ecrireNomJoueur(String nomJ){
        this.nomJoueur = nomJ;
    };
    public int crediter(){
        return this.score += 1;
    };
    public Choix choisir(){
        Choix choix = saisie.proposerChoix();
        return choix;
    };

    public int getScore() {
        return score;
    }

    public void ecrireScore(){
        System.out.println("Le score de " + nomJoueur + " est " + score);
    };
}
