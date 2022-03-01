package com.company.day18.validator;

public final class StoreValidator {

    public static boolean isValidCountOfWorkers(int countOfWorkers) {
        return countOfWorkers > 1 && countOfWorkers < 51;
    }

    public static boolean isValidName(String name) {
        return name != null && name.length() > 2;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.length() == 8 && foo1(phoneNumber);
    }

    public static boolean foo1(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
}
