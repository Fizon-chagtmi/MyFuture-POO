public class Voiture {
    private String marque;
    private String couleur;
    private double kilometrage;

    public Voiture(String marque, String couleur, double kilometrage) {
        this.marque = marque;
        this.couleur = couleur;
        this.kilometrage = kilometrage;
    }
    public double getKilometrage() {
        return this.kilometrage;
    }
    public void afficher() {
        System.out.println("Marque: " + marque + " | Couleur: " + couleur + " | Kilométrage: " + kilometrage + " km");
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("=== SAISIE VOITURE 1 ===");
        System.out.print("Entrez la marque : ");
        String marque1 = scanner.nextLine();
        System.out.print("Entrez la couleur : ");
        String couleur1 = scanner.nextLine();
        System.out.print("Entrez le kilométrage : ");
        double km1 = Double.parseDouble(scanner.nextLine());

        Voiture v1 = new Voiture(marque1, couleur1, km1);

        System.out.println("\n=== SAISIE VOITURE 2 ===");
        System.out.print("Entrez la marque : ");
        String marque2 = scanner.nextLine();
        System.out.print("Entrez la couleur : ");
        String couleur2 = scanner.nextLine();
        System.out.print("Entrez le kilométrage : ");
        double km2 = Double.parseDouble(scanner.nextLine());

        Voiture v2 = new Voiture(marque2, couleur2, km2);

        boolean continuer = true;
        while (continuer) {
            System.out.println("1. Afficher les deux voitures");
            System.out.println("2. Somme kilométrage");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option (1-3) : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.println("\n--- Détails des deux voitures ---");
                    System.out.print("Voiture 1 -> ");
                    v1.afficher();
                    System.out.print("Voiture 2 -> ");
                    v2.afficher();
                    break;
                case "2":
                    double somme = v1.getKilometrage() + v2.getKilometrage();
                    System.out.println("\n--- Somme des kilométrages ---");
                    System.out.println("La somme des kilométrages est : " + somme + " km");
                    break;
                case "3":
                    continuer = false;
                    System.out.println("Fin du programme. Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
        scanner.close();
    }
}