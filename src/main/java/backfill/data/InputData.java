package backfill.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InputData {


    Map<String, ArrayList<String>> TableData = new HashMap<String, ArrayList<String>>();

    public void dataFilling() {


        ArrayList<String> schema = new ArrayList<String>();
        schema.add("EDW_STAGING");

        ArrayList<String> SourceTable = new ArrayList<String>();
        SourceTable.add("ctr_sales_item");

        ArrayList<String> backfillTable = new ArrayList<String>();
        backfillTable.add("backfill_edw_ctr_sales_item");

        ArrayList<String> database = new ArrayList<String>();
        database.add("Oracle");


        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("POROWPOS");//NUMBER
        numbers.add("POROWSEQ");//NUMBER


        ArrayList<String> characters = new ArrayList<String>();
        characters.add("PURCHASE_ORDER_NUM");//VARCHAR2
        characters.add("EFFECTIVE_DATE");//DATE
        characters.add("RCPT_STATUS_CD");//VARCHAR2


        ArrayList<String> date = new ArrayList<String>();
        date.add("END_DATE");//DATE

        TableData.put("numbers", numbers);
        TableData.put("characters", characters);
        TableData.put("date", date);

    }
//        for (String name : TableData.keySet()) {
//
//            String key = name;
//            String value = TableData.get(name).toString();
//
//            if (key.equalsIgnoreCase("numbers")) {
//                System.out.println(value);
//            }

//            System.out.println(key + " " + value);
//            System.out.println(key);


}

