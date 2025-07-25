public class Paciente {
    String nome;
    int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return ("Nome: " + nome + ", Idade: " + idade);
    }
}
