# miFibonacci

Me motiva escribir esto una situacion que pase en una entrevista de trabajo.

Conocia la sucesion de numeros conocida como Fibonacci pero nunca la habia codeado

Esta sucesion de numeros tiene distintas formas de ser calculada desde un programa.

La tradicional es simple pero tiene la recursividad como principal enemiga.

Se ve basicamente como algo asi:

long fibonacci (int n){
    if(n<2){
        return n;
    }else{
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

Obiamente uso long para tener la posibilidad de recibir numeros mas grandes en el caso de que n sea alto.

El principal problema es que al calcular n mayores a 45 un i7 con 12 gb de ram comienza a tomar algunos segundos

Con el aumento de los calculos en cada incremento de n el tiempo empieza a molestar para un calculo que deberia ser mas rapido.

Despues de leer bastante sobre este tema y encontrar varias maneras de resolverlo, opte por escribir una forma simple pero mas rapida.

Utilice un array en el que solamente se calcula la suma de los valores en forma de bucle

private static long fibonacciArray(int n) {
        long[] secuencia = new long[n]; //Creamos un array del tamaño necesario
        if (n > 2 && n <= 92) { //pongo el limite de 92 dado que al ingresar el valor 93, se excede la capacidad de long
            secuencia[0] = 1; //Asigno el valor 1 al 1
            secuencia[1] = 1; //Asigno el valor 1 al 2

            //Tabla de resultados
            System.out.println("-----------------");
            System.out.println("|   " + 1 + "   |   " + 1 + "   |");
            System.out.println("|   " + 2 + "   |   " + 1 + "   |");
            
            //Relleno la tabla
            for (int i = 2; i < n; i++) {
                secuencia[i] = secuencia[i - 1] + secuencia[i - 2];
                System.out.println("|   " + (i + 1) + "   |   " + secuencia[i] + "   |");
            }
        }
        if (n > 2 && n <= 92) {
            return secuencia[n - 1]; //Devuelvo el numero
        } else if (n > 92) {
            return 0; //Devulevo un valor controlado para los valores superiores a 92
        } else {
            return 1; //Devuelvo el valor 1 para 1 y para 2
        }
    }

Este proceso demora como maximo 1 segundo para el valor de 92 

