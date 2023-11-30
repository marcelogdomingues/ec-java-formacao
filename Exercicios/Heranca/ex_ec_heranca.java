// Classe Pai (Superclasse)
class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

// Classe Filha (Subclasse)
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da classe pai
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " : Au Au!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Cachorro cachorro = new Cachorro("Rex");

        animal.emitirSom(); // Saída: O animal emite um som.
        cachorro.emitirSom(); // Saída: Rex late: Au Au!
    }
}
