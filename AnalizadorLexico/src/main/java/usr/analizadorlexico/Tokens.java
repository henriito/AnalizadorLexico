
package usr.analizadorlexico;

public class Tokens {
    
    private String entrada;
    private Tipos tipo; 
  
    
    enum Tipos{
        INT ("int"),
        FOR ("for"),
        ELSE ("else"),
        PRINT ("print"),
        IF ("if"),
        CONSTANTE ("[0-9]+"),
        SIM_OPERADOR ("[+|-|*|/]"),                 //SIMBOLO OPERADOR
        SIM_ASIGNACION (":="),                        //SIMBOLO ASIGNACION
        SIM_RELACION ("[>=|<=|<|>|<>|{|}|\\[|\\]|(|)|,|;]"),                          //SIMBOLO RELACION
        IDENTIFICADOR ("[a-zA-Z]");        //PALABRA RESERVADA
        
        public final String patron;
        
        Tipos(String s){
            this.patron = s;
        }
    }
    
//Getters y setters    
    /**
     * @return the entrada
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    /**
     * @return the tipo
     */
    public Tipos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }  
}
