package backfill.Tests;

public class VerificationData_6 extends Test {

    public String TestName() {
        return "Verification of data between source and hive table";
    }

    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Select 10000 records from " + database + " table and export in csv file";
    }

    public String testsSteps2(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Select 10000 records from hive table and export in csv file";
    }

    public String testSteps3() {
        return "Compare two files";
    }

    public String testDataSource(String schema, String tableName) {
        return "some query";
    }

    public String testDataTarget(String schema, String backfillTable) {
        return "some query";
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return "Get csv file with data";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return "Get csv file with data";
    }

    public String expectedResult(){ return "Files match"; }
}
