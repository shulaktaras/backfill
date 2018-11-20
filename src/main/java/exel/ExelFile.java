package exel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ExelFile {


    public Workbook getWorkbook() {
        return workbook;
    }

    public Sheet getSheet() {
        return sheet;
    }

    private Workbook workbook = new HSSFWorkbook();
    private Sheet sheet = workbook.createSheet("My test");


}















