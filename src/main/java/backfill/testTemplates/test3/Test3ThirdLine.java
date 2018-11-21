package backfill.testTemplates.test3;

import backfill.testDescribe.SumOfNumericValues_3;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Test3ThirdLine {

    public int thirdLine(Workbook workbook, Sheet sheet, int lastRowNumber, Map<String, List<String>> map, File file) throws IOException {
        lastRowNumber += 1;
        Row row = sheet.createRow(lastRowNumber);
        SumOfNumericValues_3 sumOfNumericValues_3 = new SumOfNumericValues_3();


        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(sumOfNumericValues_3.testsSteps3(
                            map.get("database").get(0)
                    ));
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(sumOfNumericValues_3.expectedResultFinal());
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        return sheet.getLastRowNum();
    }

}
