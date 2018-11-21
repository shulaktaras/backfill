package backfill.testName;

import java.util.ArrayList;

public class DefaultValue {
    public ArrayList<String> getDefinition() {
        return definition;
    }

    public ArrayList<String> getHeader() {
        return header;
    }

    private ArrayList<String> definition = new ArrayList<>();
    private ArrayList<String> header = new ArrayList<>();

    public void headerName() {
        header.add("Tests Name");
        header.add("Test Steps");
        header.add("Test Data");
        header.add("Expected results");
    }

    public void addTestName() {
        definition.add("Tests Name");
        definition.add("Test Steps");
        definition.add("Test Data");
        definition.add("Expected results");
        definition.add("Verification of number of records in Oracle table and target table in hive");
        definition.add("Verification of column names and data types in Oracle table and target table in hive");
        definition.add("Verification of sum of values of numeric columns in Oracle table and target table in hive");
        definition.add("Verification of sum of characters in string columns in Oracle table and target table in hive");
        definition.add("Verification the sum of characters for all the columns casted to String in Oracle table and  target table in hive. Limit number of records to 10000");
        definition.add("Verification of date values in target table in hive");
        definition.add("Verification of data between Oracle and hive table");
    }
}
