#include <stdio.h>
#include <math.h>

main()
{

//Variables

int numero1;
int numero2;
int contador;


//Inicializacion

numero1=0;
numero2=0;
contador=0;

//Programa


//Bucle Impares
	
	printf("Bucle Impares\n");
	printf("Introduzca el primer numero:\n");
	scanf("%d",&numero1);
	printf("Introduzca el segundo numero:\n");
	scanf("%d",&numero2);
		
	if (numero1>=numero2)
	{
		for(contador=numero2;contador<=numero1;contador++)
		{
			if(contador%2==1)
			{	
			printf("%d\n",contador);
			}
		}
	}
	
	else
	{
		for(contador=numero2;contador>=numero1;contador--)
		{
			if(contador%2==1)
			{	
			printf("%d\n",contador);
			}
		}
	}

}