package backfill.createExcelFile;

import java.io.File;

public class ExcelFileCreate {
    private static File file;

    public File exelFileCreator() {
        file = new File("C:\\Users\\Taras\\Desktop\\newTestFile.xls");
        return file;
    }


}
