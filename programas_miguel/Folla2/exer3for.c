#include <stdio.h>
#include <math.h>

main()
{

int inicio;
int num1;
int num2;
inicio=0;
num1=1;
num2=0;

printf("Por favor, introduce o primeiro número desexado: \n");
scanf("%d",&num1);
printf("Por favor, introduce o segundo número desexado: \n");
scanf("%d",&num2);

printf("\n");

for(inicio=num1;num1<=num2;num1=num1+1)
{
printf("%i\n",num1);
}

}


