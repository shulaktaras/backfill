package backfill.test5;

import backfill.Tests.DateValues_5;
import backfill.Tests.SumOfCharStrColumns_4;
import backfill.readingFile.Parser;
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

public class Test5FirstLine {

    public int firstLine(Workbook workbook, Sheet sheet, int lastRowNumer, DefaultValue defaultValue, Parser parser, File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);

        ArrayList<String> definition = defaultValue.getDefinition();

        DateValues_5 dateValues_5 = new DateValues_5();

        Map<String, List<String>> map = parser.getMap();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell = row.createCell(i);
                    cell.setCellValue(definition.get(8));
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(dateValues_5.testsSteps(
                            map.get("database").get(0),
                            map.get("tableName").get(0),
                            map.get("backfillTable").get(0),
                            map.get("netezzaTable").get(0)
                    ));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);

                    cell3.setCellValue(dateValues_5.testDataSource2(
                            map.get("backfillTable").get(0),
                            map.get("DATA")
                    ));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(dateValues_5.expectedResultsForSource());
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        int lastRowNum = sheet.getLastRowNum();
        return lastRowNum;
    }

}
