package aula3.Exemplos;

public class Main {
    public static void main(String[] args) {
        Humano braleiro1 = new Humano(); //criei uma variavel que armazena um objeto humano chamado braleiro1
        System.out.println(braleiro1.nome);//printei o valor do nome -> sem inicializar recebe null
        braleiro1.nome = "Luan Marqueti";//inicializei o atributo nome com "Luan Marqueti"
        System.out.println(braleiro1.nome);//printei o valor do nome agora inicializado

        Humano braleiro2 = new Humano("Marquinho Ferreira");
        System.out.println(braleiro2.nome);

        AnimalEstimacao passarinho = new AnimalEstimacao("Coca");

        //apresenta um objeto ao parametro do outro e vice versa -> associação de objetos
        passarinho.dono = braleiro1;
        braleiro1.animal = passarinho;

        System.out.println(braleiro1.animal.nome);//retorna nome do animal do braleiro 1
        System.out.println(braleiro1.animal);//retornar o endereço de memoria onde o animal de braleiro1 está

        braleiro1.falarNome(braleiro1);
        braleiro1.falarNome(braleiro2);


        AnimalEstimacao cachorroDoMarquinho = new AnimalEstimacao("Max");
        //associação de objetos
        braleiro2.setAnimal(cachorroDoMarquinho);
        cachorroDoMarquinho.setDono(braleiro2);

        //atributos privados
        //braleiro1.idade //da pau, idade é privada só a prpria classe pode acessar ela

        braleiro1.setIdade(29);

        System.out.println(braleiro1.getIdade());

        //demonstração de metodos, classes e atributos estaticos

        int soma = classeEstatica.somarInts(10, 20);
        System.out.println(soma);

        int somaEmHumanos = Humano.somarEmHumanos(54,85);
        System.out.println(somaEmHumanos);

    }
}
