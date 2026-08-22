package br.com.impacta.exemplo.heranca;

public class Programador extends Funcionario {

    private String linguagem;
    
    public Programador() {
    	 super();
    }
    
    
    public Programador(String linguagem) {
    	
    	this.linguagem = linguagem;
    }
     
    
	public Programador(String nome, double salario, String linguagem) {
		super(nome, salario);
		this.linguagem = linguagem;
	}
	

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
    @Override
	public String getNome() {
		return "Programador : " + super.getNome() ;
    }
    
    
    @Override
    public double getSalario() {
		return super.getSalario();
	}
    
    public String alteraSalarario() {
    	return "R$" + this.getSalario();
    }
    
    
    
}
