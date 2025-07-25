public class ColecaoPaciente {
    int quantidade;
    Paciente[] pacientes;

    public ColecaoPaciente(int tamanho) {
        pacientes = new Paciente[tamanho];
        quantidade = 0;
    }

    public void cadastrarPaciente(String nome, int idade) {
        if (quantidade == pacientes.length) {
            aumentaArray();
        }
        pacientes[quantidade++] = new Paciente(nome, idade);
    }

    public void listarPaciente() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(i + ": " + pacientes[i]);
        }
    }

    public void cadastrarPacientePorPosicao(int posicao, String nome, int idade) {
        if (posicao >= 0 && posicao < pacientes.length) {
            pacientes[posicao] = new Paciente(nome, idade);
            if (posicao >= quantidade) {
                quantidade = posicao + 1;
            }
        } else {
            System.out.println("posição inválida.");
        }
    }

    public Paciente procurarPacientePorPosicao(int posicao) {
        if (posicao >= 0 && posicao < quantidade) {
            return pacientes[posicao];
        }
        return null;
    }

    public Paciente procurarPacientePorNome(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (pacientes[i].nome.equalsIgnoreCase(nome)) {
                return pacientes[i];
            }
        }
        return null;
    }

    public void aumentaArray() {
        Paciente[] novoArray = new Paciente[pacientes.length + 5];
        for (int i = 0; i < pacientes.length; i++) {
            novoArray[i] = pacientes[i];
        }
        pacientes = novoArray;
        System.out.println("Array aumentado para tamanho: " + pacientes.length);
    }
}
