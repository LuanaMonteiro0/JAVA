package aula3.Exemplos;

public class AnimalEstimacao {
    public String nome;
    public Humano dono;

    public AnimalEstimacao(String nome){//construtor do objeto com atributo nome inicializado
        this.nome = nome;
    }

    public void setDono(Humano meuDono){
        this.dono = meuDono;
    }
}
