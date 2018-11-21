package backfill.readingFile;

import backfill.run.Run;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//parsing file and write data into Map
public class Parser {

    private Map<String, List<String>> map = new HashMap<>();

    public Map<String, List<String>> parseFile(File file) {


        try {
            Scanner input;
//            File file = new File("C:\\Users\\Taras\\Desktop\\TestFile.txt");
            input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(line);
                String value = tokenizer.nextToken();
                String key = tokenizer.nextToken();

                if (key.equalsIgnoreCase("char") || key.equalsIgnoreCase("varchar2")) {
                    key = "characters";
                } else if (key.equalsIgnoreCase("numeric") || key.equalsIgnoreCase("integer")) {
                    key = "numbers";
                }

                if (!map.containsKey(key)) {
                    List<String> list = new ArrayList<>();
                    list.add(value);
                    map.put(key, list);
                } else map.get(key).add(value);

            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        for (String name : map.keySet()) {
//
//            String key = name;
//            String value = map.get(name).toString();
//
//
////
//            System.out.println(key + " " + value);
//
//
//        }
        return map;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }

}

