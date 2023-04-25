package aula3.Exemplos;

public class Humano {
    public String nome;
    public AnimalEstimacao animal;

    private int idade;

    //metodo da classe -> algo que o objeto pode fazer
    public void falarNome(Humano humano){
        System.out.println("O nome é: "+ humano.nome);
    }

    public Humano(){} //construtor do objeto com tudo vazio
    public Humano(String nome){//construtor do objeto com atributo nome inicializado
        this.nome = nome;
    }


    public void setIdade(int valorIdade){
        this.idade = valorIdade;
    }

    public int getIdade(){
        return idade;
    }
    public void setAnimal(AnimalEstimacao meuAnimal){
        this.animal = meuAnimal;
    }
    public AnimalEstimacao getAnimal() {
        return animal;
    }

    static int somarEmHumanos(int a, int b){
        return a + b;
    }
}
