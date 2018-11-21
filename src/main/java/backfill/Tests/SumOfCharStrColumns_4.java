package backfill.Tests;

import java.util.List;

public class SumOfCharStrColumns_4 extends Test {

    public String TestName() {
        return "Verification of sum of characters in string columns in source table and target table in hive";
    }

    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        if (database.equalsIgnoreCase("Oracle")) {
            return "Calculate the sum of characters in string columns in " + database + " " + tableName + " table";
        } else
            return "Calculate the sum of characters in string columns in " + database + " " + netezzaTable + " table";
    }

    public String testsSteps2(String backfillTable) {
        return "Calculate sum of characters in string columns in hive " + backfillTable + " table";
    }

    public String testsSteps3(String database) {
        return "Compare values got in " + database + " and hive";
    }

    public String testDataSource(String schema, String tableName) {
        return null;
    }

    public String testDataSource2(String schema, String tableName, List<String> list) {
        String str = "select";

        for (int i = 0; i < list.size(); i++) {
            if (i != (list.size() - 1)) {
                str = str.concat("\nsum(length(coalesce(" + list.get(i) + ",''))),");
            } else str = str.concat("\nsum(length(coalesce(" + list.get(i) + ",'')))");
        }

        str = str.concat("\nfrom " + schema + "." + tableName);
        return str;
    }

    public String testDataTarget(String schema, String backfillTable) {
        return "some query";
    }

    public String testDataTarget2(String backfillTable, List<String> list) {
        String str = "select";

        for (int i = 0; i < list.size(); i++) {
            if (i != (list.size() - 1)) {
                str = str.concat("\nsum(length(coalesce(" + list.get(i) + ",''))),");
            } else str = str.concat("\nsum(length(coalesce(" + list.get(i) + ",'')))");
        }

        str = str.concat("\nfrom " + backfillTable);
        return str;
    }


    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return "Get sum of values";
    }

    public String expectedResultsForSource2() {
        return "Get sum of values";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return "Get sum of values";
    }

    public String expectedResult() {
        return "Numbers should match";
    }
}
