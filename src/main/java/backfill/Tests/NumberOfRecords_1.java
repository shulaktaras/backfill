package backfill.Tests;


public class NumberOfRecords_1 extends Test {

    public String TestName() {
        return "Verification of number of records in source table and target table in hive";
    }

    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {

        if (database.equalsIgnoreCase("Oracle")) {
            return "Check the number of records in " + database + " " + tableName;
        } else return "Check the number of records in " + database + " " + netezzaTable;
    }

    public String testsSteps2(String tableName, String backfillTable, String netezzaTable) {
        return "Check the number of records in hive " + backfillTable + " table";
    }

    public String testsSteps3(String database) {
        return "Compare number of records in " + database + " and hive tables";
    }

    public String testDataSource(String schema, String tableName) {
        return "select count(*) " +
                "from " + schema + "." + tableName;
    }

    public String testDataTarget(String schema, String backfillTable) {
        return "select count(*)" +
                "from " + backfillTable;
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        if (database.equalsIgnoreCase("Oracle")) {
            return "Get number of records in  " + database + " " + tableName + " table";
        } else return "Get number of records in  " + database + " " + netezzaTable + " table";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return "Get number of records in hive " + backfillTable + " table";
    }

    public String expectedResult(){
        return "Number of records matches";
    }

//    public String expectedResults(String database, String tableName) {
//        return "Get number of records in " + database + " " + tableName + " table";
//    }
//
//    public String expectedResults2(String backfillTableName) {
//        return "Get number of records in hive " + backfillTableName + " table";
//    }

}
