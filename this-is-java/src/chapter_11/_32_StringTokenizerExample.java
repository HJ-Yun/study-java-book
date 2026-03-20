package chapter_11;

import java.util.StringTokenizer;

public class _32_StringTokenizerExample {
    public static void main(String[] args) {
        String str = "Mark/Mike/June/Janny";

        StringTokenizer st = new StringTokenizer(str,"/");
        int countTokens = st.countTokens();
        for (int i=0; i < countTokens; i++){
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println();

        st = new StringTokenizer(str,"/");
        while (st.hasMoreElements()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
