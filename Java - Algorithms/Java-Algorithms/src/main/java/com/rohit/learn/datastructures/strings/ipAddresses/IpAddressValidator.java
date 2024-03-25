package com.rohit.learn.datastructures.strings.ipAddresses;

import java.util.ArrayList;

public class IpAddressValidator {
    public static ArrayList<String> validIPAddresses(String string) {
        ArrayList<String> ipAddresses = new ArrayList<>();
        var length = string.length();
        for (int i = 1; i <= Math.min(length, 4); i++) {
            var validParts = new String[]{"", "", "", ""};
            validParts[0] = string.substring(0, i);
            if (!isValidIPAddress(validParts[0])) {
                continue;
            }
            for (int j = i + 1; j <= Math.min(length, 4 + i); j++) {
                validParts[1] = string.substring(i, j);
                if (!isValidIPAddress(validParts[1])) {
                    continue;
                }
                for (int k = j + 1; k <= Math.min(length, 4 + j); k++) {
                    validParts[2] = string.substring(j, k);
                    validParts[3] = string.substring(k);
                    if (isValidIPAddress(validParts[2]) && isValidIPAddress(validParts[3])) {
                        ipAddresses.add(String.join(".", validParts));
                    }
                }
            }
        }
        return ipAddresses;
    }

    private static boolean isValidIPAddress(String ipPart) {
        if (ipPart.isEmpty()) return false;
        int intIp = Integer.parseInt(ipPart);
        if (intIp > 255) return false;
        return ipPart.length() == String.valueOf(intIp).length();//checks for leading zeros
    }
}
