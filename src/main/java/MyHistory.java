import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;

public class MyHistory {
    LinkedHashSet<String> radky;

    String fileName;
    public MyHistory(String fileName) {
        // vytvori instanci pro soubor _fileName_
        this.fileName = fileName;
        if(!fileName.equals("")){
            radky = new LinkedHashSet<String>();
        }else{
            radky = new LinkedHashSet<String>();
        }

    }

    public void read() throws IOException{
        // načte soubor fileName do paměti, skončí výjimkou pokud soubor nejde načíst
            radky = (LinkedHashSet<String>) Files.readAllLines(Paths.get(fileName));

    }

    public void save() throws IOException {
        // zapíše obsah paměti do souboru, skončí výjimkou pokud soubor nejde uložit
        // pokud soubor již existuje, přepíše jej
            Files.write(Paths.get(fileName),radky);


    }

    public void addLine(String str) {
        // přidá řádek str do paměti pokud tam ještě není,
        // duplicitní řádky ignoruje.
        radky.add(str);


    }

    public String toString() {
        // vrátí řetězec obsahující všechny řádky
        String str = "";
        for (String s : radky){
            str+=s;
            if (s.equals(radky.toArray()[radky.size()-1])){

            }else{
                str+="\n";
            }
        }
        return str;

    }

}