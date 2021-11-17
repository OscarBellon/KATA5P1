package kata5p1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
     public static List<String> read (String filename) throws FileNotFoundException, IOException {
        List<String> mailList= new ArrayList<>();
        FileReader lector = new FileReader(filename);
        BufferedReader bf = new BufferedReader(lector);
        String linea;
        while((linea=bf.readLine())!=null){
            if(linea.contains("@")){
                mailList.add(linea);
            }
        }   
        return mailList;
    }
}
