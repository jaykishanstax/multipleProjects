package com.practice.work.codewars.SortColumnsCsvFile;

import java.util.ArrayList;
import java.util.HashMap;

public class SortColumnsofCsv {

    public static String sortCsvColumns(String csvFileContent)
    {
        ArrayList<ArrayList<String>> FileContentInList = new ArrayList<>();

        HashMap<String,ArrayList<String>> HeaderRowList = new HashMap();

        int rowCount = 0;
        int columnCount = 0;
        for (String row:csvFileContent.split("\n")) {
            String[] coulumnValue = row.split(";");

            ArrayList<String> columnsValueList = new ArrayList();
            ArrayList<String> listOfKeys = new ArrayList();
            for (String cell: coulumnValue) {

                if(rowCount == 0){
                    listOfKeys.add(cell);
                }
                rowCount++;
                columnsValueList.add(cell);
            }

            FileContentInList.add(columnsValueList);
        }

        return csvFileContent;
    }


}
