package chifoumi;

public class TestIHMSaisie {
        public static void main (String[] arg) {
            IHMSaisie saisie = new IHMSaisie("Gontran");
            Choix choix = saisie.proposerChoix();
            System.out.println("Le choix de Gontran est " + choix);
        }
}
