# Application pour Élection des Délégués de Classe

## Description
Cette application permet de gérer les élections des délégués dans une école. Elle permet de gérer les classes, leurs étudiants, les candidatures, le processus de vote, ainsi que l'affichage des résultats.

## Fonctionnalités
- **Gestion des classes et des étudiants :**
  - Ajouter une ou plusieurs classes.
  - Ajouter des étudiants à une classe.
  - Afficher la liste des étudiants d'une classe.
- **Gestion des candidatures :**
  - Sélectionner un étudiant et le transformer en candidat.
  - Ajouter un slogan pour chaque candidat.
  - Afficher la liste des candidats avec leurs slogans.
- **Processus de vote :**
  - Permettre à chaque étudiant de voter une seule fois pour un candidat.
  - Enregistrer le vote et mettre à jour le total des votes pour chaque candidat.
- **Résultats de l’élection :**
  - Afficher le candidat ayant obtenu le plus de votes.
  - En cas d’égalité, afficher tous les candidats ex æquo.

## Structure des classes
1. **Classe Etudiant :**
   - Attributs : `int id`, `String nom`, `String prenom`
   - Méthodes : Constructeur, Getters et Setters
2. **Classe Candidat (hérite de Etudiant) :**
   - Attribut supplémentaire : `String slogan`
   - Méthodes : Constructeur, Méthode pour afficher les informations du candidat
3. **Classe Classe :**
   - Attributs : `String nom`, `ArrayList<Etudiant> etudiants`, `ArrayList<Candidat> candidats`
   - Méthodes : Ajouter un étudiant, Ajouter un candidat, Afficher la liste des étudiants, Afficher la liste des candidats
4. **Classe Election :**
   - Attributs : `Classe classe`, `HashMap<Candidat, Integer> votes`
   - Méthodes : Initialiser les votes, Permettre à un étudiant de voter, Afficher les résultats

## Installation et Exécution
1. Clonez le repository :
   ```bash
   git clone https://github.com/Youssef0801/java_delegues.git
