public class Veterinario extends Funcionario{
    //Subclasse que herda de funcionário, adicionando a especialidade do veterinário
    //além dos atributos do funcionário
    private String Especialidade;

    public String getEspecialidade(){
        return Especialidade;
    }
    public void setEspecialidade(String especialidade){
        Especialidade = especialidade;
    }

    //Construtor de veterinário que passa pelo construtor de funcionário com os parâmetros
    //do veterinário e em seguida passa a especialidade do veterinário. Veterinários são
    //funcionários do zoológico, funcionários não precisam ser veterinários.
    public Veterinario(String nome, String cargo, double salario, String especialidade){
        super(nome,cargo,salario);
        this.Especialidade = especialidade;
    }

    //Método exclusivo de veterinário que retorna o exame pelo dr(a) no animal passado por
    //parâmetro, como Animal não é inicializado e seu atributo Nome é privado, é utilizado
    //um getter para acessar esse dado.
    public String realizarExame(Animal animal){
        return "Doutor(a) "+this.getNome()+" está examinando "+animal.getNome();
    }
}
