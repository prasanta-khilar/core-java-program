package com.prasanta.basics.general;

public class SequenceStringCount {
    public static void main(String[] args) {

        String st = "AAABBCCCAABBBB";
        System.out.println(st.length());
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= st.length(); i++) {

            if (i < st.length() && st.charAt(i) == st.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(st.charAt(i - 1));
                count = 1;
            }
        }

        System.out.println(sb.toString());

    }
}
