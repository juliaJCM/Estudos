#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main(){

    setlocale(LC_ALL,"portuguese");

    double num1, num2;
    double menor = 0;

    printf("Digite dois n�meros reais: ");
    scanf("%lf %lf", &num1, &num2);


        if(num1 > num2){

            menor = pow(num2,1.0/3.0);
            printf("A ra�z c�bica do menor n�mero ser�: %lf\n", menor);

            menor = log(num1)/log(num2);
            printf("O logaritmo do menor n�mero ser�: %lf", menor);
        }

        else if(num2 < num1){
            menor = pow(num1,1.0/3.0);
            printf("A ra�z c�bica do menor n�mero ser�: %lf\n", menor);

            menor = log(num2)/log(num1);
            printf("O logaritmo do menor n�mero ser�: %lf", menor);
        }

    return 0;
}
