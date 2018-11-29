package backfill.testTemplates.test4;

import backfill.testDescribe.SumOfCharStrColumns_4;
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

public class Test4FirstLine {

    public int firstLine(Workbook workbook, Sheet sheet, int lastRowNumber, DefaultValue defaultValue, Map<String, List<String>> map, File file) throws IOException {
        lastRowNumber += 1;
        Row row = sheet.createRow(lastRowNumber);

        ArrayList<String> definition = defaultValue.getDefinition();

        SumOfCharStrColumns_4 sumOfCharStrColumns_4 = new SumOfCharStrColumns_4();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell = row.createCell(i);
                    cell.setCellValue(definition.get(3));
                    break;
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(sumOfCharStrColumns_4.testsSteps(
                            map.get("database").get(0),
                            map.get("oracleTable").get(0),
                            map.get("backfillTable").get(0),
                            map.get("netezzaTable").get(0)
                    ));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);

                    cell3.setCellValue(sumOfCharStrColumns_4.testDataSource2(
                            map.get("database").get(0),
                            map.get("targetSchema").get(0),
                            map.get("sourceSchema").get(0),
                            map.get("netezzaTable").get(0),
                            map.get("oracleTable").get(0),
                            map.get("characters")
                    ));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(sumOfCharStrColumns_4.expectedResultsForSource2());
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }


}
