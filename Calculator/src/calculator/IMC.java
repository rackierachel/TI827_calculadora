
package calculator;


public class IMC {
    int imc;
    static void calculaIMC() {
    LerDados r = new LerDados();
    r.lerValores();
    System.out.println("IMC: "+
     ( r.valor2 * r.valor2 / r.valor1));
        imc = r.valor1 / r.valor2 + r.valor2;
        if(imc =< 18.5 && imc <25)
    System.out.println(imc+"Peso abaixo do normal");
    
    
    }
    }
