package backfill.Tests;

public class SumOfNumericValues_3 extends Test {

    public String TestName() {
        return "Verification of sum of values of numeric columns in source table and target table in hive";
    }

    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {

        if (database.equalsIgnoreCase("Oracle")) {
            return "Calculate sum of values of numeric columns in " + database + " " + tableName + " table";

        } else return "Calculate sum of values of numeric columns in " + database + " " + netezzaTable + " table";
    }

    public String testsSteps2(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Calculate sum of values of numeric columns in hive from " + backfillTable + " table";
    }

    public String testsSteps3(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Compare values got in " + database + " and hive";
    }

    public String testDataSource(String schema, String tableName) {
        return "some query";
    }

    public String testDataTarget(String schema, String backfillTable) {
        return "some query";
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return "Get sum of values";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return "Get sum of values";
    }

    public String expectedResult() {
        return "Numbers should match";
    }

}
