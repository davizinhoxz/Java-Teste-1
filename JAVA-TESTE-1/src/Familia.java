public class Familia {

    private Pessoa encarregadoEducacao;
    private String parentescoEncEducacao;
    private Pessoa aluno;

    public Familia() {
    }

    public Familia(String encarregadoEducacao, String parentescoEncEducacao, String aluno) {
        this.encarregadoEducacao = new Pessoa();
        this.parentescoEncEducacao = parentescoEncEducacao;
        this.aluno = new Pessoa();
    }

    public Pessoa getEncarregadoEducacao() {
        return encarregadoEducacao;
    }

    public void setEncarregadoEducacao(Pessoa encarregadoEducacao) {
        this.encarregadoEducacao = encarregadoEducacao;
    }

    public String getParentescoEncEducacao() {
        return parentescoEncEducacao;
    }

    public void setParentescoEncEducacao(String parentescoEncEducacao) {
        this.parentescoEncEducacao = parentescoEncEducacao;
    }

    public Pessoa getAluno() {
        return aluno;
    }

    public void setAluno(Pessoa aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Familia [encarregadoEducacao=" + encarregadoEducacao + ", parentescoEncEducacao="
                + parentescoEncEducacao + ", aluno=" + aluno + "]";
    }

    public String getInfoEncEducacao(Pessoa Pessoa) {
        return "-----ENCARREGADO-DE-EDUCAÇÃO-----" + "\n\n" +
        "Cartão de Cidadão: " + encarregadoEducacao.getNumeroCC() + 
        "\nNome Competo: " + encarregadoEducacao.getNomeProprio() + " " + encarregadoEducacao.getNomeApelido() + 
        "\nData de Nascimento: " + encarregadoEducacao.getDiaNascimento() + "/" + encarregadoEducacao.getMesNascimento() + "/" + encarregadoEducacao.getAnoNascimento() + 
        "\nGrau de Parentesco: " + parentescoEncEducacao;
    }

    public String getInfoFamilia(Pessoa pessoa1, Pessoa pessoa2) {
        return "-----INFORMAÇÕES-DA-FAMILIA-----" + "\n\n" +
        "Nome do Aluno: " + aluno.getNomeProprio() + " " + aluno.getNomeApelido() + 
        "\nCartão de Cidadão do Aluno: " + encarregadoEducacao.getNumeroCC() + 
        "\nData de Nascimento do Aluno: " + aluno.getDiaNascimento() + "/" + aluno.getMesNascimento() + "/" + aluno.getAnoNascimento() + 
        "\nGrau de Parentesco do Encarregado de Educação: " + parentescoEncEducacao + 
        "\nNome do Encarregado de Educação: " + encarregadoEducacao.getNomeProprio() + " " + encarregadoEducacao.getNomeApelido() +
        "\nCartão de cidadão do Encarregado de Educação" + encarregadoEducacao.getNumeroCC() + 
        "\nData de Nascimento do Encarregado de Educação" + encarregadoEducacao.getDiaNascimento() + "/" + encarregadoEducacao.getMesNascimento() + "/" + encarregadoEducacao.getAnoNascimento();
    }



}
