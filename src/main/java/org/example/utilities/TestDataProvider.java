package org.example.utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class TestDataProvider {

    @DataProvider(name = "Data")
    public Object[] getDataFromExcel() throws IOException {
        return ReadExcelData.dataTable();
    }
}
