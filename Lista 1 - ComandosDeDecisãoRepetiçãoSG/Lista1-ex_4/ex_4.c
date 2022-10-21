#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main(){

    setlocale(LC_ALL,"portuguese");

    double num1, num2;
    double menor = 0;

    printf("Digite dois números reais: ");
    scanf("%lf %lf", &num1, &num2);


        if(num1 > num2){

            menor = pow(num2,1.0/3.0);
            printf("A raíz cúbica do menor número será: %lf\n", menor);

            menor = log(num1)/log(num2);
            printf("O logaritmo do menor número será: %lf", menor);
        }

        else if(num2 < num1){
            menor = pow(num1,1.0/3.0);
            printf("A raíz cúbica do menor número será: %lf\n", menor);

            menor = log(num2)/log(num1);
            printf("O logaritmo do menor número será: %lf", menor);
        }

    return 0;
}
