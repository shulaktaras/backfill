package backfill.createExcelFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class ExcelFileCreate {
    private static File file;

    public File exelFileCreator(Map<String, List<String>> map ) {

        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());

        String backfillTable = map.get("backfillTable").get(0);

        file = new File("C:\\Users\\Taras\\Desktop\\backfillTables\\"+ backfillTable+timeStamp+".xls" );
        return file;
    }


}
