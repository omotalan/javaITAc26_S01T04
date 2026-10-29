package main.java.s104_n1_e02_dni;

public class CalculoDni {
    private static final String LLETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateDniLetter(int baseNumber) {
        validatePositiveNumber(baseNumber);
        validateNumberSize(baseNumber);
        int rest = baseNumber % 23;
        return LLETRAS_DNI.charAt(rest);
    }

    private void validatePositiveNumber(int baseNumber) {
        if (baseNumber <= 0) {throw new IllegalArgumentException("Base number must be positive");}
    }

    private void validateNumberSize(int baseNumber) {
        String digits = Integer.toString(baseNumber).replaceAll("\\D", "");
        if (digits.length() != 8) {throw new IllegalArgumentException("Base number must be eight-digits long");}
    }
}
