package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Pessoa;

public interface IPessoaRepository extends JpaRepository<Pessoa, Long>{

}
