package backfill.run;

import backfill.readingFile.Parser;

import java.io.File;

public class Run {


    public void go(File file) {

        Parser parser = new Parser();
        parser.parseFile(file);
//        Map<String, List<String>> stringListMap = test.parseFile();
//        for (String name : stringListMap.keySet()) {
//
//            String key = name;
//            String value = stringListMap.get(name).toString();
//
//            System.out.println(key + " " + value);
//        }
    }
}
