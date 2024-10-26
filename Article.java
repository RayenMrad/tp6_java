public class Article extends Document {
    private String nom_auteur;

    public Article(String titre, int numero_id, int nb_pages, String nom_auteur) {
        super(titre, numero_id, nb_pages);
        this.nom_auteur = nom_auteur;
    }

    public String getAuteur() {
        return nom_auteur;
    }

  
}
