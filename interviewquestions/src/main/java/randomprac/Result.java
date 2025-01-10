package randomprac;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Solution {
    public static String findDay(int month, int day, int year) {
           /* Calendar calendar = Calendar.getInstance();

            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            calendar.set(Calendar.YEAR, year);

            int dayweek = calendar.get(Calendar.DAY_OF_WEEK);

            String nameday = "";
            switch (dayweek) {
                case Calendar.MONDAY:
                    nameday = "MONDAY";
                    break;
                case Calendar.TUESDAY:
                    nameday = "TUESDAY";
                    break;
                case Calendar.WEDNESDAY:
                    nameday = "WEDNESDAY";
                    break;
                case Calendar.THURSDAY:
                    nameday = "THURSDAY";
                    break;
                case Calendar.FRIDAY:
                    nameday = "FRIDAY";
                    break;
                case Calendar.SATURDAY:
                    nameday = "SATURDAY";
                    break;
                case Calendar.SUNDAY:
                    nameday = "SUNDAY";
                    break;
            }
            return  nameday;
        }*/

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONDAY, month-1);
        calendar.set(Calendar.YEAR, year);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        String result=" ";
        switch(week)
        {
            case Calendar.MONDAY:
                result="Monday";
                break;
            case Calendar.TUESDAY:
                result="Tuesday";
                break;
            case Calendar.WEDNESDAY:
                result="Wednesday";
                break;
            case Calendar.THURSDAY:
                result="Thrusday";
                break;
            case Calendar.FRIDAY:
                result="Friday";
                break;
            case Calendar.SATURDAY:
                result="Saturday";
                break;
            case Calendar.SUNDAY:
                result="Sunday";
                break;
            default:
                result="nono";
                break;
        }
        return result;
    }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(new OutputStreamWriter(System.out))));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = Solution.findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


















