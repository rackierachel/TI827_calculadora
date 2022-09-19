
package calculator;


class Multiplica {

    static void multiplicar() {
    LerDados r = new LerDados();
    r.lerValores("insira primeiro valor: ", "insira segundo valor: ");
    System.out.println("Multiplicação: "+
     ( r.valor1 * r.valor2));
    }
    
}
