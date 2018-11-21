package backfill.test6;

import backfill.Tests.VerificationData_6;
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

public class Test6ThirdLine {

    public int thirdLine(Workbook workbook, Sheet sheet, int lastRowNumer,  File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);


        VerificationData_6 verificationData_6 = new VerificationData_6();


        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1:
                    Cell cell2 = row.createCell(i);
                    cell2.setCellValue(verificationData_6.testSteps3());
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    cell4.setCellValue(verificationData_6.expectedResult());
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        int lastRowNum = sheet.getLastRowNum();
        return lastRowNum;
    }


}
