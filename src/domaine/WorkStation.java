package domaine;

public abstract class WorkStation {
    String nom;

    public WorkStation(String nom) { this.nom = nom; }

    public abstract boolean connect();
    public void update() { outils.Reseau.updateWS(nom); }

    @Override
    public String toString() { return nom; }
}