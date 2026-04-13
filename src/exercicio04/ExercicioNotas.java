package exercicio04;

import javax.swing.*;
import java.awt.*;

public class ExercicioNotas {
    private Pilha pilha;
    private int totalAlunos;

    public ExercicioNotas() {
        String input = JOptionPane.showInputDialog("Quantos alunos deseja registar?");
        if (input == null) return;

        totalAlunos = Integer.parseInt(input);
        pilha = new Pilha(totalAlunos);

        for (int i = 0; i < totalAlunos; i++) {
            cadastrarAluno(i + 1);
        }

        processarERelatar();
    }

    private void cadastrarAluno(int indice) {
        JTextField nomeF = new JTextField();
        JTextField matF = new JTextField();
        JTextField portF = new JTextField();
        JTextField geoF = new JTextField();
        JTextField hisF = new JTextField();
        JTextField cieF = new JTextField();

        Object[] formulario = {
                "Nome do Aluno " + indice + ":", nomeF,
                "Nota Matemática:", matF,
                "Nota Português:", portF,
                "Nota Geografia:", geoF,
                "Nota História:", hisF,
                "Nota Ciências:", cieF
        };

        int res = JOptionPane.showConfirmDialog(null, formulario, "Cadastro de Notas", JOptionPane.OK_CANCEL_OPTION);

        if (res == JOptionPane.OK_OPTION) {
            Aluno aluno = new Aluno(
                    nomeF.getText(),
                    Double.parseDouble(matF.getText()),
                    Double.parseDouble(portF.getText()),
                    Double.parseDouble(geoF.getText()),
                    Double.parseDouble(hisF.getText()),
                    Double.parseDouble(cieF.getText())
            );
            pilha.push(aluno);
        }
    }

    private void processarERelatar() {
        String[] colunas = {"Nome", "Mat", "Port", "Geo", "His", "Cie", "Média", "Situação"};
        Object[][] dados = new Object[totalAlunos][8];
        int i = 0;

        while (!pilha.isEmpty()) {
            Aluno aluno = (Aluno) pilha.pop();

            dados[i][0] = aluno.getNome();
            dados[i][1] = aluno.getNotaMatematica();
            dados[i][2] = aluno.getNotaPortugues();
            dados[i][3] = aluno.getNotaGeografia();
            dados[i][4] = aluno.getNotaHistoria();
            dados[i][5] = aluno.getNotaCiencias();
            dados[i][6] = String.format("%.2f", aluno.calcularMedia());
            dados[i][7] = aluno.getSituacao();
            i++;
        }

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setPreferredSize(new Dimension(650, 200));

        JOptionPane.showMessageDialog(null, scroll, "Pilha Processada (Lista Final)", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) { new ExercicioNotas(); }
}