#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
 typedef struct {
    char titulo[30];
    char autor[20];
    char assunto[100];
    int id;
}Livros;

int main()
{
    setlocale(LC_ALL,"portuguese");

    Livros l[5];
    for(int cont = 0; cont < 5; cont++){
    printf("Digite o título do livro:");
    scanf("%s", l[cont].titulo);
    printf("Digite o autor do livro:");
    scanf("%s", l[cont].autor);
    printf("Digite o assunto do livro:");
    scanf("%s", l[cont].assunto);
    printf("Digite o id do livro:");
    scanf("%i", &l[cont].id);
    }

    for(int i = 0; i < 5; i++){
    printf("%s %s %s %i", l[i].titulo, l[i].autor, l[i].assunto, l[i].id);
    }

    return 0;
}
