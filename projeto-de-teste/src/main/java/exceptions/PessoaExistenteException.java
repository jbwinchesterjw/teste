package exceptions;

public class PessoaExistenteException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public PessoaExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public PessoaExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
