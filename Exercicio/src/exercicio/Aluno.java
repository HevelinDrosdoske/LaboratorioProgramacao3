package exercicio;

import java.time.LocalDate;

//criando classe Aluno
public class Aluno {

    public String nome;
    public String cpf;
    public int matricula;
    private LocalDate datanascimento;
    private int idade;
    public double notas[];
    public String disciplina[];

//declaração de método construtor
    public Aluno() {
        this.nome = "";
        this.cpf = "000.000.000-00";
        this.matricula = 0;
        this.idade = 0;
        this.notas = new double[4];
        this.disciplina = new String[2];

    }

//método para alterar nome
    public void alteraNome(String nome) {
        this.nome = nome;
    }

//MÉTODO PARA RETORNO DA MÉDIA DO ALUNO
    public double media() {
        double soma = 0.0;
        for (int k = 0; k <= 3; k++) {
            soma = soma + notas[k];
        }
        double md = soma / 4;
        return md;
    }

//getters and setters de nome e cpf
    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getCpf() {
        return cpf;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;

    }
    
    
     public int getMatricula() {
        return matricula;

    }

    public void setMatricula(String matricula) {
        this.matricula = this.matricula;

    }
}
