package org.example.practice.problems;

import java.io.Serializable;

public class ReverseDigit {
    public static void main(String[] args) {
        int digit = 12345;
        String sentence= "I  AM INDIAN YO BOY";
//        System.out.println(reverse(digit));
        System.out.println(countWord(sentence));

    }

    public static int reverse(int digit){//12345
        int reverseDigit=0;
        while(digit!=0){
            int rem = digit%10;
            reverseDigit = reverseDigit*10+rem;
            digit=digit/10;
        }
        return reverseDigit;
    }

    public static int countWord(String sentence) {
        int count = 0;
        boolean skip = true;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)==' '){//I  AM INDIAN
                skip=true;
                continue;
            }else if(skip){
                count=count+1;
                skip=false;
            }
        }
        return count;
    }
}

