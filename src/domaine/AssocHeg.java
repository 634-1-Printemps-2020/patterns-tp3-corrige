package domaine;

public class AssocHeg extends Assoc {
    @Override
    public WorkStation creerWS(String type, String nom) {
        switch (type) {
            case "Windows" : return new WSWindows(nom);
            case "Linux" : return new WSLinux(nom);
        }
        return null;
    }
}