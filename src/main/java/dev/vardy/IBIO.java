/* Original code by the International Baccalaureate Organisation.
 * Library and transposition by Jarred Vardy <jarred.vardy@gmail.com>.
 * Generic adaptation by spliitzx
 */

package dev.vardy;

public class IBIO {

    static <T> void output(T info) {
        System.out.println(info);
    }

    static String input(String prompt) {
        String inputLine;
        System.out.print(prompt);
        try {
            inputLine = (new java.io.BufferedReader(
                    new java.io.InputStreamReader(System.in))).readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
            inputLine = "";
        }
        return inputLine;
    }

    static String inputString(String prompt) {
        return input(prompt);
    }

    static String input() {
        return input("");
    }

    static int inputInt() {
        return inputInt("");
    }

    static double inputDouble() {
        return inputDouble("");
    }

    static char inputChar(String prompt) {
        char result = (char) 0;
        try {
            result = input(prompt).charAt(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    static byte inputByte(String prompt) {
        byte result = 0;
        try {
            result = Byte.valueOf(input(prompt).trim());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    static int inputInt(String prompt) {
        int result = 0;
        try {
            result = Integer.valueOf(input(prompt).trim());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    static long inputLong(String prompt) {
        long result = 0;
        try {
            result = Long.valueOf(input(prompt).trim());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    static double inputDouble(String prompt) {
        double result = 0;
        try {
            result = Double.valueOf(input(prompt).trim());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    static boolean inputBoolean(String prompt) {
        boolean result = false;
        try {
            result = Boolean.valueOf(input(prompt).trim());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
