package problema1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class MainApp {
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("C:\\Users\\Aquiris\\IdeaProjects\\Laborator5\\src\\main\\resources\\numere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file=new File("C:\\Users\\Aquiris\\IdeaProjects\\Laborator5\\src\\main\\resources\\numere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> pereche = mapper.readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return pereche;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> lista=citire();
        System.out.println(lista);
        for(PerecheNumere p:lista)
        {
            System.out.println(p);
        }
        lista.add(new PerecheNumere(40,20));
        lista.add(new PerecheNumere(45,15));
        lista.add(new PerecheNumere(12,23));
        scriere(lista);
    }
}
