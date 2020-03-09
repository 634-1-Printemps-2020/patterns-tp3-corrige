package domaine;

public class WSWindows extends WorkStation {
    public WSWindows(String nom) { super(nom); }

    @Override
    public boolean connect() { return outils.Reseau.connectWindows(nom); }
}