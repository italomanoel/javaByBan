/**
 * Teste das classes de Registros.
 * @author italomanoel
 */
public class RegistroTeste {
	
    public static void main(String[] args) {
    	
        RegistroMemoria ru1 = new RegistroMemoria();
        RegistroNome rn1 = new RegistroNome();
        ru1.setNumero(1);
        rn1.setNome("Irado");
        rn1.setApelido("Continua irado");        
        System.out.println(
            "Numero " + ru1.getNumero() +
            ", Nome " + rn1.getNome() +
            ", Apelido " + rn1.getApelido() + "."
            );

        RegistroMemoria ru2 = new RegistroMemoria();
        RegistroNome rn2 = new RegistroNome();
        ru2.setUsua(rn2);
        ru2.setNumero(2);
        ru2.getUsua().setNome("Sei");
        ru2.getUsua().setApelido("Ã‰ irado");
        System.out.println(
            "Segundo numero " +ru2.getNumero() +
            ", Segundo Nome " + ru2.getUsua().getNome() +
            ", Segundo Apelido " + ru2.getUsua().getApelido() + "."
            );
    }
}
