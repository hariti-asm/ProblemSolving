package hariti.asmaa.problesolving.Implementations;

import hariti.asmaa.problesolving.repositories.PalindromeDigit;

public class PalindromeDigitImpl implements PalindromeDigit {



    @Override
    public Integer reverse(Integer number, Integer reverse) {
        if (number == 0)
            return reverse;

        reverse = reverse * 10 + number % 10;
        return reverse(number / 10, reverse);    }

    @Override
    public boolean isPalindrome(Integer number) {
        return number.equals(reverse2(number, 0));
    }


    @Override
    public Integer sum(Integer number) {
        while (!isPalindrome(number)) {
            Integer reversed = reverse(number, 0);
            number = number + reversed;
        }
        return number;
    }

    public Integer reverse2(Integer number , Integer reverse) {
        while (number > 0) {

            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse ;

    }

}
