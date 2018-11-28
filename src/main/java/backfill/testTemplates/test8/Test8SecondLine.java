package backfill.testTemplates.test8;

import backfill.testDescribe.VerfOfDataCount_8;
import backfill.testName.DefaultValue;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test8SecondLine {
    public int secondLine(Workbook workbook, Sheet sheet, int lastRowNumer,  File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);


        VerfOfDataCount_8 verfOfDataCount_8 = new VerfOfDataCount_8();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell = row.createCell(i);
                    break;
                case 1:
                    Cell cell2 = row.createCell(i);
                    cell2.setCellValue(verfOfDataCount_8.testsSteps2());
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(verfOfDataCount_8.expectedResultsForTarget1());
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }
}
