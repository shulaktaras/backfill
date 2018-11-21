package backfill.Tests;

import java.util.List;

public class DateValues_5 extends Test {

    public String TestName() {
        return "Verification of date values in target table in hive";
    }


    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Verify that date column in target hive table has correct format as it is in " + database;
    }

    public String testDataSource(String schema, String tableName) {
        return null;
    }


    public String testDataSource2(String backfillTable, List<String> list) {

        String str = "with t1 as(" +
                "\nselect";

        for (int i = 0; i < list.size(); i++) {
            if (i != (list.size() - 1)) {
                str.concat("\ncase when regexp_extract(" + list.get(i) + ",'\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}',0) ='' then 0 else 1 end as result_" + list.get(i) + ",");
            } else str.concat("\nsum(length(coalesce(" + list.get(i) + ",'')))");
        }

        str.concat("\nfrom " + backfillTable + "\n)");


        str.concat("\nselect * from t1" +
                "\nwhere ");
        for (int i = 0; i < list.size(); i++) {

            if (i != (list.size() - 1)) {
                str.concat("result_" + list.get(i) + " = 0 or");
            } else str.concat("result_" + list.get(i) + " = 0");
        }
        return str;
    }

    public String testDataTarget(String schema, String backfillTable) {
        return null;
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return "No data returned";
    }
    public String expectedResultsForSource() {
        return "No data returned";
    }

    public String expectedResult() {
        return "No data returned";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return null;
    }
}
