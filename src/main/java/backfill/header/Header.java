package backfill.header;

import backfill.testName.DefaultValue;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Header {

    public int createSheetWithHeader(Workbook workbook, Sheet sheet, File file) throws IOException {


        Row row = sheet.createRow(0);
        DefaultValue defaultValue = new DefaultValue();

        //for filling data in ArrayList
        defaultValue.headerName();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                Cell cellForHeader = row.createCell(j);
                cellForHeader.setCellValue(defaultValue.getHeader().get(j));
            }
//            for (int j = 1; j < 7; j++) {
//
//                Row row1 = sheet.createRow(rownum);
//                Cell cellForTestsName = row1.createCell(0);
//                cellForTestsName.setCellValue(definition.get(defValue));
//
//                Row emptyRow = sheet.createRow(++rownum);
//                Cell emptyCell = emptyRow.createCell(0);
//
//                ++rownum;
//                ++defValue;
//            }
        }
        int lastRowNum = sheet.getLastRowNum();
        workbook.write(new FileOutputStream(file));
        workbook.close();
        return lastRowNum;
    }

}
