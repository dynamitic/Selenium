package com.training.util;

import org.testng.annotations.DataProvider;

public final class DataProviderFactory {

    @DataProvider(name = "BirthDate")
    public static Object[][] getDataFromDataProvider() {
        return new Object[][]{
                {"11", "Eylül", "1992"}
        };
    }
}