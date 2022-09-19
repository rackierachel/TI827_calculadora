
package calculator;


class Divide {

    static void dividir() {
    LerDados r = new LerDados();
    r.lerValores("insira primeiro valor: ", "insira segundo valor: ");
    System.out.println("Divisão: "+
     ( r.valor1 / r.valor2));
    }
    
}
