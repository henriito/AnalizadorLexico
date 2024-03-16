
package usr.analizadorlexico;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.*;
import usr.analizadorlexico.Tokens.Tipos;

public class Principal {
    public static void main(String[] args) {
        String entrada = "int sum = 10 + 15";
        
        ArrayList<Tokens> token = lex(entrada);
        
        for (Tokens tkn: token) {
            System.out.println(tkn.getTipo() + " : " + tkn.getEntrada());
        }
    }
    
    private static ArrayList<Tokens> lex(String valor){
        final ArrayList<Tokens> token = new ArrayList();
        final StringTokenizer st = new StringTokenizer(valor);
    
        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            boolean moneda = false;
            
            for(Tipos tokenTipo: Tipos.values()){
                Pattern patron = Pattern.compile(tokenTipo.patron);
                Matcher busqueda = patron.matcher(palabra);
                
                if (busqueda.find()) {
                    Tokens tkn = new Tokens();
                    tkn.setTipo(tokenTipo);
                    tkn.setEntrada(palabra);
                    token.add(tkn);
                    moneda = true;
                }
            }
            
            if (!moneda) {
                throw new RuntimeException("Token invalido");
            }
                
        }
    return token;
    
    }
   
}
