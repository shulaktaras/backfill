package backfill;

import backfill.emptyString.EmptyStr;
import backfill.header.Header;
import backfill.test1.Test1FirstLine;
import backfill.exelFile.ExelFileCreate;
import backfill.readingFile.Parser;
import backfill.test1.Test1SecondLine;
import backfill.test1.Test1ThirdLine;
import backfill.test2.Test2FirstLine;
import backfill.testName.DefaultValue;
import exel.ExelFile;

import java.io.File;
import java.io.IOException;

public class HeaderAndTest1 {


    public void run() throws IOException {
        ExelFile exelFile = new ExelFile();
        DefaultValue defaultValue = new DefaultValue();
        defaultValue.headerName();
        defaultValue.addTestName();

        Parser parser = new Parser();

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
                parser,
                exelFileCreator);

        Test1SecondLine test1SecondLine = new Test1SecondLine();
        //last line for test1 line 2
        int lastLineForT1L2 = test1SecondLine.secondLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT1L1,
                parser,
                exelFileCreator);

        Test1ThirdLine test1ThirdLine = new Test1ThirdLine();
        //last line for test1 line 3
        int lastLineForT1L3 = test1ThirdLine.thirdLine(
                exelFile.getWorkbook(),
                exelFile.getSheet(),
                lastLineForT1L2,
                parser,
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
                parser,
                exelFileCreator);

    }
}
