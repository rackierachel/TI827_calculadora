
package calculator;


public class IMC { 
    static void calculaIMC() {
        float imc;
    LerDados r = new LerDados();
    r.lerValores();

         
        imc = r.valor1/(r.valor2*r.valor2); 
        if (imc <18.5) 
            System.out.println("Abaixo do Peso"); 
        else if (imc >= 18.5 && imc <25) 
            System.out.println("Peso Normal"); 
        else if (imc >=25 && imc<=29.9) 
            System.out.println("Sobrepeso"); 
        else if (imc >=30 && imc <=34.9) 
            System.out.println("Obesidade Grau I"); 
        else if (imc >=35 && imc <=39.9) 
            System.out.println("Obesidade Grau II"); 
        else if (imc >40) 
            System.out.println("Obesidade Grau III"); 
        else 
            System.out.print("Valores inválidos");