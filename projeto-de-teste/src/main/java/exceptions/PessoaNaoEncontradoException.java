package exceptions;

public class PessoaNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public PessoaNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public PessoaNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
