
package javajunitcalculadora;


public class Inicio 
{
    public static void main(String[] args) 
    {
        JavaJUnitCalculadora valor;
        int resu;
        valor = new JavaJUnitCalculadora(150, 25);
        resu = valor.suma();
        System.out.printf("El resultado de la suma es: %d\n", resu);
        resu = valor.resta();
        System.out.printf("El resultado de la resta es: %d\n", resu);
        resu = valor.multiplica();
        System.out.printf("El resultado de la multiplicación es: %d\n", resu);
        resu = valor.divide();
        System.out.printf("El resultado de la división es: %d\n", resu);
    }
}
