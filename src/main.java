import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        classe classe = new classe("BTS2");
        election election = new election(classe);

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter une classe");
            System.out.println("2. Ajouter des étudiants à une classe");
            System.out.println("3. Afficher les étudiants d’une classe");
            System.out.println("4. Ajouter des candidats à une élection");
            System.out.println("5. Organiser une élection (permettre aux étudiants de voter)");
            System.out.println("6. Afficher les résultats de l’élection");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom de la classe : ");
                    String className = scanner.nextLine();
                    classe = new classe(className);
                    System.out.println("Classe \"" + className + "\" ajoutée avec succès !");
                    break;
                case 2:
                    System.out.print("Entrez le nom de l’étudiant : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prénom de l’étudiant : ");
                    String prenom = scanner.nextLine();
                    etudiant etudiant = new etudiant(classe.getEtudiants().size() + 1, nom, prenom);
                    classe.ajouterEtudiant(etudiant);
                    System.out.println(
                            "Étudiant \"" + prenom + " " + nom + "\" ajouté à la classe \"" + classe.getNom() + "\".");
                    break;
                case 3:
                    classe.afficherEtudiants();
                    break;
                case 4:
                    System.out.print("Entrez le nom de l’étudiant pour le transformer en candidat : ");
                    nom = scanner.nextLine();
                    System.out.print("Entrez le prénom de l’étudiant pour le transformer en candidat : ");
                    prenom = scanner.nextLine();
                    etudiant = new etudiant(classe.getEtudiants().size() + 1, nom, prenom);
                    System.out.print("Entrez un slogan pour " + prenom + " " + nom + " : ");
                    String slogan = scanner.nextLine();
                    candidat candidat = new candidat(etudiant.getId(), etudiant.getNom(), etudiant.getPrenom(), slogan);
                    classe.ajouterCandidat(candidat);
                    System.out.println(
                            prenom + " " + nom + " est maintenant candidat avec le slogan : \"" + slogan + "\".");
                    break;
                case 5:
                    System.out.println("Liste des candidats :");
                    for (int i = 0; i < classe.getCandidats().size(); i++) {
                        candidat c = classe.getCandidats().get(i);
                        System.out.println(
                                (i + 1) + ". " + c.getNom() + " " + c.getPrenom() + " : \"" + c.getSlogan() + "\"");
                    }
                    System.out.print("Entrez le numéro du candidat pour voter : ");
                    int candidatIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consommer la nouvelle ligne
                    candidat votedCandidat = classe.getCandidats().get(candidatIndex);
                    election.voterPourCandidat(votedCandidat);
                    System.out.println(
                            "Vote enregistré pour " + votedCandidat.getPrenom() + " " + votedCandidat.getNom() + " !");
                    break;
                case 6:
                    election.afficherResultats();
                    break;
                case 7:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}
