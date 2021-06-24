package week3.day3;


public class Task6 {
    public static void main(String[] args) {
        countVowelsDigits("a566hjb");

    }
   public static void countVowelsDigits(String str){
        int countOfVowel = Task4.count(str);
        int countOfDigit =0;
       for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) >= '0' && str.charAt(i)<='9')
               countOfDigit++;
       }
       double percentDigit = (double)(countOfDigit * 100) / str.length();
       double percentVowel = (double)(countOfVowel * 100) / str.length();
       System.out.println("count of digits " + countOfDigit +" "+ String.format("%.2f", percentDigit));
       System.out.println("count of vowels " + countOfVowel +" "+ String.format("%.2f", percentVowel));

   }
}
