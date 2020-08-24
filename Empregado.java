public class Empregado{

    private String nome;
    private String cargo;
    private double salario;


    // Area nome ----------------------------------
    String getNome(){
        return nome;
    }

    void setNome(String novoNome){
        nome = novoNome;
    }

    //Area de Cargo -------------------------------

    String getCargo(){
        return cargo;
    }

    void setCargo(String novoCargo){
        cargo = novoCargo;
    }

    //Area de Salario ------------------------------

    double getSalario(){
        return salario;
    }

    void setSalario(double novoSalario){
        salario = novoSalario;
    }


    //Exibir informações do funcionário ------------

    void exibirInfo(){
        System.out.println("Nome: " +nome+ " // Cargo: " +cargo+ " // Salário: " +salario);
    }

    //Amento de salário -----------------------------
    void aumentoSalario(double percentual){
        salario = salario + ((salario*percentual)/100);
    }


}