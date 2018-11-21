package backfill.test1;

import backfill.Tests.NumberOfRecords_1;
import backfill.readingFile.Parser;
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

    public int secondLine(Workbook workbook, Sheet sheet, int lastRowNumer, Parser parser, File file) throws IOException {
        lastRowNumer += 1;
//        ArrayList<String> definition = defaultValue.getDefinition();
        Row row = sheet.createRow(lastRowNumer);
        NumberOfRecords_1 numberOfRecords_1 = new NumberOfRecords_1();

        Map<String, List<String>> map = parser.getMap();

        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(numberOfRecords_1.testsSteps2(
                            map.get("tableName").get(0),
                            map.get("backfillTable").get(0),
                            map.get("netezzatable").get(0)));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);
                    cell3.setCellValue(numberOfRecords_1.testDataSource(
                            map.get("schema").get(0),
                            map.get("tableName").get(0)));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(numberOfRecords_1.expectedResultsForSource(
                            map.get("database").get(0),
                            map.get("tableName").get(0),
                            map.get("netezzaTable").get(0)));
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        int lastRowNum = sheet.getLastRowNum();
        return lastRowNum;
    }
}
