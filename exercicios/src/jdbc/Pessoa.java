package jdbc;

public class Pessoa {
	private Integer codigo;
	private String nome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	

}
