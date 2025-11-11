public class Calculadora {

    public static void main(String[] args) {
        Operadores op = new Operadores();

        // Operações 
        // soma de 10 + 5
        System.out.println("Soma: " + op.soma(10, 5));

        // subtração de 10 - 5
        System.out.println("Subtração: " + op.sub(10, 5));

        // multiplicação de 10 * 5
        System.out.println("Multiplicação: " + op.mult(10, 5));

        // divisão de 10 / 5
        System.out.println("Divisão: " + op.div(10, 5));

        // Operadores de Atribuição
        int v1 = 10;

        // v1 += 5
        System.out.println("\nAtribuição Soma: " + op.atribSoma(v1, 5));

        // v1 -= 5
        System.out.println("Atribuição Subtração: " + op.atribSub(v1, 5));

        // v1 *= 4
        System.out.println("Atribuição Multiplicação: " + op.atribMult(v1, 4));

        //  v1 /= 5
        System.out.println("Atribuição Divisão: " + op.atribDiv(v1, 5));

        // v1 %= 3
        System.out.println("Atribuição Resto: " + op.atribResto(v1, 3));

        // Operadores Lógicos
        // E 
        System.out.println("\nE lógico (true && false): " + op.e(true, false));

        // Não 
        System.out.println("Não lógico (!true): " + op.nao(true));
        
        // Ou 
        System.out.println("Ou lógico (true || false): " + op.ou(true, false));

        

        // Operadores de Comparação
       
        // Maior
        System.out.println("\nMaior: " + op.maior(10, 5));

        // Menor
        System.out.println("Menor: " + op.menor(10, 5));

        // Menor ou igual
        System.out.println("Menor ou Igual: " + op.menorIgual(5, 10));

        // Maior ou igual
        System.out.println("Maior ou Igual: " + op.maiorIgual(10, 10));

        // Diferente
        System.out.println("Diferente: " + op.diferente(10, 5));

        // Igual
        System.out.println("Igual: " + op.igual(10, 10));

        
    }
}
