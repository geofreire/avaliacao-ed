import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColecaoPaciente colecao = new ColecaoPaciente(5);

        colecao.cadastrarPaciente("Geovana", 18);
        colecao.cadastrarPaciente("Derek", 04);
        colecao.cadastrarPaciente("Iara", 13);
        colecao.cadastrarPaciente("Matheus", 19);
        colecao.cadastrarPaciente("Davy", 01);
        colecao.listarPaciente();

        System.out.println("\ninserindo paciente na posição 1:");
        colecao.cadastrarPacientePorPosicao(1, "Nelson", 50);
        colecao.listarPaciente();

        System.out.println("\nprocurando paciente por posição 2:");
        System.out.println(colecao.procurarPacientePorPosicao(2));

        System.out.println("\nprocurando paciente por nome 'Derek':");
        System.out.println(colecao.procurarPacientePorNome("Derek"));

    }
}
