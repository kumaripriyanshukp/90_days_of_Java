// Program to count vowels and consonants in a string.
public class Count {
    public static void main(String[] args) {
        String str = "Priyanshu";
        int vowel_count = 0;
        int consonant_count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e'){
                vowel_count++;
            }
            else{
                consonant_count++;
            }

        }
        System.out.println("The vowel count : " + vowel_count);
        System.out.println("The consonant count : " + consonant_count);
    }
}
