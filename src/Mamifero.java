public class Mamifero extends Animal{
    //Polimorfismo de Animal, que implementa os atributos e métodos da superclasse, e
    //adiciona seus métodos e atributos, os mamíferos são animais, mas não necessariamente
    //todos os animais são mamíferos.
    //Polimorfismo de Animal, permitindo que o Animal seja Mamífero ou Ave, dependendo
    //do contexto e necessidade para tal
    private String tipoPelagem;

    public String getTipoPelagem(){
        return tipoPelagem;
    }
    public void setTipoPelagem(String tipoPelagem){
        this.tipoPelagem = tipoPelagem;
    }

    public Mamifero(String nome, int idade, double peso, String especie, String pelagem){
        super(nome,idade,peso,especie);
        this.tipoPelagem = pelagem;
    }
    //Polimorfismo também no construtor, que "pega" de animal, mas passa o tipo da pelagem
    //ao invés da envergadura da asa, como em Ave

    public String amamentar(){
        return this.getNome()+" está amamentando";
    }
    //Método com retorno da ação de amamentar, exclusivo para mamíferos
}
