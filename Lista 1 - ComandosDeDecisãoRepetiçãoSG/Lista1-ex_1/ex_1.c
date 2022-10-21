#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int num1, num2;
    printf("Digite dois números inteiros: ");
    scanf("%i %i", &num1, &num2);

    if(num1 > 45||num2 >45){
        num1 = num1 + num2;
        printf("%i", num1);
    }

    else if(num2 < 20 && num2 > 20){
        if(num1>num2){
            num1 = num1 + num2;
            printf("%i", num1);
        }
        else{
            num1 = num1 - num2;
            printf("%i", num1);
        }
    }

    else if(num1 < 10 && num2!= 0){
            num1 = num1 / num2;
            printf("%i", num1);
    }

    else if(num2 < 10 && num1!= 0){
            num2 = num2 / num1;
            printf("%i", num2);
    }

    else {
        printf("Julia");
    }
    return 0;
}
