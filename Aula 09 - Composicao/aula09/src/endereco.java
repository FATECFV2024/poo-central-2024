public class endereco {

	private String rua;

	private String bairro;

	private String cidade;

	private String complemento;

	private String estado;

	private String numero;

	private String cep;

	private aluno aluno;

	public String validaCep() {
		return null;
	}

	public endereco(String rua, String bairro, String cidade, String complemento, String estado, String numero,
			String cep) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.complemento = complemento;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
	
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
