package metier;

import domaine.Assoc;
import domaine.WorkStation;

public class Applic {
    public static void majDeToutesLesStations(Assoc assoc) {
        for (String[] data : outils.FileToStr.lireCsv("ListWS.csv")) {
            WorkStation ws = assoc.nouvelleWS(data[0], data[1]);
            System.out.println("- Mise à jour effectuée de " + ws);
        }
    }
}