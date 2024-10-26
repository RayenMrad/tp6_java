public class  Document {
    private String titre;
    private int numero_id;
    private int nb_pages;

    void Edition(){
            System.out.println("le type : document"+"le titre est : "+this.titre +"| le numero de identification est : "+this.numero_id+" | le nombres de pages est : "+this.nb_pages+"\n");
    }

    public Document (String titre, int numero_id, int nb_pages) {
        this.titre = titre;
        this.numero_id = numero_id;
        this.nb_pages = nb_pages;
    }

    String getTitre(){
        return titre;
    }

    int getNumero_id(){
        return numero_id;
    }

    int getNb_pages(){
        return nb_pages;
    }

    void setTitre(String titre){
        this.titre=titre;
    }
    void setNumero_id(int numero_id){
        this.numero_id=numero_id;
    }
    void setNb_pages(int nb_pages){
        this.nb_pages=nb_pages;
    }


    


}