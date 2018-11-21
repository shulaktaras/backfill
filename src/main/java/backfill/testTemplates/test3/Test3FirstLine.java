package backfill.testTemplates.test3;

import backfill.testDescribe.SumOfNumericValues_3;
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

public class Test3FirstLine {

    public int firstLine(Workbook workbook, Sheet sheet, int lastRowNumber, DefaultValue defaultValue, Map<String, List<String>> map, File file) throws IOException {
        lastRowNumber += 1;
        ArrayList<String> definition = defaultValue.getDefinition();
        Row row = sheet.createRow(lastRowNumber);

        SumOfNumericValues_3 sumOfNumericValues_3 = new SumOfNumericValues_3();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell1 = row.createCell(i);
                    cell1.setCellValue(definition.get(2));
                    break;
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(sumOfNumericValues_3.testsSteps(
                            map.get("database").get(0),
                            map.get("tableName").get(0),
                            map.get("backfillTable").get(0),
                            map.get("netezzaTable").get(0)
                    ));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);

                    cell3.setCellValue(sumOfNumericValues_3.testDataSource2(
                            map.get("schema").get(0),
                            map.get("tableName").get(0),
                            map.get("numbers")
                    ));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(sumOfNumericValues_3.expectedResult());
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }

}
