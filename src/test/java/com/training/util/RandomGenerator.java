package com.training.util;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {


    public static String randomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String randomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public static String randomAlphaNumeric(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public static String randomEmail(int length) {
        return randomAlphaNumeric(length) + "@gmail.com.tr";
    }

}

