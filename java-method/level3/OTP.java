import java.util.Arrays;
import java.util.HashSet;

public class OTP {
    public static String generateOTP() {
        int random = (int) (Math.random() * 1000000);
        
        return String.format("%06d", random);
    }
    
    public static boolean uniqueOtp(String[] otps) {
        HashSet<String> set = new HashSet<>();
        for (String otp : otps) if (!set.add(otp)) return false;
        return true;
    }
    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + uniqueOtp(otps));
    }
}
