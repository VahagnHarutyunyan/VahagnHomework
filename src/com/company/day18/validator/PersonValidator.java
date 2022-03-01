package com.company.day18.validator;

public final class PersonValidator {

    public static boolean isValidFirstName(String firstName) {
        return firstName != null && firstName.length() > 2 && firstName.length() < 16;
    }

    public static boolean isValidLastName(String lastName) {
        return lastName != null && lastName.length() > 5 && lastName.length() < 21;
    }

    public static boolean isValidAge(int age) {
        return age > 17 && age < 100;
    }

    public static boolean isValidGender(String gender) {
        return gender != null && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"));
    }

    public static boolean isValidPassportID(String passportID) {
        return passportID != null && passportID.length() == 8 && passportID.startsWith("AN") && foo(passportID.substring(2));
    }

    public static boolean foo(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}


