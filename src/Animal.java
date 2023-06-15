public class Animal{
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

    public String movimentar(String forma){
        return this.getNome()+" está se movimentando "+forma;
    }
    public String movimentar(){
        return this.getNome()+" está se movimentando normalmente";
    }
}
