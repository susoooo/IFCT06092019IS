#include <stdio.h>
#include <math.h>

main()
{

int num;
int numfinal;
num=1;
numfinal=0;

printf("Por favor, introduce o número final desexado: \n");
scanf("%d",&numfinal);

printf("\n");

while(num<=numfinal)
{
printf("%i\n",num);
num=num+1;
}

}
