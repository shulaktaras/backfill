package backfill;

import backfill.dataFilling.Header;
import backfill.dataFilling.Test1;
import backfill.exelFile.ExelFileCreate;
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

        ExelFileCreate exelFileCreate = new ExelFileCreate();
        File file = exelFileCreate.exelFileCreator();
        Header header = new Header();

        int lrn = header.createSheetWithHeader(exelFile.getWorkbook(), exelFile.getSheet(), file);
        Test1 test1 = new Test1();
        test1.test1(exelFile.getWorkbook(), exelFile.getSheet(), lrn, defaultValue, file);

    }


}
