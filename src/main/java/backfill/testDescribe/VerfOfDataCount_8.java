package backfill.testDescribe;

import java.util.List;

public class VerfOfDataCount_8 extends Test {
    @Override
    public String TestName() {
        return null;
    }

    @Override
    public String testsSteps(String database, String tableName, String backfillTable, String netezzaTable) {
        return null;
    }

    public String testsSteps1() {
        return "Get data from source table";
    }

    public String testsSteps2() {
        return "Export this data nto csv file";
    }


    @Override
    public String testDataSource(String schema, String oracleTable) {
        return null;
    }

    public String testDataSource(String database, String sourceSchema, String netezzaTable, String oracleTable, List<String> list) {

        StringBuilder stringBuilder = new StringBuilder();

        if (database.equalsIgnoreCase("Oracle")) {
            stringBuilder.append("select count(*), ");

            for (String s : list) {
                stringBuilder.append(s).append(", ");
            }

            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());

            stringBuilder.append(" from ")
                    .append(sourceSchema)
                    .append(".")
                    .append(oracleTable)
                    .append(" group by ");

            for (String s : list) {
                stringBuilder.append(s).append(", ");
            }

            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            return stringBuilder.toString();
        }else
            stringBuilder.append("select count(*), ");

        for (String s : list) {
            stringBuilder.append(s).append(", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());

        stringBuilder.append(" from ")
                .append(sourceSchema)
                .append(".")
                .append(netezzaTable)
                .append(" group by ");

        for (String s : list) {
            stringBuilder.append(s).append(", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();

    }

    @Override
    public String testDataTarget(String schema, String backfillTable) {
        return null;
    }

    @Override
    public String expectedResultsForSource(String database, String tableName, String netezzaTable) {
        return null;
    }

    public String expectedResultsForSource1() {
        return "Data were returned";
    }


    @Override
    public String expectedResultsForTarget(String database, String backfillTable) {
        return null;
    }

    public String expectedResultsForTarget1() {
        return "Data were exported successfully";
    }
}
