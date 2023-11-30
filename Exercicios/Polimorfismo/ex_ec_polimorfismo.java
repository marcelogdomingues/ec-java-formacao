class Animal {
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato mia: Miau Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Animal();
        animais[1] = new Cachorro();
        animais[2] = new Gato();

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
