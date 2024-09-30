package hariti.asmaa.problesolving.services;

import hariti.asmaa.problesolving.Implementations.PalindromeDigitImpl;
import hariti.asmaa.problesolving.repositories.PalindromeDigit;

public class ProcessingService {
    private final PalindromeDigit digit;

    public ProcessingService() {
        this.digit = new PalindromeDigitImpl();
    }

    public Integer sum(Integer number) {
        return digit.sum(number);
    }
    public Integer reverse(Integer number) {
        return digit.reverse(number,0);
    }
    public boolean isPalindrome(Integer number) {
        return digit.isPalindrome(number);
    }
}
