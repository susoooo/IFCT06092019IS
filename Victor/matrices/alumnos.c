#include <stdio.h>

int main()
{

int contador;
int opcion;
float suma;
float media;
float menor;
float mayor;
float notas [40];

contador=0;
opcion=0;
suma=0.0;
media=0.0;
menor=0.0;
mayor=0.0;


	for (contador=0;contador<40;contador++)
	{
		printf("Introduzca la nota del alumno %d: ",contador+1);
		scanf("%f", &notas[contador]);
	}

	do
	{
		printf("\n1-Notas\n2-Media\n3-Menor\n4-Mayor\n0-Salir\n");
		scanf("%d", &opcion);
		printf("\n");

		if (opcion==1)
		{
			for (contador=0;contador<40;contador++)
			{
			printf("%.2f ", notas[contador]);
			}
			printf("\n");
		}
		else 
		{
			if(opcion==2)
			{
				for(contador=0;contador<40;contador++)	
				{
					suma=suma+notas[contador];
				}
				media=suma/40;
				printf("Media= %.2f\n", media);
			}
			else
			{
				if(opcion==3)
				{
						menor=notas[0];
						for(contador=0;contador<40;contador++)
						{
							if(menor > notas[contador])
							{
								menor=notas[contador];
							}	
						}
						printf("La menor nota es: %.2f\n", menor);
				}
				else
				{
					if(opcion==4)
				{
						mayor=notas[0];
						for(contador=0;contador<40;contador++)
						{
							if(mayor < notas[contador])
							{
								mayor=notas[contador];
							}	
						}
						printf("La mayor nota es: %.2f\n", mayor);
				}
				else	
				{
					if (opcion!=0)
					{
						printf("Opción no válida\n");
					}
				}
				}
			}
		}
	}
	while(opcion!=0);
	
	printf("\n");
}