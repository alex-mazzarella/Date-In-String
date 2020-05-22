/**Write a method dateString(day, month, year) that returns a string consisting of
        the day of the month, a hyphen, the first three letters in the name of the month,
        another hyphen, and the last two digits of the year*/
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(datestring(2020, 05, 22));

    }

    private static String datestring(int year, int month, int day) {

        return year + "-" + convertToMonthString(month) + "-" + day;
    }

    private static String convertToMonthString(int month) {
        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Aep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                System.out.println("Invalid month");
                break;
        }
        return null;
    }

}
