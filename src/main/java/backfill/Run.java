package backfill;


import backfill.addTestsOnSheet.AppendAllTests;
import backfill.readingFile.Parser;

import java.io.File;
import java.io.IOException;

public class Run {

    public void run(File file) throws IOException {

        Parser parser = new Parser();
        parser.parseFile(file);

        AppendAllTests appendAllTests = new AppendAllTests();
        appendAllTests.run(parser);
    }
}
