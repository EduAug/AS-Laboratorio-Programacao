public class Ave extends Animal implements Treinavel{

    private double envergaduraAsa;

    public double getEnvergaduraAsa(){
        return envergaduraAsa;
    }
    public void setEnvergaduraAsa(double envergaduraAsa){
        this.envergaduraAsa = envergaduraAsa;
    }

    public Ave(String nome, int idade, double peso, String especie, double envergadura){
        super(nome,idade,peso,especie);
        this.envergaduraAsa = envergadura;
    }

    @Override
    public String realizarTruque(){
        return this.getNome()+" está realizando truques aéreos";
    }

    public String voar(){
        return this.getNome()+" está voando";
    }
}
