package com.amazon.data;

import org.testng.annotations.DataProvider;

public class dataProvider {
    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Core Java Books", "Selenium Books", "Data Structure Books"};
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"testuser001", "testpass001"}, {"testuser002", "testpass002"}, {"testuser003", "testpass003"}};
    }

    @DataProvider(name="TestData")
    public Object[]provideSearchData(){
        Object[]data= {"Books", "TV", "Java Books", "CellPhones"};
        return data;
    }
}
