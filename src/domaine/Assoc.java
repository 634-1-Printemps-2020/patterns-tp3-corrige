package domaine;

public abstract class Assoc {
    public WorkStation nouvelleWS(String type, String nom) {
        WorkStation ws = creerWS(type, nom);
        ws.connect();
        ws.update();
        return ws;
    }
    public abstract WorkStation creerWS(String type, String nom);
}