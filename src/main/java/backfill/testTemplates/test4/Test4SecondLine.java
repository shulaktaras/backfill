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
import java.util.List;
import java.util.Map;

public class Test4SecondLine {

    public int secondLine(Workbook workbook, Sheet sheet, int lastRowNumer, DefaultValue defaultValue, Map<String, List<String>> map, File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);


        SumOfCharStrColumns_4 sumOfCharStrColumns_4 = new SumOfCharStrColumns_4();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(sumOfCharStrColumns_4.testsSteps2(
                            map.get("backfillTable").get(0)
                    ));
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);

                    cell3.setCellValue(sumOfCharStrColumns_4.testDataTarget2(
                            map.get("backfillTable").get(0),
                            map.get("targetSchema").get(0),
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
