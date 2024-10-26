public class Periodique extends Document {
    private String frequence;

    public Periodique(String titre, int numero_id, int nb_pages, String frequence) {
        super(titre, numero_id, nb_pages);
        this.frequence = frequence;
    }

    public String getFrequence() {
        return frequence;
    }

    
}
