package backfill.testTemplates.test7;

import backfill.testDescribe.VerificationData_6;
import backfill.testName.DefaultValue;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Test7SixthLine {

    public int sixthLine(Workbook workbook,
                         Sheet sheet,
                         int lastRowNumer,
                         DefaultValue defaultValue,
                         File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);

        ArrayList<String> definition = defaultValue.getDefinition();

        VerificationData_6 verificationData_6 = new VerificationData_6();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1:
                    Cell cell2 = row.createCell(i);
                    cell2.setCellValue(defaultValue.testNamesForSixthTest().get(5));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(defaultValue.expResultsForSixthTest().get(5));
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }

}
