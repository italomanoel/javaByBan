/**
 * Representa o registro dos dados, encapsulando objetos da classe RegistroNome.
 * @author italomanoel
 *
 */
public class RegistroMemoria {
    private int numero;   
    private RegistroNome usua;

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public RegistroNome getUsua(){
        return usua;
    }

    public RegistroNome setUsua(RegistroNome usua){
        return this.usua = usua;
    }    
}
