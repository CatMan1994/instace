package com.bc.common;

import java.util.UUID;

public class Contance {
    public static int TRUE_FLAG = 1;
    public static int FALSE_FLAG = 2;
    public static String getUniqId () {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
