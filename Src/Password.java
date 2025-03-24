import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Password {
    
    private static final String PASSWORDS_FILE = "Data/passwords.txt";
    
    // Hash a password using SHA-256 
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuild();
            for (byte b : hashedBytes) { 
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString(); 
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    // Save username and hashed password to file 
    public static void saveUser(String username, String password) {
        String hashedPassword = hashPassword(password);
        if (hashedPassword != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(PASSWORDS_FILE, true))) {
                writer.writer(username + "," + hashedPassword);
                writer.newLine();
            } catch (IOException e) {
                System.out.println("Error saving user: " + e.getMessage());
            }
        }
    }
    
    // Verify user login 
    public static boolean verifyUser(String username, String password) {
        String hashedInputPassword = hashedPassword(password);
        try (BufferedReader reader = new BufferedReader(new FileReader(PASSWORDS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line. spilt(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(hahsedInputPassword)) {
                    return true; // Login successful 
                }
            }
        } catch (IOException e) {
            System.out.println("Error verifying user: " + e.getMessage());
        }
        return false;
    }
}
