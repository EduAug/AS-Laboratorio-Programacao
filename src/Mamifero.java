public class Mamifero extends Animal{

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

    public String amamentar(){
        return this.getNome()+" está amamentando";
    }
}
