package ZamestnaneckySystem;
import java.util.ArrayList;
public class Vyvojar extends  Zamestnanec {
    ArrayList<String> language = new ArrayList<String>();


    public Vyvojar(String firstname, String lastname, String position, int plat, ArrayList<String>language) {
        super(firstname, lastname, position, plat);
        this.language = language;
    }
}
