/*Crear un programa que pregunte al usuario cuántos caracteres desea introducir, reserve
espacio para dicho número de caracteres, le permita al usuario introducirlos desde
teclado, y por último se los muestre todos seguidos.*/

#include <stdio.h>
#include<stdlib.h>

int main()
{

int n;
char  *cadea;
int contador;
int contador2;
contador=0;
contador2=0;

printf("Cantos caracteres queres introducir? \n");
scanf("%d",&n);
getchar();

cadea= (char *) malloc(sizeof(char)*n);
printf("Reservaches espazo para %d caracteres \n",n);

for (contador=0;contador<n;contador++)
{
printf("Ingresa o caracter: \n");
scanf("%c",(cadea+contador));
getchar();
}

for (contador2=0;contador2<n;contador2++)
{
printf("Imprimiches o caracter: %c", *(cadea+contador2));
printf("\n");
}

free(cadea);

return(0);
}
