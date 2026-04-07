// program to print the substring using string builder.
public class SubStringUsingStringBuilder {
    public static StringBuilder subString(StringBuilder sb, int si, int ei){
        StringBuilder s = new StringBuilder("");
        for(int i = si; i < ei; i++){
            s.append(sb.charAt(i));
        }
        return s;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("The substring is : " + subString(sb,0,5));
    }
}
