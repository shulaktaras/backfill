package backfill.testTemplates.test3;

import backfill.testDescribe.SumOfNumericValues_3;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Test3SecondLine {

    public int secondLine(Workbook workbook, Sheet sheet, int lastRowNumer, Map<String, List<String>> map, File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);

        SumOfNumericValues_3 sumOfNumericValues_3 = new SumOfNumericValues_3();

        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1:
                    Cell cell2 = row.createCell(i);

                    cell2.setCellValue(sumOfNumericValues_3.testsSteps2(
                            map.get("backfillTable").get(0)
                    ));
                    CellStyle cellStyle = workbook.createCellStyle();
                    cellStyle.setWrapText(true);

                    row.setHeightInPoints((10*sheet.getDefaultRowHeightInPoints()));

                    sheet.autoSizeColumn(10);
                    break;
                case 2:
                    Cell cell3 = row.createCell(i);

                    cell3.setCellValue(sumOfNumericValues_3.testDataTarget2(
                            map.get("backfillTable").get(0),
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
