public class AtbashCipher{
    public static void main(String args[]) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArr = alphabet.split("", 26);
    
        for(String a: alphabetArr) {
            System.out.println(a);
        }
    }
}

