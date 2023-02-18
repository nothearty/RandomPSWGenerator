package org.example;

public class Main {
    public static void main(String[] args) {
        // max characters: 1
        int length = 8;

        System.out.println(generatePassword(length));

    }

    public static String generatePassword(int length) {
        String lowerCharacters = "abcdefghijklmnopqrstuvwxyz";
        String upperCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharacters = "%$!&*@^#";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length - 1; i++) {

            // Choose if add characters or numbers
            if ((int) (Math.random() * 2) != 0) {
                password.append(numbers.charAt((int) (Math.random() * numbers.length())));
                continue;
            }

            // If 1 add lower characters else upper characters
            if ((int) (Math.random() * 2) == 0)
                password.append(lowerCharacters.charAt((int) (Math.random() * lowerCharacters.length())));
            else
                password.append(upperCharacters.charAt((int) (Math.random() * upperCharacters.length())));
        }
        // Add special character
        password.append(specialCharacters.charAt((int) (Math.random() * specialCharacters.length())));

        return password.toString();
    }
}