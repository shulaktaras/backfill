package backfill.addTestsOnSheet;

import backfill.emptyString.EmptyStr;
import backfill.header.Header;
import backfill.testDescribe.Test;
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
import backfill.testTemplates.test7.*;
import backfill.testTemplates.test8.Test8FirstLine;
import backfill.testTemplates.test8.Test8SecondLine;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AppendAllTests {


    public void run(Parser parser) throws IOException {
        ExcelFile excelFile = new ExcelFile();
        DefaultValue defaultValue = new DefaultValue();
        defaultValue.headerName();
        defaultValue.addTestName();

        Map<String, List<String>> map = parser.getMap();

        ExcelFileCreate excelFileCreate = new ExcelFileCreate();
        File exelFileCreator = excelFileCreate.exelFileCreator(map);
        Header header = new Header();

        //last line for header line
        int lrn = header.createSheetWithHeader(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                exelFileCreator);

        Test1FirstLine test1FirstLine = new Test1FirstLine();
        //last line for test1 line 1
        int lastLineForT1L1 = test1FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lrn,
                defaultValue,
                map,
                exelFileCreator);

        Test1SecondLine test1SecondLine = new Test1SecondLine();
        //last line for test1 line 2
        int lastLineForT1L2 = test1SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT1L1,
                map,
                exelFileCreator);

        Test1ThirdLine test1ThirdLine = new Test1ThirdLine();
        //last line for test1 line 3
        int lastLineForT1L3 = test1ThirdLine.thirdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT1L2,
                map,
                exelFileCreator);

        EmptyStr emptyStr = new EmptyStr();
        //last line for empty line
        int lastLineForEmpStr = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT1L3,
                exelFileCreator);

        Test2FirstLine test2FirstLine = new Test2FirstLine();
        //last line for second test first line
        int lastLineForT2L1 = test2FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr,
                defaultValue,
                map,
                exelFileCreator);

        //add empty line after second test
        int lastLineForEmpStr2 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT2L1,
                exelFileCreator);


        Test3FirstLine test3FirstLine = new Test3FirstLine();
        int lastLineForT3L1 = test3FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr2,
                defaultValue,
                map,
                exelFileCreator);

        Test3SecondLine test3SecondLine = new Test3SecondLine();
        int lastLineForT3L2 = test3SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT3L1,
                map,
                exelFileCreator);

        Test3ThirdLine test3ThirdLine = new Test3ThirdLine();
        int lastLineForT3L3 = test3ThirdLine.thirdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT3L2,
                map,
                exelFileCreator);

        int lastLineForEmpStr3 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT3L3,
                exelFileCreator);

        Test4FirstLine test4FirstLine = new Test4FirstLine();
        int lastLineForT4L1 = test4FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr3,
                defaultValue,
                map,
                exelFileCreator);

        Test4SecondLine test4SecondLine = new Test4SecondLine();
        int lastLinrForT4L2 = test4SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT4L1,
                defaultValue,
                map,
                exelFileCreator);


        Test4ThirdLine test4ThirdLine = new Test4ThirdLine();
        int lastLineForT4L3 = test4ThirdLine.thitdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLinrForT4L2,
                map,
                exelFileCreator);

        int lastLineForEmpStr4 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT4L3,
                exelFileCreator);

        Test5FirstLine test5FirstLine = new Test5FirstLine();
        int lastLineForT5L1 = test5FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr4,
                defaultValue,
                map,
                exelFileCreator);

        int lastLineForEmpStr5 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT5L1,
                exelFileCreator);

        Test6FirstLine test6FirstLine = new Test6FirstLine();
        int lastLineForT6L1 = test6FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr5,
                defaultValue,
                map,
                exelFileCreator);

        Test6SecondLine test6SecondLine = new Test6SecondLine();
        int lastLineForT6L2 = test6SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT6L1,
                map,
                exelFileCreator);

        Test6ThirdLine test6ThirdLine = new Test6ThirdLine();
        int lastLineForT6L3 = test6ThirdLine.thirdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT6L2,
                exelFileCreator);

        int lastLineForEmpStr6 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT6L3,
                exelFileCreator);


        Test7FirstLine test7FirstLine = new Test7FirstLine();
        int lastLineForT7L1 = test7FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr6,
                defaultValue,
                exelFileCreator
        );

        Test7SecondLine test7SecondLine = new Test7SecondLine();
        int lastLineForT7L2 = test7SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L1,
                defaultValue,
                exelFileCreator
        );

        Test7ThirdLine test7ThirdLine = new Test7ThirdLine();
        int lastLineForT7L3 = test7ThirdLine.thirdLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L2,
                defaultValue,
                exelFileCreator
        );

        Test7FourthLine test7FourthLine = new Test7FourthLine();
        int lastLineForT7L4 = test7FourthLine.fifthLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L3,
                defaultValue,
                exelFileCreator
        );

        Test7FifthLine test7FifthLine = new Test7FifthLine();
        int lastLineForT7L5 = test7FifthLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L4,
                defaultValue,
                exelFileCreator
        );

        Test7SixthLine test7SixthLine = new Test7SixthLine();
        int lastLineForT7L6 = test7SixthLine.sixthLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L5,
                defaultValue,
                exelFileCreator
        );

        Test7SeventhLine test7SeventhLine = new Test7SeventhLine();
        int lastLineForT7L7 = test7SeventhLine.seventhLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L6,
                defaultValue,
                exelFileCreator
        );

        Test7EighthLine test7EighthLine = new Test7EighthLine();
        int lastLineForT7L8 = test7EighthLine.eighthLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L7,
                defaultValue,
                exelFileCreator
        );


        int lastLineForEmpStr7 = emptyStr.emptyString(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT7L8,
                exelFileCreator);


        Test8FirstLine test8FirstLine = new Test8FirstLine();
        int lastLineForT8L1 = test8FirstLine.firstLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForEmpStr7,
                defaultValue,
                map,
                exelFileCreator
        );

        Test8SecondLine test8SecondLine = new Test8SecondLine();
        test8SecondLine.secondLine(
                excelFile.getWorkbook(),
                excelFile.getSheet(),
                lastLineForT8L1,
                exelFileCreator
        );

    }
}
