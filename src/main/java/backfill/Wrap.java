package backfill;


import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Wrap {
    public static void main(String[] args) {
        try (OutputStream fileOut = new FileOutputStream("C:\\Users\\Taras\\Desktop\\Javatpoint.xls")) {
            Workbook wb = new HSSFWorkbook();
            Sheet sheet = wb.createSheet("Sheet");
            Row row = sheet.createRow(1);
            Cell cell = row.createCell(1);

            StringBuilder stringBuilder = new StringBuilder();

            String s = "asd";

            stringBuilder.append("This is first line and").append(s).append(" \n this is second line");

            cell.setCellValue(stringBuilder.toString());
            CellStyle cs = wb.createCellStyle();
            cs.setWrapText(true);
            cell.setCellStyle(cs);
            row.setHeightInPoints((2 * sheet.getDefaultRowHeightInPoints()));
            sheet.autoSizeColumn(2);
            wb.write(fileOut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
