package backfill.testDescribe;

public class ColNamesAndDataTypes_2 extends Test {

    public String TestName() {
        return "Verification of column names and data types in source table and target table in hive";
    }

    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Compare column names and types between " + database + " " + tableName + " and hive " + backfillTable + " tables";
    }

    public String testDataSource(String schema, String tableName) {
        return null;
    }

    public String testDataTarget(String schema, String backfillTable) {
        return null;
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return "Column names and types matches";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return null;
    }
}
