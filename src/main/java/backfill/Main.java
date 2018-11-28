package backfill;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Run run= new Run();
        run.run(new File("C:\\Users\\Taras\\Desktop\\backfillTables\\TestFile6.txt"));
    }
}