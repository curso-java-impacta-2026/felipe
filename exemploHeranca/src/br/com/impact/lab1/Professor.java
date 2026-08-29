package br.com.impact.lab1;

public class Professor extends Pessoa {

	private int idade;
	private float salario;
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Professor(String nome, int idade, char sexo,int numeroRg , String datanasc, float salario, String diciplina) {
		
		super (nome,idade,sexo,rg);
		
		
		
		
		
		
		
		
		
	}
	
	
	@Override
	public void falar(String fala) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}
