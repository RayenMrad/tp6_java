public class TestBibliotheque {
    public static void main(String[] args) {
        Bibliotheque bibliotheque=new Bibliotheque(10);
        Document livre1= new Livre("Livre1",1,300,"rayen","aa");
        Document Article1= new Article("article1",2,100,"bechir");
        Document Periodique1=new Periodique("periodique1", 3, 200, "yyy");


        bibliotheque.Ajout_doc(livre1);
        bibliotheque.Ajout_doc(Article1);
        bibliotheque.Ajout_doc(Periodique1);


        System.out.println("Inventaire complet :");
        bibliotheque.Inventaire_doc();

        System.out.println("\nListe des livres :");
        Bibliotheque livres = bibliotheque.liste_livre();
        livres.Inventaire_doc();

        System.out.println("\nListe des articles :");
        Bibliotheque articles = bibliotheque.liste_Article();
        articles.Inventaire_doc();

        System.out.println("\nListe des périodiques :");
        Bibliotheque periodiques = bibliotheque.liste_Periodique();
        periodiques.Inventaire_doc();

        System.out.println("\nsupprimer un document  :");
        bibliotheque.Supprim_doc(1);
        bibliotheque.Inventaire_doc();

    }
}
