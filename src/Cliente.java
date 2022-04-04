
public class Cliente implements Comparable<Cliente>{
	private Integer id;
	private String nome;
	private Integer idade;
	private char sexo;
	
	public Cliente(Integer id, String nome, Integer idade, char sexo) {
		this.setId(id);
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	
	
	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return this.getSexo() - o.getSexo();
	}
	
}
