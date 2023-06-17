public class Zoo{
    private int qtdAnimais;
    private int qtdFuncionarios;
    //Passado como atributos do zoológico a quantia de animais e funcionários que comporta

    Animal[] animais;
    Funcionario[] funcionarios;

    //Criação dos arrays vazios, uma vez que a sua quantidade dependerá dos atributos, que apenas
    //serão passados no construtor, logo, os arrays serão "inicializados" no construtor

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
    //No construtor são passadas as quantidades totais de animais e funcionários,
    //que então são atribuídas aos arrays específicos, já que os arrays não são chamados em
    //nenhum outro lugar, e apenas são atribuídos após a criação do zoológico

    public String adicionarAnimal(Animal newAnimal){

        String messageReturn = "Ok";    //Inicializar com "qualquer coisa"
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
        }       //Retornar baseado no if
        return  messageReturn;
    }
    //Método para adicionar animais no array de animais, onde é inicializada uma string para
    //retorno da mensagem (Adicionado com sucesso, ou não), então iniciado um for que passa pelo
    //array animais, e lá dentro confere se a posição atual em i está ocupada ou não, se
    //estiver vazia, insere o animal do parâmetro lá, se não, confere se a última posição está
    //ocupada, se estiver, remove o animal em "0" e insere o novo animal em seu lugar, e se
    //nenhuma das condições for verdadeira, passa para a próxima posição no array e confere os
    //mesmos condicionais. Por fim é retornada a mensagem, de sucesso ou "sobrescrita"

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
    //Método igual o de inserção de animais, porém para inserir funcionários.
    //No else if, há a condição "qtdFuncionarios-1", já que o atributo será passado algo como
    //10, porém o array começa em 0, o "máximo" da quantidade será 9, por exemplo, e a fim de
    // não "chumbar" o valor tanto da quantidade quanto da posição, é pego o valor passado por
    //parâmetro, e retirado 1, simbolizando a posição 0 em relação ao máximo
}
