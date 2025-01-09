public class candidat extends etudiant {
    private String slogan;

    public candidat(int id, String nom, String prenom, String slogan) {
        super(id, nom, prenom);
        this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void afficherCandidat() {
        System.out.println("Nom: " + getNom() + " " + getPrenom());
        System.out.println("Slogan: " + slogan);
    }
}
