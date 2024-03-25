package com.rohit.learn.ds.strings;

import com.rohit.learn.datastructures.strings.ipAddresses.IpAddressValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ValidIPAddTest {

    @Test
    public void validIPtest() {
        var expected = List.of("1.9.216.80",
                "1.92.16.80",
                "1.92.168.0",
                "19.2.16.80",
                "19.2.168.0",
                "19.21.6.80",
                "19.21.68.0",
                "19.216.8.0",
                "192.1.6.80",
                "192.1.68.0",
                "192.16.8.0");
        var actual = IpAddressValidator.validIPAddresses("1921680");
        Assertions.assertEquals(expected, actual);
    }
}
