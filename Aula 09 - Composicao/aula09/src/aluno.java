import java.util.Collection;
import java.util.Date;

public class aluno {

	private String nome;

	private int ra;

	private char genero;

	private String cpf;

	private Date dataNascimento;

	private endereco endereco;



	public String validaCpf() {
		return null;
	}

	public Date validaDataNascimento() {
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}

	



	
}
