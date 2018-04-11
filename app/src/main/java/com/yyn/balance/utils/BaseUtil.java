package com.yyn.balance.utils;

/**
 * Created by Jimi on 4/10/2018.
 */

public class BaseUtil {
    public static boolean isEmptyString(String str) {
        return ((null == str) || (str.length() < 1));
    }
}
