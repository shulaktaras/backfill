package backfill.testDescribe;

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

    public String testDataSource2(String database, String targetSchema ,String sourceSchema, String netezzaTable,String oracleTable, List<String> list) {

        StringBuilder stringBuilder = new StringBuilder();

        if (database.equalsIgnoreCase("Oracle")) {
            stringBuilder.append("select ");

            for (String aList : list) {
                stringBuilder.append("sum(length(coalesce(")
                        .append(aList)
                        .append(",''))),");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append("from ")
                    .append(sourceSchema)
                    .append(".")
                    .append(oracleTable)
                    .append(";");

            return stringBuilder.toString();
        }else
            stringBuilder.append("select ");

        for (String aList : list) {
            stringBuilder.append("sum(length(coalesce(")
                    .append(aList)
                    .append(",''))),");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("from ")
                .append(targetSchema)
                .append(".")
                .append(netezzaTable)
                .append(";");

        return stringBuilder.toString();
    }

    public String testDataTarget(String schema, String backfillTable) {
        return "some query";
    }

    public String testDataTarget2(String backfillTable,String targetSchema ,List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("qab --outputformat=csv2 -e \" select ");

        for (String aList : list) {
            stringBuilder.append("sum(length(coalesce(")
                    .append(aList)
                    .append(",''))),");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("from ")
                .append(targetSchema)
                .append(".")
                .append(backfillTable)
                .append(";\" > test4_output.csv");

        return stringBuilder.toString();
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
