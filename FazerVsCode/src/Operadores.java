public class Operadores {

    // Operações Matemáticas

    // soma de v1 e v2
    public float soma(float v1, float v2) {
        return v1 + v2;
    }

    // subtração de v1 por v2
    public float sub(float v1, float v2) {
        return v1 - v2;
    }

    // multiplicação de v1 por v2
    public float mult(float v1, float v2) {
        return v1 * v2;
    }

    // divisão de v1 por v2
    public float div(float v1, float v2) {
        return v1 / v2;
    }

    // Operadores de Atribuição

    // soma incremento a v1 
    public int atribSoma(int v1, int incremento) {
        v1 += incremento;
        return v1;
    }

    // subtrai decremento de v1 
    public int atribSub(int v1, int decremento) {
        v1 -= decremento;
        return v1;
    }

    // multiplica v1 pelo fator 
    public int atribMult(int v1, int fator) {
        v1 *= fator;
        return v1;
    }

    // divide v1 pelo divisor
    public int atribDiv(int v1, int divisor) {
        v1 /= divisor;
        return v1;
    }

    // o resto da divisão de v1 por divisor
    public int atribResto(int v1, int divisor) {
        v1 %= divisor;
        return v1;
    }

    // Operadores de Comparação

    public String igual(float v1, float v2) {
    if (v1 == v2) {
        return v1 + " é igual a " + v2;
    } else {
        return v1 + " não é igual a " + v2;
    }
}

    public String diferente(float v1, float v2) {
        if (v1 != v2) {
            return v1 + " é diferente de " + v2;
        } else {
            return v1 + " não é diferente de " + v2;
        }
    }

    public String maior(float v1, float v2) {
        if (v1 > v2) {
            return v1 + " é maior que " + v2;
        } else {
            return v1 + " não é maior que " + v2;
        }
    }

    public String menor(float v1, float v2) {
        if (v1 < v2) {
            return v1 + " é menor que " + v2;
        } else {
            return v1 + " não é menor que " + v2;
        }
    }

    public String maiorIgual(float v1, float v2) {
        if (v1 >= v2) {
            return v1 + " é maior ou igual a " + v2;
        } else {
            return v1 + " não é maior ou igual a " + v2;
        }
    }

    public String menorIgual(float v1, float v2) {
        if (v1 <= v2) {
            return v1 + " é menor ou igual a " + v2;
        } else {
            return v1 + " não é menor ou igual a " + v2;
        }
    }

    // Operadores Lógicos

        //  a OU b
    public boolean ou(boolean a, boolean b) {
        return a || b;
    }
    
    // a E b
    public boolean e(boolean a, boolean b) {
        return a && b;
    }

    //  NÃO a
    public boolean nao(boolean a) {
        return !a;
    }
}
