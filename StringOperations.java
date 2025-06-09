public class StringOperations {

    // Hide last 4 digits of a phone number
    public static String hidePhone(String phone) {
        if (phone.length() <= 4) return "****";
        return phone.substring(0, phone.length() - 4) + "****";
    }

    // Hide middle part of an email
    public static String hideEmail(String email) {
        int at = email.indexOf("@");
        if (at <= 2) return "****" + email.substring(at);
        return email.charAt(0) + "****" + email.charAt(at - 1) + email.substring(at);
    }

    // Replace all characters except first and last
    public static String maskString(String word) {
        if (word.length() <= 2) return word;
        return word.charAt(0) + "*".repeat(word.length() - 2) + word.charAt(word.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println("Masked Phone: " + hidePhone("9876543210"));
        System.out.println("Masked Email: " + hideEmail("example@gmail.com"));
        System.out.println("Masked Word: " + maskString("HelloWorld"));
    }
}
