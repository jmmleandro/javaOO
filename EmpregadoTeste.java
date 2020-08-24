
import java.util.Scanner;

public class EmpregadoTeste{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        //Declarando variavel ----------------------------------------
        Empregado funcionario1;
        Empregado funcionario2;
        Empregado funcionario3;

        //Declarando memória ----------------------------------------
        funcionario1 = new Empregado();
        funcionario2 = new Empregado();
        funcionario3 = new Empregado();

        //Input de dados --------------------------------------------
        funcionario1.setNome("Sandra");
        funcionario1.setCargo("Analista Jr");
        funcionario1.setSalario(1500);

        funcionario2.setNome("Isabela");
        funcionario2.setCargo("Analista Pl");
        funcionario2.setSalario(2000);

        funcionario3.setNome("Edson");
        funcionario3.setCargo("Analista Sr");
        funcionario3.setSalario(2500);

        //Exibir quadro de funcionários -----------------------------

        funcionario1.exibirInfo();
        funcionario2.exibirInfo();
        funcionario3.exibirInfo();

        //Aumentar salário ------------------------------------------
        System.out.print("Deseja aumentar salario para Isabela?");
        String aumentar = teclado.nextLine();

        if (aumentar.equals("sim")){
            System.out.print("Qual o percentual do aumento?");
            double percentual = teclado.nextDouble();
            funcionario2.aumentoSalario(percentual);
        }

        funcionario1.exibirInfo();
        funcionario2.exibirInfo();
        funcionario3.exibirInfo();

    }
}