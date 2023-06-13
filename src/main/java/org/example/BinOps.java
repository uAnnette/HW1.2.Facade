package org.example;

public class BinOps {
    private int result;

    public String sum(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);

        result = arg1 + arg2;

        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);

        result = arg1 * arg2;

        return Integer.toBinaryString(result);
    }
}
