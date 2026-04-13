package exercicio04;

public class Aluno {
    private String nome;
    private double notaMatematica,
            notaPortugues,
            notaGeografia,
            notaHistoria,
            notaCiencias;

    public Aluno(String nome, double notaMatematica, double notaPortugues, double notaGeografia, double notaHistoria, double notaCiencias) {
        this.nome = nome;
        this.notaMatematica = notaMatematica;
        this.notaPortugues = notaPortugues;
        this.notaGeografia = notaGeografia;
        this.notaHistoria = notaHistoria;
        this.notaCiencias = notaCiencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public double getNotaGeografia() {
        return notaGeografia;
    }

    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public double calcularMedia() {
        return (notaMatematica + notaPortugues + notaGeografia + notaHistoria + notaCiencias) / 5.0;
    }

    public String getSituacao() {
        boolean todasAcimaDeSeis = (notaMatematica >= 6 && notaPortugues >= 6 &&
                notaGeografia >= 6 && notaHistoria >= 6 && notaCiencias >= 6);

        double media = calcularMedia();

        if (todasAcimaDeSeis) {
            return "Aprovado";
        } else if (media >= 6.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
