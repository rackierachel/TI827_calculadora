
package calculator;


class Subtrai {

    static void subtrair() {
    LerDados r = new LerDados();
    r.lerValores("insira primeiro valor: ", "insira segundo valor: ");
    System.out.println("Subtração: "+
        ( r.valor1 - r.valor2)); 
    }
    
}
