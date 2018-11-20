package backfill.Tests;

public class DateValues_6 extends Test {

    public String TestName() {
        return "Verification of date values in target table in hive";
    }


    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Verify that date column in target hive table has correct format as it is in "+ database;
    }

    public String testDataSource(String schema, String tableName) {
        return "some query";
    }

    public String testDataTarget(String schema, String backfillTable) {
        return null;
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return "No data returned";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return null;
    }
}
