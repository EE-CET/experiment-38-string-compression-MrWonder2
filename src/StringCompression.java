import java.util.*;
public class StringCompression {
        // TODO: Read the string
        // TODO: Iterate through the string to count consecutive characters
        // TODO: Append char and count to a StringBuilder
        // TODO: Compare lengths of original vs compressed
        // TODO: Print the shorter one (or compressed if equal length, depending on strict interpretation. Usually original if compressed is not strictly smaller, but prompt says "if compressed is longer")
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                char a = s.charAt(0);
                StringBuilder compressed = new StringBuilder();
                int count = 0;
                for(int j=0; j<s.length(); j++){
                        if(a == s.charAt(j)){
                                count++;
                        }
                        else{
                                compressed.append(a);
                                compressed.append(count);
                                a = s.charAt(j);
                                count = 1;
                        }
                }
                compressed.append(a);
                compressed.append(count);
                if(compressed.length() > s.length()){
                        System.out.println(s);
                }
                else{
                        System.out.println(compressed);
                }
                sc.close();
        }
}
