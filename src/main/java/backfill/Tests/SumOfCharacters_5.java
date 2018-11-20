package backfill.Tests;

public class SumOfCharacters_5 extends Test {

    public String TestName() {
        return "Verification the sum of characters for all the columns casted to String in source table " +
                "and  target table in hive. Limit number of records to 10000";
    }

    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        if (database.equalsIgnoreCase("Oracle")) {
            return "Calculate the sum of characters for all the columns in " + database + " " + tableName + " table for 10000 records";
        }
        return "Calculate the sum of characters for all the columns in " + database + " " + netezzaTable + " table for 10000 records";
    }
    public String testStep2(){ return "Export obtained data into csv file"; }

    public String testsSteps3(String database, String tableName, String backfillTable, String netezzaTable) {

        return "Calculate the sum of characters for all the columns in hive "+backfillTable+" table for 10000 records";
    }

    public String testStep4(){ return "Export obtained data into csv file"; }

    public String testStep5(){ return "Compate two csv files"; }



    public String testDataSource(String schema, String tableName) {
        return "some query";
    }

    public String testDataTarget(String schema, String backfillTable) {
        return "some query";
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return "Get numeric values";
    }
    public String expectedResultsForSource2(String database, String tableName, String netezzaTable) {
        return "Data were exported into csv file";
    }


    public String expectedResultsForTarget(String database, String backfillTable) {
        return "Get numeric values";
    }
    public String expectedResultsForTarget2(String database, String backfillTable) {
        return "Data were exported into csv file";
    }

    public String expectedResult(){return "Data matches";}
}
