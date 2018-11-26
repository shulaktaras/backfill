package backfill.testName;

import java.util.ArrayList;

public class DefaultValue {

    private ArrayList<String> testNamesForSixthTest = new ArrayList<>();
    private ArrayList<String> expResultsForSixthTest = new ArrayList<>();
    private ArrayList<String> definition = new ArrayList<>();
    private ArrayList<String> header = new ArrayList<>();


    public ArrayList<String> testNamesForSixthTest() {
        testNamesForSixthTest.add("Check if rollback is cleaning all resources mentioned " +
                "in /pipeline/release/your-branch-name/resource-setup_qa.yml file and " +
                "/pipeline/release/your-branch-name/rollback_qa.sh file");
        testNamesForSixthTest.add("Сheck if rollback is not removing or adding anything that is " +
                "not present in the /pipeline/release/your-branch-name/resource-setup_qa.yml " +
                "file and /pipeline/release/your-branch-name/rollback_qa.sh file");
        testNamesForSixthTest.add("Сheck if log file contains message about successful rollback execution");
        testNamesForSixthTest.add("Сheck if log file contains exception if rollback execution was aborted");
        testNamesForSixthTest.add("Сheck if run several rollbacks for the same resources at the same " +
                "time - it won't break anything existing and no additional resources will be deleted");
        testNamesForSixthTest.add("Сheck if Jenkins job with pull request failed on the very beginning " +
                "- rollback won't fail if the files to remove are not present and proper " +
                "information will be written to the logs");
        testNamesForSixthTest.add("Сheck if Jenkins job with pull request failed in the very " +
                "end - rollback won't fail and proper information will be written to the logs");
        testNamesForSixthTest.add("Check if after restoring of backup files during rollback " +
                "they have permissions read/write/execute");

        return testNamesForSixthTest;
    }


    public ArrayList<String> expResultsForSixthTest() {
        expResultsForSixthTest.add("All resources were cleaned");
        expResultsForSixthTest.add("No additional resources were removed");
        expResultsForSixthTest.add("Jenkins console output log file contains message " +
                "about successful rollback execution");
        expResultsForSixthTest.add("Jenkins console output log file contains message " +
                "about unsuccessful rollback execution");
        expResultsForSixthTest.add("No additional resources will be deleted");
        expResultsForSixthTest.add("Rollback won't fail if the files to remove are not present " +
                "and proper information will be written to the logs");
        expResultsForSixthTest.add("Rollback won't fail and proper information will be written to the logs");
        expResultsForSixthTest.add("Files have permissions read/write/execute");

        return expResultsForSixthTest;
    }

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
        definition.add("Validate rollback action");
    }

    public ArrayList<String> getDefinition() {
        return definition;
    }

    public ArrayList<String> getHeader() {
        return header;
    }
}
