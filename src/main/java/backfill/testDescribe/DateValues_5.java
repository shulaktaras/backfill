package backfill.testDescribe;

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

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("with t1 as( select ");

        for (String aList : list) {
            stringBuilder.append("case when regexp_extract(")
                    .append(aList)
                    .append(",'\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}',0) ='' then 0 else 1 end as result_")
                    .append(aList)
                    .append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(" from ").append(backfillTable).append(" )");


        stringBuilder.append("select * from t1 where ");
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append("result_").append(list.get(i)).append(" = 0 or ");
        }
        stringBuilder.delete(stringBuilder.length()-3,stringBuilder.length());
        stringBuilder.append(";");

        return stringBuilder.toString();
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

    public String expectedResultsForTarget(String database, String backfillTable) {
        return null;
    }
}
