public class ExemploAluno {

    //método main
    public static void main(String[] args) {
        //Criar um objeto do tipo aluno
        Aluno estudante = new Aluno();
        //Atribuir valores para todos os atributos dos alunos
        estudante.id = 123;
        estudante.idade = 25;
        estudante.matriculado = true;
        estudante.nome = "Carlos Eduardo";
        estudante.turma = 'V';
        estudante.nomeCurso = "ADS";
        estudante.valorMensalidade = 1800;

        //Exibir os valores dos atributos do objeto aluno
        System.out.println("id: " + estudante.id);
        System.out.println("idade:" + estudante.idade);
        System.out.println("Matriculado: " + estudante.matriculado);
        System.out.println("nome: " + estudante.nome);
        System.out.println("Turma " + estudante.turma);
        System.out.println("nomeCurso: " + estudante.nomeCurso);
        System.out.println("valorMensalidade:" + estudante.valorMensalidade);


        //Criar um novo objeto Aluno, atribuir valores para 2 propriedades e exibir os valores

        //Novo aluno
        Aluno estudante2 = new Aluno();

        //Atribuir valores para todos os atributos dos alunos
        estudante2.id = 25;
        estudante2.idade = 72;

        //Exibir os valores dos atributos do objeto aluno
        System.out.println("id: " + estudante2.id);
        System.out.println("idade:" + estudante2.idade);

    }

}
