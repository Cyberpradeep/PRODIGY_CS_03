import java.util.regex.*;

public class PassStrengthChecker {

    // Check if password is at least 8 characters long
    public static boolean isValidLength(String pwd) {
        return pwd.length() >= 8;
    }

    // Check for uppercase letter
    public static boolean hasUppercase(String pwd) {
        return pwd.matches(".*[A-Z].*");
    }

    // Check for lowercase letter
    public static boolean hasLowercase(String pwd) {
        return pwd.matches(".*[a-z].*");
    }

    // Check for digit
    public static boolean hasDigit(String pwd) {
        return pwd.matches(".*[0-9].*");
    }

    // Check for special character
    public static boolean hasSpecialChar(String pwd) {
        return pwd.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    // Assess password strength based on the checks
    public static String checkStrength(String pwd) {
        int score = 0;

        if (isValidLength(pwd)) 
          score++;       
        if (hasUppercase(pwd)) 
          score++;        
        if (hasLowercase(pwd)) 
          score++;        
        if (hasDigit(pwd)) 
          score++;            
        if (hasSpecialChar(pwd)) 
          score++;      

        // Determine strength based on score
        switch (score) {
            case 5: return "Very Strong";
            case 4: return "Strong";
            case 3: return "Medium";
            case 2: return "Weak";
            default: return "Very Weak";
        }
    }

    public static void main(String[] args) {
        String pwd = "Password@123";  // Example password
        System.out.println("Password: " + pwd);
        System.out.println("Strength: " + checkStrength(pwd));
    }
}
