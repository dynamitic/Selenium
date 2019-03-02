package com.training.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class Decryption {

    public static String decrypt(String encryptedPassword) {

        BasicTextEncryptor textEncryptors = new BasicTextEncryptor();
        textEncryptors.setPassword("qb@12");
        return textEncryptors.decrypt(encryptedPassword);

    }
}
