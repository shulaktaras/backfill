package backfill;


import backfill.readingFile.Parser;
import backfill.run.Run;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Parser parser = new Parser();
        parser.parseFile(new File("C:\\Users\\Taras\\Desktop\\TestFile.txt"));
        Run run = new Run();
        run.go(parser);

        HeaderAndTest1 headerAndTest1 = new HeaderAndTest1();
        headerAndTest1.run(parser);
    }
}
