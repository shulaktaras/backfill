package backfill.Tests;

public abstract class Test {


    public abstract String TestName();

    public abstract String testsSteps(String database, String tableName, String backfillTable, String netezzaTable);

    public abstract String testDataSource(String schema, String tableName);

    public abstract String testDataTarget(String schema, String backfillTable);

    public abstract String expectedResultsForSource(String database, String tableName, String netezzaTable);
    public abstract String expectedResultsForTarget(String database, String backfillTable);



}

