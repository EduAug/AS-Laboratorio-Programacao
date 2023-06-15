public class Funcionario{
    private String Nome;
    private String Cargo;
    private double Salario;

    public Funcionario(String nome, String cargo, double salario){
        this.Nome = nome;
        this.Cargo = cargo;
        this.Salario = salario;
    }

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
