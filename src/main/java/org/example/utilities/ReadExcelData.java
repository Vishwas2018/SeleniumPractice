package org.example.utilities;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;

class ReadExcelData {

    static Object[] dataTable() throws IOException {
        Object[] dataTable;
        Hashtable<String, String> dataArray;
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/SampleData.xls");
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet hssfSheet = hssfWorkbook.getSheet("Sheet1");
        int rows;
        rows = hssfSheet.getPhysicalNumberOfRows();
        int columns;

        System.out.println("The number of columns in the excel sheet are: " + rows);

        dataTable = new Object[rows - 1];
        HSSFCell cellHeader;
        HSSFCell cellValue;

        int tempVariable = 0;
        for (int i = 0; i < rows - 1; i++) {
            dataArray = new Hashtable<>();
            columns = hssfSheet.getRow(i).getPhysicalNumberOfCells();
            for (int j = 0; j < columns; j++) {
                cellHeader = hssfSheet.getRow(i).getCell(j);
                cellValue = hssfSheet.getRow(i + 1).getCell(j);
                dataArray.put(cellHeader.toString(), cellValue.toString());
            }
            System.out.println("The data array is: " + dataArray);
            dataTable[tempVariable] = dataArray;
            System.out.println("The data table is: " + Arrays.deepToString(dataTable));
            tempVariable++;
        }
        return dataTable;
    }
}


