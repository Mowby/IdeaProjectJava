package chifoumi;

public enum Choix {
    PIERRE, CISEAUX , FEUILLE;
    static {PIERRE.faiblesse = FEUILLE;
        FEUILLE.faiblesse = CISEAUX;
        CISEAUX.faiblesse = PIERRE;
        PIERRE.force = CISEAUX;
        FEUILLE.force = PIERRE;
        CISEAUX.force = FEUILLE;
    }
    
    private Choix faiblesse, force;

    public Choix getFaiblesse() {
        return faiblesse;
    }

    public Choix getForce() {
        return force;
    }

  
}

