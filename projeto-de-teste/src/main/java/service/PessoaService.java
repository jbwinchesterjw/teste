package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Pessoa;
import exceptions.PessoaExistenteException;
import exceptions.PessoaNaoEncontradoException;
import repository.IPessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private IPessoaRepository pr;
	
	public List<Pessoa>listar(){
		return pr.findAll();
	}

	public Pessoa salvar(Pessoa pessoa) {
		if (pessoa.getId() != null) {
			Optional<Pessoa> a = pr.findById(pessoa.getId());

			if (a != null) {
				throw new PessoaExistenteException("Essa pessoa já existe.");
			}
		}
		return pr.save(pessoa);
	}

	public Optional<Pessoa> buscar(Long id) {
		Optional<Pessoa> autor = pr.findById(id);

		if (autor == null) {
			throw new PessoaNaoEncontradoException("A pessoa não pôde ser encontrado.");
		}
		return autor;
	}

	public void atualizar(Pessoa pessoa) {
		verificarExistencia(pessoa);
		pr.save(pessoa);
	}
	private void verificarExistencia(Pessoa pessoa) {
		buscar(pessoa.getId());
	}
}
