public class Main{
    public static void main(String[] args){

        Zoo myZoo = new Zoo(6,2);
        Veterinario dr = new Veterinario("Dolittle","Veterinario",5000,"Quadrúpedes");
        Funcionario jt = new Funcionario("Raimundão","Zelador",3000);

        Animal an1 = new Animal("Delilah",11,250,"Crocodilo");
        Mamifero an2 = new Mamifero("Anji",4,30,"Chimpanzé","Preta");
        Ave an3 = new Ave("Chipp",12,3.4,"Águia-Careca",2.0);
        Mamifero an4 = new Mamifero("Leo",16,140,"Gorila-do-Ocidente","Acinzentado");
        Mamifero an5 = new Mamifero("Sol",20,150,"Gorila-do-oriente","Cinza");
        Ave an6 = new Ave("May",7,0.113,"Calopsita",0.5);
        Animal anN = new Animal("Zato",21,3240,"Orca");

        System.out.println(myZoo.adicionarFuncionario(dr));
        System.out.println(myZoo.adicionarFuncionario(jt));
        System.out.println("//-------------------------------//");
        System.out.println(myZoo.adicionarFuncionario(dr));
        //souts com sinais apenas para "limpar" o output no console e melhorar
        //Legibilidade

        //"GetAll" de funcionários
        for (int i = 0; i < myZoo.getQtdFuncionarios(); i++){

            System.out.println("Funcionario: "+ myZoo.funcionarios[i].getNome()+" |Cargo: "+myZoo.funcionarios[i].getCargo());
        }
        System.out.println("//-------------------------------//");
        //E agora só fazer igual/parecido para os animais,
        //não esquecendo dos métodos

        System.out.println(myZoo.adicionarAnimal(an1));
        System.out.println("===========================");
        System.out.println(myZoo.adicionarAnimal(an2));
        System.out.println("===========================");
        System.out.println(myZoo.adicionarAnimal(an3));
        System.out.println("===========================");
        System.out.println(myZoo.adicionarAnimal(an4));
        System.out.println("===========================");
        System.out.println(myZoo.adicionarAnimal(an5));
        System.out.println("===========================");
        System.out.println(myZoo.adicionarAnimal(an6));
        System.out.println("===========================");

        System.out.println("//-------------------------------//");
        for(int i = 0; i < myZoo.getQtdAnimais(); i++){

            System.out.println("Animal: "+myZoo.animais[i].getNome()+" |Especie: "+myZoo.animais[i].getEspecie()+" |Peso: "+myZoo.animais[i].getPeso()+"Kg");
        }

        System.out.println("===========================");
        System.out.println(myZoo.adicionarAnimal(anN));

        System.out.println("//-------------------------------//");
        for(int i = 0; i < myZoo.getQtdAnimais(); i++){

            System.out.println("Animal: "+myZoo.animais[i].getNome()+" |Especie: "+myZoo.animais[i].getEspecie()+" |Peso: "+myZoo.animais[i].getPeso()+"Kg");
        }
        System.out.println("//-------------------------------//");

        //Sobrecarga
        System.out.println(anN.movimentar());
        System.out.println(an4.movimentar("estranho"));

        System.out.println("===========================");
        System.out.println(dr.realizarExame(an4));
        System.out.println("===========================");
        System.out.println(an5.amamentar());
        System.out.println("===========================");
        System.out.println(an6.realizarTruque());

        System.out.println(an3.voar());
    }
}