
package calculator;


class Subtrai {

    static void subtrair() {
    LerDados r = new LerDados();
    r.lerValores();
    System.out.println("Subtração: "+
        ( r.valor1 - r.valor2)); 
    }
    
}
