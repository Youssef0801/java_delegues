import java.util.HashMap;
import java.util.Map;

public class election {
    private classe classe;
    private HashMap<candidat, Integer> votes;

    public election(classe classe) {
        this.classe = classe;
        this.votes = new HashMap<>();
        initialiserVotes();
    }

    private void initialiserVotes() {
        for (candidat candidat : classe.getCandidats()) {
            votes.put(candidat, 0);
        }
    }

    public void voterPourCandidat(candidat candidat) {
        if (votes.containsKey(candidat)) {
            votes.put(candidat, votes.get(candidat) + 1);
        }
    }

    public void afficherResultats() {
        int maxVotes = 0;
        for (int voteCount : votes.values()) {
            if (voteCount > maxVotes) {
                maxVotes = voteCount;
            }
        }

        for (Map.Entry<candidat, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey().getNom() + " : " + entry.getValue() + " votes");
        }

        if (maxVotes == 0) {
            System.out.println("Aucun vote n'a été enregistré.");
        } else {
            System.out.println("Candidat(s) avec le plus de votes :");
            for (Map.Entry<candidat, Integer> entry : votes.entrySet()) {
                if (entry.getValue() == maxVotes) {
                    System.out.println(entry.getKey().getNom() + " " + entry.getKey().getPrenom());
                }
            }
        }
    }
}
