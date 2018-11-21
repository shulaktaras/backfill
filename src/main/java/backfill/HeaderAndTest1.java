package backfill;

import backfill.emptyString.EmptyStr;
import backfill.header.Header;
import backfill.test1.Test1FirstLine;
import backfill.exelFile.ExelFileCreate;
import backfill.readingFile.Parser;
import backfill.test1.Test1SecondLine;
import backfill.test1.Test1ThirdLine;
import backfill.test2.Test2FirstLine;
import backfill.test3.Test3FirstLine;
import backfill.test3.Test3SecondLine;
import backfill.test3.Test3ThirdLine;
import backfill.test4.Test4FirstLine;
import backfill.test4.Test4SecondLine;
import backfill.test4.Test4ThirdLine;
import backfill.test5.Test5FirstLine;
import backfill.test6.Test6FirstLine;
import backfill.test6.Test6SecondLine;
import backfill.test6.Test6ThirdLine;
import backfill.testName.DefaultValue;
import exel.ExelFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HeaderAndTest1 {


    public void run(Parser parser) throws IOException {
        ExelFile exelFile = new ExelFile();
        DefaultValue defaultValue = new DefaultValue();
        defaultValue.headerName();
        defaultValue.addTestName();

        Map<String, List<String>> map = parser.getMap();

        ExelFileCreate exelFileCreate = new ExelFileCreate();
        File exelFileCreator = exelFileCreate.exelFileCreator();
        Header header = new Header();

        //last line for header line
        int lrn = header.createSheetWithHeader(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                exelFileCreator);

        Test1FirstLine test1FirstLine = new Test1FirstLine();
        //last line for test1 line 1
        int lastLineForT1L1 = test1FirstLine.firstLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lrn,
                defaultValue,
                map,
                exelFileCreator);

        Test1SecondLine test1SecondLine = new Test1SecondLine();
        //last line for test1 line 2
        int lastLineForT1L2 = test1SecondLine.secondLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT1L1,
                map,
                exelFileCreator);

        Test1ThirdLine test1ThirdLine = new Test1ThirdLine();
        //last line for test1 line 3
        int lastLineForT1L3 = test1ThirdLine.thirdLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT1L2,
                map,
                exelFileCreator);

        EmptyStr emptyStr = new EmptyStr();
        //last line for empty line
        int lastLineForEmpStr = emptyStr.emptyString(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT1L3,
                exelFileCreator);

        Test2FirstLine test2FirstLine = new Test2FirstLine();
        //last line for second test first line
        int lastLineForT2L1 = test2FirstLine.firstLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForEmpStr,
                defaultValue,
                map,
                exelFileCreator);

        //add empty line after second test
        int lastLineForEmpStr2 = emptyStr.emptyString(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT2L1,
                exelFileCreator);


        Test3FirstLine test3FirstLine = new Test3FirstLine();
        test3FirstLine.firstLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForEmpStr2,
                defaultValue,
                map,
                exelFileCreator);

        Test3SecondLine test3SecondLine = new Test3SecondLine();
        int lastLineForT3L2 = test3SecondLine.secondLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForEmpStr2,
                map,
                exelFileCreator);

        Test3ThirdLine test3ThirdLine = new Test3ThirdLine();
        int lastLineForT3L3 = test3ThirdLine.thirdLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT3L2,
                map,
                exelFileCreator);

        int lastLineForEmpStr3 = emptyStr.emptyString(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT3L3,
                exelFileCreator);

        Test4FirstLine test4FirstLine = new Test4FirstLine();
        int lastLineForT4L1 = test4FirstLine.firstLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForEmpStr3,
                defaultValue,
                map,
                exelFileCreator);

        Test4SecondLine test4SecondLine = new Test4SecondLine();
        int lastLinrForT4L2 = test4SecondLine.secondLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT4L1,
                defaultValue,
                map,
                exelFileCreator);


        Test4ThirdLine test4ThirdLine = new Test4ThirdLine();
        int lastLineForT4L3 = test4ThirdLine.thitdLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLinrForT4L2,
                map,
                exelFileCreator);

        int lastLineForEmpStr4 = emptyStr.emptyString(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT4L3,
                exelFileCreator);

        Test5FirstLine test5FirstLine = new Test5FirstLine();
        int lastLineForT5L1 = test5FirstLine.firstLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForEmpStr4,
                defaultValue,
                map,
                exelFileCreator);

        int lastLineForEmpStr5 = emptyStr.emptyString(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT5L1,
                exelFileCreator);

        Test6FirstLine test6FirstLine = new Test6FirstLine();
        int lastLineForT6L1 = test6FirstLine.firstLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForEmpStr5,
                defaultValue,
                map,
                exelFileCreator);

        Test6SecondLine test6SecondLine = new Test6SecondLine();
        int lastLineForT6L2 = test6SecondLine.secondLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT6L1,
                map,
                exelFileCreator);

        Test6ThirdLine test6ThirdLine = new Test6ThirdLine();
        test6ThirdLine.thirdLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT6L2,
                exelFileCreator);


    }
}
