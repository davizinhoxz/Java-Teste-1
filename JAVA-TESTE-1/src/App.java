public class App {
    public static void main(String[] args) throws Exception {
        Pessoa encarregadoEdu = new Pessoa();
        Pessoa aluno = new Pessoa();
        Familia familia = new Familia();

        encarregadoEdu.setNumeroCC(1234567);
        encarregadoEdu.setNomeProprio("Leoncyo");
        encarregadoEdu.setNomeApelido("Nascimento");
        encarregadoEdu.setDiaNascimento(18);
        encarregadoEdu.setMesNascimento(4);
        encarregadoEdu.setAnoNascimento(1984);

        aluno.setNumeroCC(2345678);
        aluno.setNomeProprio("Davi");
        aluno.setNomeApelido("Nascimento");
        aluno.setDiaNascimento(18);
        aluno.setMesNascimento(5);
        aluno.setAnoNascimento(2010);

        System.out.println("Nome aluno: " + aluno.getNomeCompleto());
        System.out.println("Idade ALuno: " + aluno.getIdade());
        System.out.println(encarregadoEdu.getInfoEncEducacao(encarregadoEdu));
        System.out.println(familia.getInfoFamilia(aluno, encarregadoEdu));

    }
}
