package com.spartaglobal.configtest.test;

import com.spartaglobal.configtest.ConfigTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConfigTesterTest {
    @Test
    public void testGetMessage(){
        ConfigTester configTester = new ConfigTester();
        String actual = configTester.getMessage("Clara");
        String expected = "Welcome to Sparta, Clara!";
        Assertions.assertEquals(expected, actual);
    }
}
