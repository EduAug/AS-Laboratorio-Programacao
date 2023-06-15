public class Zoo{
    private int qtdAnimais;
    private int qtdFuncionarios;

    Animal[] animais;
    Funcionario[] funcionarios;

    public int getQtdAnimais(){
        return qtdAnimais;
    }
    public void setQtdAnimais(int qtdAnimais){
        this.qtdAnimais = qtdAnimais;
    }

    public int getQtdFuncionarios(){
        return qtdFuncionarios;
    }
    public void setQtdFuncionarios(int qtdFuncionarios){
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public Zoo(int animais, int funcionarios){
        this.qtdAnimais = animais;
        this.qtdFuncionarios = funcionarios;
        this.animais = new Animal[qtdAnimais];
        this.funcionarios = new Funcionario[qtdFuncionarios];
    }

    public String adicionarAnimal(Animal newAnimal){

        String messageReturn = "Ok";
        for(int i = 0; i < qtdAnimais; i++){

            if (animais[i] == null){

                animais[i] = newAnimal;
                messageReturn = "O animal "+newAnimal.getNome()+" foi inserido na posição "+i;
                break;
            }else if(animais[qtdAnimais-1] != null){    //Pegando a última posição do array
                                                        //Para ter certeza que está cheio
                messageReturn = "O zoológico já estava cheio, então "+animais[0].getNome()+" virou o hamburger do zoológico e "+newAnimal.getNome()+" ficou em seu lugar";
                animais[0] = newAnimal;
                break;
            }
        }
        return  messageReturn;
    }

    public String adicionarFuncionario(Funcionario newFuncionario){

        String messageReturn = "Ok";
        for(int i = 0; i < qtdFuncionarios; i++){

            if(funcionarios[i] == null){

                funcionarios[i] = newFuncionario;
                messageReturn = newFuncionario.getNome()+" foi contratado e agora faz parte do Zoológico";
                break;
            }else if(funcionarios[qtdFuncionarios-1] != null){

                messageReturn = "Obrigado por enviar seu currículo, "+newFuncionario.getNome()+", ficaremos de olho em uma vaga e entraremos em contato no futuro";
                break;
            }
        }
        return messageReturn;
    }
}
