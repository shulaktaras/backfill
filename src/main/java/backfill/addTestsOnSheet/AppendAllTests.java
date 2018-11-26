package backfill.addTestsOnSheet;

import backfill.emptyString.EmptyStr;
import backfill.header.Header;
import backfill.testTemplates.test1.Test1FirstLine;
import backfill.createExcelFile.ExcelFileCreate;
import backfill.readingFile.Parser;
import backfill.testTemplates.test1.Test1SecondLine;
import backfill.testTemplates.test1.Test1ThirdLine;
import backfill.testTemplates.test2.Test2FirstLine;
import backfill.testTemplates.test3.Test3FirstLine;
import backfill.testTemplates.test3.Test3SecondLine;
import backfill.testTemplates.test3.Test3ThirdLine;
import backfill.testTemplates.test4.Test4FirstLine;
import backfill.testTemplates.test4.Test4SecondLine;
import backfill.testTemplates.test4.Test4ThirdLine;
import backfill.testTemplates.test5.Test5FirstLine;
import backfill.testTemplates.test6.Test6FirstLine;
import backfill.testTemplates.test6.Test6SecondLine;
import backfill.testTemplates.test6.Test6ThirdLine;
import backfill.testName.DefaultValue;
import backfill.createExcelFile.ExcelFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AppendAllTests {


    public void run(Parser parser) throws IOException {

        ExcelFile excelFile = new ExcelFile();

        DefaultValue defaultValue = new DefaultValue();
        defaultValue.headerName();
        defaultValue.testName();

        Map<String, List<String>> map = parser.getMap();

        ExcelFileCreate excelFileCreate = new ExcelFileCreate();
        File excelFileCreator = excelFileCreate.exelFileCreator(map);


        Header header = new Header();
        //last line for header line
        int lrn = header.createSheetWithHeader(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                excelFileCreator);

        Test1FirstLine test1FirstLine = new Test1FirstLine();
        //last line for test1 line 1
        int lastLineForT1L1 = test1FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lrn,
                defaultValue,
                map,
                excelFileCreator);

        Test1SecondLine test1SecondLine = new Test1SecondLine();
        //last line for test1 line 2
        int lastLineForT1L2 = test1SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT1L1,
                map,
                excelFileCreator);

        Test1ThirdLine test1ThirdLine = new Test1ThirdLine();
        //last line for test1 line 3
        int lastLineForT1L3 = test1ThirdLine.thirdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT1L2,
                map,
                excelFileCreator);

        EmptyStr emptyStr = new EmptyStr();
        //last line for empty line
        int lastLineForEmpStr = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT1L3,
                excelFileCreator);

        Test2FirstLine test2FirstLine = new Test2FirstLine();
        //last line for second test first line
        int lastLineForT2L1 = test2FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr,
                defaultValue,
                map,
                excelFileCreator);

        //add empty line after second test
        int lastLineForEmpStr2 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT2L1,
                excelFileCreator);


        Test3FirstLine test3FirstLine = new Test3FirstLine();
        int lastLineForT3L1 = test3FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr2,
                defaultValue,
                map,
                excelFileCreator);

        Test3SecondLine test3SecondLine = new Test3SecondLine();
        int lastLineForT3L2 = test3SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT3L1,
                map,
                excelFileCreator);

        Test3ThirdLine test3ThirdLine = new Test3ThirdLine();
        int lastLineForT3L3 = test3ThirdLine.thirdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT3L2,
                map,
                excelFileCreator);

        int lastLineForEmpStr3 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT3L3,
                excelFileCreator);

        Test4FirstLine test4FirstLine = new Test4FirstLine();
        int lastLineForT4L1 = test4FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr3,
                defaultValue,
                map,
                excelFileCreator);

        Test4SecondLine test4SecondLine = new Test4SecondLine();
        int lastLinrForT4L2 = test4SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT4L1,
                defaultValue,
                map,
                excelFileCreator);


        Test4ThirdLine test4ThirdLine = new Test4ThirdLine();
        int lastLineForT4L3 = test4ThirdLine.thitdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLinrForT4L2,
                map,
                excelFileCreator);

        int lastLineForEmpStr4 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT4L3,
                excelFileCreator);

        Test5FirstLine test5FirstLine = new Test5FirstLine();
        int lastLineForT5L1 = test5FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr4,
                defaultValue,
                map,
                excelFileCreator);

        int lastLineForEmpStr5 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT5L1,
                excelFileCreator);

        Test6FirstLine test6FirstLine = new Test6FirstLine();
        int lastLineForT6L1 = test6FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr5,
                defaultValue,
                map,
                excelFileCreator);

        Test6SecondLine test6SecondLine = new Test6SecondLine();
        int lastLineForT6L2 = test6SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT6L1,
                map,
                excelFileCreator);

        Test6ThirdLine test6ThirdLine = new Test6ThirdLine();
        test6ThirdLine.thirdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT6L2,
                excelFileCreator);

    }
}
