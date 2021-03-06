package backfill.testTemplates.test6;

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
import java.util.List;
import java.util.Map;

public class Test6FirstLine {

    public int firstLine(Workbook workbook, Sheet sheet, int lastRowNumber, DefaultValue defaultValue, Map<String, List<String>> map, File file) throws IOException {
        lastRowNumber += 1;
        Row row = sheet.createRow(lastRowNumber);

        ArrayList<String> definition = defaultValue.getDefinition();

        VerificationData_6 verificationData_6 = new VerificationData_6();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell = row.createCell(i);
                    cell.setCellValue(definition.get(5));
                    break;
                case 1:
                    Cell cell2 = row.createCell(i);
                    cell2.setCellValue(verificationData_6.testsSteps(
                            map.get("database").get(0)
                    ));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);

                    cell3.setCellValue(verificationData_6.testDataSource(
                            map.get("database").get(0),
                            map.get("sourceSchema").get(0),
                            map.get("oracleTable").get(0),
                            map.get("netezzaTable").get(0),
                            map.get("PK")
                    ));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(verificationData_6.expectedResultsForSource());
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }

}
