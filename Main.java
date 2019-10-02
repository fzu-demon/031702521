import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String inputPath = args[0];
        String outputPath = args[1];
        ArrayList<String > str = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(inputPath), "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream(outputPath), "UTF-8");
        BufferedWriter bw = new BufferedWriter(isw);
        //BufferedReader br = new BufferedReader(new FileReader("1.txt"));
        //BufferedWriter bw = new BufferedWriter(new FileWriter("2.txt"));
        String line = null;
        while ((line=br.readLine())!=null){
                str.add(line);
        }
        bw.write('[');
        for (int i=0;i<str.size();i++){
            Cadress cadress = new Cadress();
            cadress.address = str.get(i);
            cadress.Doit();
            bw.write(cadress.last);
            if (i < str.size()-1 ){
                bw.write(',');
                bw.newLine();
            }
        }
        bw.write(']');
        br.close();
        bw.close();
    }
}
