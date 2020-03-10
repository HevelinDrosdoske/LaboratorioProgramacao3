package exercicio;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

//instanciando objeto        
        //Aluno primeiroAluno = new Aluno();
        //Aluno segundoAluno = new Aluno();
        //Aluno terceiroAluno = new Aluno();
        Aluno aluno = new Aluno();

        Scanner teclado = new Scanner(System.in);

//atribuindo valores as variáveis
        aluno.nome = "Fulano de tal";
        aluno.cpf = "123.456.789-01";
        aluno.matricula = 12345;
        aluno.notas[0] = 6.0;
        aluno.notas[1] = 7.5;
        aluno.notas[2] = 9.3;
        aluno.notas[3] = 8.2;

//atribuindo valores pela propriedade set em "nome" e "cpf"
        aluno.setNome("Fulano de tal");
        aluno.setCpf("***-***-***-**");
        aluno.setMatricula("12345");

//imprimindo dados
        System.out.println("Exercicio 1: ");
        System.out.println("Nome aluno: " + aluno.nome);
        System.out.println("cpf: " + aluno.cpf);
        System.out.println("Matricula: " + aluno.matricula);
        for (int j = 0; j < 4; j++) {
            System.out.println("Notas: " + aluno.notas[j]);
        }
        System.out.println("Média do aluno: " + aluno.media());

//O get retorna o valor da variável 
//o set altera o valor da variável que foi passado por parâmetro
        System.out.println("\nExercício 2: ");
        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("CPF aluno: " + aluno.getCpf());
        System.out.println("Matricula aluno: " + aluno.getMatricula());

//será considerada a existência de 2 disciplinas e 4 notas, em cada uma destas
//será informado o nome das disciplinas e calculada a média
//será impresso o nome da disciplina, as notas e a média
        for (int d = 0; d < 2; d++) {
            double soma = 0.0;
            System.out.println("Informe o nome da disciplina: ");
            aluno.disciplina[d] = teclado.next();
            for (int l = 0; l < 4; l++) {
                System.out.println("Informe a nota do aluno nesta disciplina: ");
                aluno.notas[l] = teclado.nextDouble();
                soma = soma + aluno.notas[l];
            }
            System.out.println("Notas da disciplina: " + aluno.disciplina[d] + " é:");

            for (int a = 0; a < 4; a++) {

                System.out.println(+aluno.notas[a]);
            }
            double media;
            media = soma / 4;
            System.out.println("\nA disciplina é: " + aluno.disciplina[d] + "\n" + "A media é: " + media + "\n");
        }
    }
}
