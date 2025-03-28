package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);

            if (currentChar == ' ') {
                sb.append(currentChar); // Mantener espacios sin cambios
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                char shiftedChar = (char) (((currentChar - 'a' + shift + 26) % 26) + 'a');
                sb.append(shiftedChar);
            } else {
                return "invalid"; // Devolver "invalid" si hay un carácter no permitido
            }
//            sb.append(currentChar);
//            if (currentChar > 'z' || currentChar < 'a') {
//                return "invalid";
//            } else if ((char) (currentChar + shift) > 'z') {
//                currentChar = (char) (currentChar - 26);
//            } else if ((char) (currentChar + shift) < 'a'){
//                currentChar = (char) (currentChar + 26);
//            }
//            sb.append((char) (currentChar + shift));
        }

        return sb.toString();
    }
}
