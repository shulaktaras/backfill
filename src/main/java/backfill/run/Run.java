package backfill.run;

import backfill.readingFile.Test;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        Test test = new Test();
        Map<String, List<String>> stringListMap = test.parseFile(new File("C:\\Users\\Taras\\Desktop\\TestFile.txt"));
        for (String name : stringListMap.keySet()) {

            String key = name;
            String value = stringListMap.get(name).toString();



            System.out.println(key + " " + value);


        }

    }
}
