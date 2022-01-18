package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  @Test(dataProvider = "dp")
  public void mytest(String s) {
	  System.out.println("Passed parametr is" +s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
       { "Ravi" },
       { "Mandar" },
       { "Ashwini" },
      { "Kranti" },
      { "Vishal" },
    };
  }
}
