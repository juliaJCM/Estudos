#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(){
      setlocale(LC_ALL,"portuguese");

    char name [50];
    char surname [50];

    printf("Digite seu nome: ");
    scanf("%s", name);

    printf("Digite seu sobrenome: ");
    scanf("%s", surname);

    printf("Esse é seu nome: %s %s\n", name, surname);

    return 0;
}
