package backfill.testTemplates.test1;

import backfill.testDescribe.NumberOfRecords_1;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Test1SecondLine {

    public int secondLine(Workbook workbook, Sheet sheet, int lastRowNumer, Map<String, List<String>> map, File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);
        NumberOfRecords_1 numberOfRecords_1 = new NumberOfRecords_1();


        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(numberOfRecords_1.testsSteps2(
                            map.get("oracleTable").get(0),
                            map.get("backfillTable").get(0),
                            map.get("netezzaTable").get(0)));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);
                    cell3.setCellValue(numberOfRecords_1.testDataTarget(
                            map.get("targetSchema").get(0),
                            map.get("backfillTable").get(0)));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(numberOfRecords_1.expectedResultsForTarget(
                            map.get("database").get(0),
                            map.get("backfillTable").get(0)));
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }
}
