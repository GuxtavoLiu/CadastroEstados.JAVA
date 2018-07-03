package entidade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {
	@Id
	private long id;
	private String sigla;
	private String nome;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
