public class ExemploOperadoresAritimeticos {

    public static void main(String[] args) {
        //Declarar uma variavel do tipo int e atribuir um valor
        int x = 12;
        int y = 32;

        x++;//Aumentou o x em 1 unidade, é a mesma coisa que x = x + 1
        System.out.println("X é: " + x);

        x--;//Decrementou o x em 1 unidade, é a mesma coisa que x = x - 1
        System.out.println("X agora é: " + x);

        x += 2;//x = x+ 2; (Aumentar o x em 2 unidades)
        System.out.println("X agora é " + x);//14
        x -= 10;
        System.out.println("X é: " + x);//4
        x *= 3;
        System.out.println("X é: " + x);//12
        x /= 2;
        System.out.println("X é: " + x);//6
        x %= 4;
        System.out.println("X é: " + x);//0
        y *= x;
        System.out.println("Y é: " + y);//0

        //  Operador Função
        //  + Adição
        //  - Subtração
        //  * Multiplicação
        // Divisão
        //  % Módulo (resto de divisão)
        //  ++ Incremento
        //  -- Decremento
        //  += Atribuição aditiva
        //  -= Atribuição subtrativa
        //  *= Atribuição multiplicativa
        //  = Atribuição de divisão
        //  %= Atribuição de módulo


    }//main
}//class
