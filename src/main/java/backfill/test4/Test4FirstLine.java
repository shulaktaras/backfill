package backfill.test4;

import backfill.Tests.SumOfCharStrColumns_4;
import backfill.Tests.SumOfNumericValues_3;
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

public class Test4FirstLine {

    public int firstLine(Workbook workbook, Sheet sheet, int lastRowNumer, DefaultValue defaultValue, Parser parser, File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);

        ArrayList<String> definition = defaultValue.getDefinition();

        SumOfCharStrColumns_4 sumOfCharStrColumns_4 = new SumOfCharStrColumns_4();
        Map<String, List<String>> map = parser.getMap();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell = row.createCell(i);
                    cell.setCellValue(definition.get(7));
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(sumOfCharStrColumns_4.testsSteps(
                            map.get("database").get(0),
                            map.get("tableName").get(0),
                            map.get("backfillTable").get(0),
                            map.get("netezzaTable").get(0)
                    ));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);

                    cell3.setCellValue(sumOfCharStrColumns_4.testDataSource2(
                            map.get("schema").get(0),
                            map.get("tableName").get(0),
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
        int lastRowNum = sheet.getLastRowNum();
        return lastRowNum;
    }


}
