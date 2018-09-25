package AbirAhmed;

public class AbirAhmedLib {
    //String section
    public static String dateStr(String str)
    {
        return str.substring(0, 2) + "-" + str.substring(3, 5) + "-" + str.substring(6);  //This takes the string str and separates the numbers by using substring method and adding dashes in place of the slashes.

    }


        public static boolean isPalindrome(String str)
        {
            String x = "";
            for(int i = str.length() - 1; i >= 0; i--)    //This reverses the string str
            {
                x += str.charAt(i);
            }
            if(x.equals(str))     //This confirms whether the string is a palindrome or not
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    public static String cutOut(String mainStr, String subStr)
    {
        int x = mainStr.indexOf(subStr);
        if (mainStr.indexOf(subStr) >= 0) {      //This checks where string subStr is in the mainStr
            return mainStr.substring(0, x) + mainStr.substring(x + subStr.length()); //After finding it, it is cutout and returned.
        } else {
            return mainStr;
        }
    }

    //Math section
    public static boolean isFibonacci(int integer) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        while (integer > sum)   //This creates a Fibonacci sequence
        {
            sum = num1 + num2;
            if (integer == sum)   //This checks whether int integer is in that sequence and returns the boolean value.
            {
                return true;
            }
            num1 = num2;
            num2 = sum;
        }
        return false;
    }

    public static int sumUpTo(int integer)
    {
        int sum = 0;
        for (int i = 0; i <= integer; i++)    //This loop adds all the integers before int integer and returns sum
        {
            sum = sum + i;
        }
        return sum;
    }
}

