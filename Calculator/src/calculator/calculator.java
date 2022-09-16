
package calculator;

import java.util.Scanner;


public class calculator {
    
    
    public static Scanner ler = new Scanner(System.in);
    
            
            public static void main(String[] args) {
                char op;
                do{
                    System.out.println("-------Menu Calculadora-------");
                    System.out.println("+ -> Soma ");
                    System.out.println("- -> Subtracção ");
                    System.out.println("* -> Multiplicação ");
                    System.out.println("/ -> Divisão");
                    System.out.println("e -> Expoente");
                    System.out.println("i- -> IMC");
                    System.out.println("s -> Sair");
                    System.out.println("S -> Selecione Operador");
                    op = ler.next().charAt(0); // ler operador
                    switch (op){
                        case 's':
                        case 'S': break;
                        case '+': Soma.somar();break;
                        case '-': Subtrai.subtrair();break;
                        case '*': Multiplica.multiplicar();break;
                        case '/': Divide.dividir();break;
                        case 'E':
                        case 'e': Expoente.potencia();break;
                        case 'i': IMC.calculaIMC();break;
                        default: System.out.println("Operador incorreto");
                              
                    }
                
                }while(op!='s' && op!='S');
           
        }
}
    

