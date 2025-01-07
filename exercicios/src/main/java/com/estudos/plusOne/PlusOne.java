package com.estudos.plusOne;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] novoNumero = new int[n + 1];
        novoNumero[0] = 1;
        return novoNumero;
    }
}
