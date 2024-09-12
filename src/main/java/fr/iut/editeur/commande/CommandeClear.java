package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Descriptionnnnnnnnn
 */
public class CommandeClear extends CommandeDocument{


    /**
     *
     * @param document Ceci est un jolie documment
     * @param parameters Ceci est un parametreeeeeeeesss XDDD
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }


    @Override
    /**
     * EXECUTION !!!!!
     */
    public void executer() {


        this.document.clear();
        super.executer();
    }

}

