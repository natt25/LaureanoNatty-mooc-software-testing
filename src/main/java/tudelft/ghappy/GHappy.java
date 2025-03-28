package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;  // Asegura que la cadena no sea nula

        // Recorremos cada caracter de la cadena
        for(int i = 0; i < str.length(); i++) {

            // Si encontramos una g
            if(str.charAt(i) == 'g') {

                // Verificamos si tiene una g a la izquierda
                // Si existe, continuamos al siguiente caracter
                if (i > 0 && str.charAt(i-1) == 'g') { continue; }

                // Verificamos si tiene una g a la derecha
                // Si existe, continuamos al siguiente caracter
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }

                // Si llegamos aqui, la g no tiene compañeras -> no es feliz
                return false;
            }
        }
        // Si recorrimos toda la cadena sin encontrar 'g's solitarias
        return true;

    }
}
