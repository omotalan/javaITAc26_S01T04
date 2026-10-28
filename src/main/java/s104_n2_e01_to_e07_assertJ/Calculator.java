package s104_n2_e01_to_e07_assertJ;


public class Calculator {

    public boolean areNumbersEqual(int num1, int num2) {
        return num1 == num2;
    }

    public boolean areArraysIdentical(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return array1 == array2;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
