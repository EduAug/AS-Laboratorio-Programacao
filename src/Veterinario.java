public class Veterinario extends Funcionario{

    private String Especialidade;

    public String getEspecialidade(){
        return Especialidade;
    }
    public void setEspecialidade(String especialidade){
        Especialidade = especialidade;
    }

    public Veterinario(String nome, String cargo, double salario, String especialidade){
        super(nome,cargo,salario);
        this.Especialidade = especialidade;
    }
    public String realizarExame(Animal animal){
        return "Doutor(a) "+this.getNome()+" está examinando "+animal.getNome();
    }
}
