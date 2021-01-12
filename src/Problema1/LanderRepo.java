package Problema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LanderRepo {
    private List<Land> lander;

    public LanderRepo() {
        lander = new ArrayList<>();
    }

    public void readEntries(){
        try {
            File myObj = new File("src/Problema1/Lander.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] entries = data.split("\\s");
                System.out.println(entries[0]);
                Land l = new Land(entries[0],entries[1],Long.parseLong(entries[2]),Long.parseLong(entries[3]),entries[4]);
                lander.add(l);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public List<Land> filtrare(){
        List<Land> aux = new ArrayList<>();
        aux = lander.stream().filter((n)->n.getName().startsWith("M") && n.getFlache()>=10000).collect(Collectors.toList());
        return aux;
    }
    public void writeEntries(){
        List<Land> aux = filtrare();
        try {
            FileWriter myWriter = new FileWriter("lander.csv");
            for(Land l:lander)
                myWriter.write(l.getName()+";"+l.getKontinent()+";"+l.getFlache()+";"+l.getBevolkerung()+";"+l.getHauptstadt()+'\n');
            myWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
