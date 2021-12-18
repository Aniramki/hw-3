package main.java;

public class ATM {
    public static void main(String[] args) {

    }

    public int countBanknotes(int sum) {

        int result1;


        if (sum >= 1000) {

            result1 = sum / 500;

            sum = sum % 500;
        } else {
            result1 = 0;
        }

        String str = Integer.toString(sum);

        int length = str.length();

        int result = 0 + result1;

        //if (sum >= 1000) {

        // result = sum / 500;

        //}

        while (length > 0) {


            char a = str.charAt(length - 1);

            String k = Character.toString(a);

            int y = Integer.parseInt(k);

            if (y == 0) {

                result += 0;
            } else if (y == 1 || y == 2 || y == 5) {

                result += 1;
            } else if (y == 3 || y == 4 || y == 6 || y == 7) {

                result += 2;
            } else if (y == 8 || y == 9) {

                result += 3;
            }

            length--;
        }

        return result;


    }

}
