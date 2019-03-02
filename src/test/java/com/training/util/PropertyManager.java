package com.training.util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public final class PropertyManager {

    private static Logger logger = LoggerFactory.getLogger(PropertyManager.class);
    public static String url;
    public static String loginPageHeader;
    public static String userNameCheck;
    public static String userName;
    public static String invalidUserName;
    public static String password;
    public static String invalidPassword;
    public static String loginErrorMessage;
    public static String duplicateErrorMessage;
    public static String enrolmentHeader;
    public static String searchText;

    public static void loadData(File file) {

        try {
            FileReader fr = new FileReader(file);
            if (file.getName().endsWith("json")) {
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(fr);
                JSONObject jsonObject = (JSONObject) obj;

                url = (String) jsonObject.get("url");
                userName = (String) jsonObject.get("userName");
                invalidUserName = (String) jsonObject.get("invalidUserName");
                userNameCheck = (String) jsonObject.get("userNameCheck");
                password = (String) jsonObject.get("password");
                invalidPassword = (String) jsonObject.get("invalidPassword");
                loginErrorMessage = (String) jsonObject.get("loginErrorMessage");
                duplicateErrorMessage = (String) jsonObject.get("duplicateErrorMessage");
                loginPageHeader = (String) jsonObject.get("loginPageHeader");
                enrolmentHeader = (String) jsonObject.get("enrolmentHeader");
                searchText = (String) jsonObject.get("searchText");

            } else {
                Properties property = new Properties();
                property.load(fr);

                url = property.getProperty("url");
                userName = property.getProperty("userName");
                invalidUserName = property.getProperty("invalidUserName");
                userNameCheck = property.getProperty("userNameCheck");
                password = property.getProperty("password");
                invalidPassword = property.getProperty("invalidPassword");
                loginErrorMessage = property.getProperty("loginErrorMessage");
                duplicateErrorMessage = property.getProperty("duplicateErrorMessage");
                loginPageHeader = property.getProperty("loginPageHeader");
                enrolmentHeader = property.getProperty("enrolmentHeader");
                searchText = property.getProperty("searchText");
            }
        } catch (FileNotFoundException e) {
            logger.info("File Not Found " +e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
