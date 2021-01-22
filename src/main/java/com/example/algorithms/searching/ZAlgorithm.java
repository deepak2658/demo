package com.example.algorithms.searching;

public class ZAlgorithm {
    public static void main(String[] args) {
        String st = "baaaba";
        String pattern = "aab";

        int[] Z = new int[st.length()+pattern.length()];
        st = pattern+"$"+st;
        int[] z = zFunction(st,Z);

        for (int i = 0; i < z.length; i++) {
            if (z[i]==st.length()){
                System.out.println("string found at index "+i);
                i=i+z[i];
            }
        }
    }

    private static int[] zFunction(String st, int[] z) {

        int l = 0;
        int r = 0;

        for (int i=1; i<st.length()-1;i++){
            if (i<=r) {
                z[i] = Math.min((r - i + 1), z[i - l]);
            }
            while (i+z[i]<st.length() && st.charAt(z[i])==st.charAt(i+z[i])){
                z[i]++;
            }
            if (i+z[i]-1>r){
                l=i;
                r=z[i]+i-1;
            }
        }

        return z;
    }
}
