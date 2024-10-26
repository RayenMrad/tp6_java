public class Livre extends Article {
    private String editeur;

    public Livre(String titre, int id, int nombrePages, String auteur, String editeur) {
        super(titre, id, nombrePages, auteur);
        this.editeur = editeur;
    }

    public String getEditeur() {
        return editeur;
    }

  
    
}
