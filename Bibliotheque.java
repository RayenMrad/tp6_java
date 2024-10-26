public class Bibliotheque {
    private Document listdoc[];
    private int nb_document;
    private int capacite;

    public Bibliotheque(int cap) {
        this.nb_document = 0;
        this.listdoc = new Document[cap];
        this.capacite = cap;
    }

    public int getCapacite() {
        return capacite;
    }

    public void Ajout_doc(Document d) {
        if (nb_document < capacite) {
            listdoc[nb_document] = d;
            nb_document++;
        } else {
            System.out.println("La capacité est pleine, impossible d'ajouter le document.");
        }
    }

    public void Supprim_doc(int num) {
        int index = -1;
        for (int i = 0; i < nb_document; i++) {
            if (listdoc[i].getNumero_id() == num) {
                index = i;
                break;
            }
        }

        if (index != -1) {
        
            for (int i = index; i < nb_document - 1; i++) {
                listdoc[i] = listdoc[i + 1];
            }
            listdoc[nb_document - 1] = null; 
            nb_document--;
        } else {
            System.out.println("Document non trouvé !");
        }
    }

    public void Inventaire_doc() {
        for (int i = 0; i < nb_document; i++) {
            listdoc[i].Edition();
        }
    }

    public int getNb_document() {
        return nb_document;
    }

    public Bibliotheque liste_livre() {
        Bibliotheque bibliothequeLivres = new Bibliotheque(capacite);
        for (int i = 0; i < nb_document; i++) {
            if (listdoc[i] instanceof Livre) {
                bibliothequeLivres.Ajout_doc(listdoc[i]);
            }
        }
        return bibliothequeLivres;
    }

    public Bibliotheque liste_Article() {
        Bibliotheque bibliothequeArticles = new Bibliotheque(capacite);
        for (int i = 0; i < nb_document; i++) {
            if (listdoc[i] instanceof Article) {
                bibliothequeArticles.Ajout_doc(listdoc[i]);
            }
        }
        return bibliothequeArticles;
    }

    public Bibliotheque liste_Document() {
        Bibliotheque bibliothequeDocuments = new Bibliotheque(capacite);
        for (int i = 0; i < nb_document; i++) {
            if (listdoc[i] instanceof Document) {
                bibliothequeDocuments.Ajout_doc(listdoc[i]);
            }
        }
        return bibliothequeDocuments;
    }


    public Bibliotheque liste_Periodique() {
        Bibliotheque bibliothequePeriodiques = new Bibliotheque(capacite);
        for (int i = 0; i < nb_document; i++) {
            if (listdoc[i] instanceof Document) {
                bibliothequePeriodiques.Ajout_doc(listdoc[i]);
            }
        }
        return bibliothequePeriodiques;
    }

    
    
}
