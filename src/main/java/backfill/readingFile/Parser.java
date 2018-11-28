package backfill.readingFile;

import java.io.File;
import java.util.*;

//parsing file and write data into Map
public class Parser {

    private Map<String, List<String>> map = new HashMap<>();

    public Map<String, List<String>> parseFile(File file) {


        try {
            Scanner input;
            input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(line);
                String value = tokenizer.nextToken();
                String key = tokenizer.nextToken();

                if (key.equalsIgnoreCase("char")
                        || key.equalsIgnoreCase("varchar2")
                        || key.equalsIgnoreCase("varchar")) {
                    key = "characters";
                } else if (key.equalsIgnoreCase("number")
                        || key.equalsIgnoreCase("integer")
                        || key.equalsIgnoreCase("bigint")
                        || key.equalsIgnoreCase("numeric")
                        || key.equalsIgnoreCase("smallint")) {
                    key = "numbers";
                } else if (key.equalsIgnoreCase("date")
                        || key.equalsIgnoreCase("timestamp")){
                    key = "date";
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

        return map;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }

    public void showMap() {
        for (String name : map.keySet()) {

            String key = name;
            String value = map.get(name).toString();


            System.out.println(key + " " + value);


        }
    }

}


