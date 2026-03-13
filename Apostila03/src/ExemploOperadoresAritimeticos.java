public class ExemploOperadoresAritimeticos {

    public static void main(String[] args) {
        //Declarar uma variavel do tipo int e atribuir um valor

        int x = 12;
        int y = 32;

        x++; //Aumento o x em 1 unidade, mesma coisa de x=x+1
        System.out.println("X agora é: "+ x); //13

        x--;
        System.out.println("X agora é: " + x); //12

        //Segue a sequencia, então 1 x++ e depois 1 x--, ele vai decrementar do valor novo

        System.out.println("--------------------------------------------");
        y--;
        System.out.println("Y agora é: " + y);

        y++;
        System.out.println("Y agora é: " + y);

        System.out.println("_____________________________________________");
        x+=2; //(x=x+2)
        System.out.println("X é " + x); //14
        x -= 10;
        System.out.println("X é " + x); //?
        x *= 3;
        System.out.println("X é " + x); //?
        x /= 2;
        System.out.println("X é " + x); //?
        x %= 4;
        System.out.println("X é " + x); //?
        y *= x;
        System.out.println("Y é " + y); //?


    }


}
