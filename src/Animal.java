public class Animal{
    //Uma classe, ou superclasse "de tipo geral", para os animais do zoológico,
    //uma vez que serão adicionados animais ao zoológico, que não necessariamente
    //serão dos tipos das subclasses, "Toda ave é um animal, nem todo animal é uma ave"
    private String Nome;
    private int Idade;
    private double Peso;
    private String Especie;

    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        Nome = nome;
    }

    public int getIdade(){
        return Idade;
    }
    public void setIdade(int idade){
        Idade = idade;
    }

    public double getPeso(){
        return Peso;
    }
    public void setPeso(double peso){
        Peso = peso;
    }

    public String getEspecie(){
        return Especie;
    }
    public void setEspecie(String especie){
        Especie = especie;
    }

    public Animal(String nome, int idade, double peso, String especie){
        this.Nome = nome;
        this.Idade = idade;
        this.Peso = peso;
        this.Especie = especie;
    }
    //Construtor de animal para que seus atributos sejam alterados/adicionados ao criá-lo
    //sem a necessidade de ficar chamando os getters na main para alterar um atributo

    public String movimentar(String forma){
        return this.getNome()+" está se movimentando "+forma;
    }
    public String movimentar(){
        return this.getNome()+" está se movimentando normalmente";
    }
    //Sobrecarga de método, permitindo que o mesmo método seja chamado de forma diferente,
    //a fim de desempenhar um retorno diferente baseado nos parâmetros passados
}
