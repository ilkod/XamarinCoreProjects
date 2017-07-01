package habr2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Ілюша on 26.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        List<String> list_ = new ArrayList<String>();

        try {
            br = new BufferedReader(new FileReader("C:/Users/Ілюша/Desktop/task/Rectangle/src/habr1/a1.txt"));
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    list_.add(line.toLowerCase());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (String str : list_) {
            System.out.println(str.toString());
        }

        List<String[]> parts = new ArrayList<>();

        for (String str : list_) {
            parts.add((str + " ").split("\\p{P}?[\\t\\r\\n]+"));
        }
        ArrayList<String> fstr = new ArrayList<String>();

        for (String[] str : parts){
            Collections.addAll(fstr, str);
        }

        System.out.println(fstr);

        
    }
}
