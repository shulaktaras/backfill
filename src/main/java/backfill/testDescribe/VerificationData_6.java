package backfill.testDescribe;

import java.util.List;

public class VerificationData_6 extends Test {

    public String TestName() {
        return "Verification of data between source and hive table";
    }

    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        return "Select 10000 records from " + database + " table and export in csv file";
    }


    public String testsSteps(String database) {
        return "Select 10000 records from " + database + " table and export in csv file";
    }

    public String testsSteps2() {
        return "Select 10000 records from hive table and export in csv file";
    }

    public String testSteps3() {
        return "Compare two files";
    }

    public String testDataSource(String schema, String tableName) {
        return null;
    }

    public String testDataSource(String schema, String tableName, List<String> list) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("select *, rownum() over(order by ");


        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i)).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(") as rn from ")
                .append(schema)
                .append(".")
                .append(tableName)
                .append(" where rn<=10000;");

        return stringBuilder.toString();
    }

    public String testDataTarget(String schema, String backfillTable) {
        return "some query";
    }

    public String testDataTarget(String backfillTable, List<String> list) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("qab --outputformat=csv2 -e \"select *, rownum() over(order by ");

        for (String aList : list) {
            stringBuilder.append(aList)
                    .append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(") as rn ")
                .append(backfillTable)
                .append(" where rn <=10000; > theFileWhereToStoreTheData2.csv");

        return stringBuilder.toString();
    }

    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return null;
    }

    public String expectedResultsForSource() {
        return "Get csv file with data";
    }

    public String expectedResultsForTarget(String database, String backfillTable) {
        return null;
    }

    public String expectedResult() {
        return "Files match";
    }
}
