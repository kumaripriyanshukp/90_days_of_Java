// Program to print all alphabets using string builder.
public class Alphabets {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println("The String is : " + sb);
    }
}
