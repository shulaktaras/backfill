package backfill.testName;

import java.util.ArrayList;

public class DefaultValue {
    private ArrayList<String> definition = new ArrayList<>();

    private ArrayList<String> header = new ArrayList<>();
    public void headerName() {
        header.add("testDescribe Name");
        header.add("Test Steps");
        header.add("Test Data");
        header.add("Expected results");
    }

    public void addTestName() {
//        definition.add("testDescribe Name");
//        definition.add("Test Steps");
//        definition.add("Test Data");
//        definition.add("Expected results");
        definition.add("Verification of number of records in Oracle table and target table in hive");
        definition.add("Verification of column names and data types in Oracle table and target table in hive");
        definition.add("Verification of sum of values of numeric columns in Oracle table and target table in hive");
        definition.add("Verification of sum of characters in string columns in Oracle table and target table in hive");
        definition.add("Verification of date format in target table in hive");
        definition.add("Verification of data between Oracle and hive table");
    }

    public ArrayList<String> getDefinition() {
        return definition;
    }

    public ArrayList<String> getHeader() {
        return header;
    }
}
