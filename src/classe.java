import java.util.ArrayList;

public class classe {
    private String nom;
    private ArrayList<etudiant> etudiants;
    private ArrayList<candidat> candidats;

    public classe(String nom) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();
        this.candidats = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<etudiant> getEtudiants() {
        return etudiants;
    }

    public ArrayList<candidat> getCandidats() {
        return candidats;
    }

    public void ajouterEtudiant(etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void ajouterCandidat(candidat candidat) {
        candidats.add(candidat);
    }

    public void afficherEtudiants() {
        for (etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + " " + etudiant.getPrenom());
        }
    }

    public void afficherCandidats() {
        for (candidat candidat : candidats) {
            candidat.afficherCandidat();
        }
    }

    public etudiant getEtudiantById(int id) {
        for (etudiant etudiant : etudiants) {
            if (etudiant.getId() == id) {
                return etudiant;
            }
        }
        return null;
    }
}
