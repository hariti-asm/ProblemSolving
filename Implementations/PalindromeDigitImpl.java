package hariti.asmaa.problesolving.Implementations;

import hariti.asmaa.problesolving.PalindromeDigit;

public class PalindromeDigitImpl implements PalindromeDigit {



    @Override
    public Integer reverse(Integer number, Integer reverse) {
        if (number == 0)
            return reverse;

        reverse = reverse * 10 + number % 10;
        return reverse(number / 10, reverse);    }

    @Override
    public boolean isPalindrome(Integer number) {
        return number.equals(reverse(number, 0));
    }


    @Override
    public Integer sum(Integer number) {
        while (!isPalindrome(number)) {
            Integer reversed = reverse(number, 0);
            number = number + reversed;
        }
        return number;
    }


}
