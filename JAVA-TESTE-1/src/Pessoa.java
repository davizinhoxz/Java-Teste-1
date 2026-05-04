import java.util.Calendar;
public class Pessoa {

    private int numeroCC;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private int idade;

    

    public Pessoa() {
        this.numeroCC = 0;
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.mesNascimento = 0;
        this.diaNascimento = 0;
    }

    public Pessoa(int numeroCC, String nomeProprio, String nomeApelido, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.numeroCC = numeroCC;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
    }
    
    public int getNumeroCC() {
        return numeroCC;
    }
    public void setNumeroCC(int numeroCC) {
        this.numeroCC = numeroCC;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    
    @Override
    public String toString() {
        return "Pessoa [numeroCC=" + numeroCC + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", mesNascimento=" + mesNascimento + ", diaNascimento="
                + diaNascimento + "]";
    }


    public String getNomeCompleto() {
        return nomeProprio + " " + nomeApelido;
    }

    public int getIdade() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        if(mesNascimento <= currentMonth) {

            if(currentDay < diaNascimento) {
                idade = (currentYear - anoNascimento) - 1;
            } else {
                idade = currentYear - anoNascimento;
            }

        }
        return idade;
    }

}
