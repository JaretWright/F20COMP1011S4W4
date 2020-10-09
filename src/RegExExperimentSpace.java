public class RegExExperimentSpace {
    public static void main(String[] args) {
        String validPhone = "7055551234";
        String validPhone2 = "705 555 1234";
        String validPhone3 = "705-555-1234";
        String validPhone4 = "(705) 555-1234";
        String validPhone5 = "705.555.1234";
        String invalidPhone = "1234234567";
        String phoneRegEx = "\\(?[2-9]\\d{2}\\)?[-.\\s]?[2-9]\\d{2}[-.\\s]?\\d{4}";

        System.out.printf("%14s is valid: %b%n",validPhone, validPhone.matches(phoneRegEx));
        System.out.printf("%14s is valid: %b%n",validPhone2, validPhone2.matches(phoneRegEx));
        System.out.printf("%14s is valid: %b%n",validPhone3, validPhone3.matches(phoneRegEx));
        System.out.printf("%14s is valid: %b%n",validPhone4, validPhone4.matches(phoneRegEx));
        System.out.printf("%14s is valid: %b%n",validPhone5, validPhone5.matches(phoneRegEx));
        System.out.printf("%14s is valid: %b%n",invalidPhone, invalidPhone.matches(phoneRegEx));

    }
}
