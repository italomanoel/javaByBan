/**
 * Representa o registro de nome e apelido a serem encapsulados no Registro de Memoria,
 *  talvez futura classe abstrata a ser extendida/herdada.
 * @author italomanoel
 */
public class RegistroNome {
	
    private String nome;
    private String apelido;

    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }

    public String  getApelido(){
        return apelido;
    }

    public String setApelido(String apelido){
        return this.apelido = apelido;
    }
}
