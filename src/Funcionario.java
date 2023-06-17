public class Funcionario{
    //"Superclasse" funcionário com atributos privados, pode ser usado para instanciar
    //um funcionário ou como base de herança para veterinário
    private String Nome;
    private String Cargo;
    private double Salario;

    public Funcionario(String nome, String cargo, double salario){
        this.Nome = nome;
        this.Cargo = cargo;
        this.Salario = salario;
    }
    //Construtor para passar os atributos do funcionário na criação do objeto

    //Getters e setters para outras classes que não instanciam funcionário
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        Nome = nome;
    }

    public String getCargo(){
        return Cargo;
    }
    public void setCargo(String cargo){
        Cargo = cargo;
    }

    public double getSalario(){
        return Salario;
    }
    public void setSalario(double salario){
        Salario = salario;
    }
}
