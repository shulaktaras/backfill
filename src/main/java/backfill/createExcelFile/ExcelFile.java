package backfill.createExcelFile;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ExcelFile {

    private static Workbook workbook;
    private static Sheet sheet;


    public static Workbook getWorkbook() {
        if (workbook == null) {
            workbook = new HSSFWorkbook();
        }
        return workbook;
    }

    public static Sheet getSheet() {
        if (sheet == null) {
            sheet = workbook.createSheet("My test");
        }
        return sheet;
    }

}















