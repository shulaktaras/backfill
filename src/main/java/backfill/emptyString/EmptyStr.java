package backfill.emptyString;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmptyStr {

    public int emptyString(Workbook workbook, Sheet sheet, int lastRowNumer, File file) throws IOException {
        lastRowNumer += 1;
        Row row = sheet.createRow(lastRowNumer);


        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Cell cell1 = row.createCell(i);
                    break;
                case 1:
                    Cell cell2 = row.createCell(i);

                    break;
                case 2:
                    Cell cell3 = row.createCell(i);
                    break;
                case 3:
                    Cell cell4 = row.createCell(i);
                    break;
            }
        }

        workbook.write(new FileOutputStream(file));
        workbook.close();
        int lastRowNum = sheet.getLastRowNum();
        return lastRowNum;
    }
}


