package backfill.fillingExcel;

import backfill.createExcelFile.ExcelFile;
import backfill.header.Header;

import java.io.File;
import java.io.IOException;

public class Title {


    private static Title title;

    public static Title getTitle() {
        if (title == null) {
            title = new Title();
        }
        return title;
    }


    public int titleFilling(ExcelFile excelFile, File excelFileCreator) throws IOException {
        Header header = new Header();
        int lrn = header.createSheetWithHeader(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                excelFileCreator);
        //lnr - last row number
        return lrn;
    }

}
