package backfill.exelFile;

import java.io.File;

public class ExelFileCreate {
    private static File file;

    public File exelFileCreator() {
        file = new File("C:\\Users\\Taras\\Desktop\\newTestFile.xls");
        return file;
    }


}
