package backfill;

import java.io.*;

public class Backfill {

    public void test1 (String TableName) throws IOException {

        File file =  new File("C:\\Users\\Taras\\Desktop\\example");

        String str = "Select count(*) from " + TableName;

        BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(str);
        bufferedWriter.close();

    }

}


//select count(*) from NameTable
