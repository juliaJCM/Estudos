#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(){
      setlocale(LC_ALL,"portuguese");

    int n, i = 1;

    printf("Digite um número inteiro: ");
    scanf("%i", &n);

    printf("Os números ímpares são: ");

    while (i > 0) {
        if(n%2 != 0){
            printf("%i\n", n);
        } else {}
        n--;
    }

    return 0;
}
