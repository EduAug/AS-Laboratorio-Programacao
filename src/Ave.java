public class Ave extends Animal implements Treinavel{
    //Classe "Ave" que herda de Animal e implementa Treinavel, como exemplo de polimorfismo,
    //permite que seja um Animal, porém que possua atributos e métodos diferentes e únicos
    //dependendo da necessidade, ou seja, um Animal pode possuir outra forma, desde que seja
    //uma ave, sem perder sua "essência" de animal

    private double envergaduraAsa;
    //Atributo envergadura da asa, uma vez que apenas aves possuem asas, e não demais animais
    //toda ave é animal, mas nem todo animal possui envergadura da asa
    public double getEnvergaduraAsa(){
        return envergaduraAsa;
    }
    public void setEnvergaduraAsa(double envergaduraAsa){
        this.envergaduraAsa = envergaduraAsa;
    }

    //Construtor passando pelo construtor no super para adicionar os atributos do animal,
    //e então o atributo de ave
    public Ave(String nome, int idade, double peso, String especie, double envergadura){
        super(nome,idade,peso,especie);
        this.envergaduraAsa = envergadura;
    }

    @Override
    public String realizarTruque(){
        return this.getNome()+" está realizando truques aéreos";
    }
    //Sobrescrita do método realizarTruque da interface, uma vez que a interface não
    //implementa como esse método deve ser realizado, apenas que deve, é papel da ave
    //implementar a forma que esse método é realizado, logo, um exemplo de sobrecarga,
    //mesmo método, retorno e "execução" diferente

    public String voar(){
        return this.getNome()+" está voando";
    }
    //Método simples com retorno de mensagem exclusivo da classe ave
}
