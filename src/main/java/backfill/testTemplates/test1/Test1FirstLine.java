package backfill.testTemplates.test1;

import backfill.testDescribe.NumberOfRecords_1;
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

public class Test1FirstLine {

    public int firstLine(Workbook workbook,
                         Sheet sheet,
                         int lastRowNumer,
                         DefaultValue defaultValue,
                         Map<String, List<String>> map,
                         File file) throws IOException {

        lastRowNumer += 1;
        ArrayList<String> definition = defaultValue.getDefinition();
        Row row = sheet.createRow(lastRowNumer);
        NumberOfRecords_1 numberOfRecords_1 = new NumberOfRecords_1();


        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell1 = row.createCell(i);
                    cell1.setCellValue(definition.get(0));
                    break;
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(numberOfRecords_1.testsSteps(
                            map.get("database").get(0),
                            map.get("oracleTable").get(0),
                            map.get("backfillTable").get(0),
                            map.get("netezzaTable").get(0)));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);
                    cell3.setCellValue(numberOfRecords_1.testDataSource(
                            map.get("database").get(0),
                            map.get("sourceSchema").get(0),
                            map.get("oracleTable").get(0),
                            map.get("netezzaTable").get(0)));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(numberOfRecords_1.expectedResultsForSource(
                            map.get("database").get(0),
                            map.get("oracleTable").get(0),
                            map.get("netezzaTable").get(0)));
                    break;
            }
        }
        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }
}
