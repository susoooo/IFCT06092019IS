#include <stdio.h>
#include <string.h>

main()
{
    //Variables
    int alumnos;
    float notas[100];
    float media;
    float mayor;
    float menor;
    int posicion;
    int opcion;
    float suma;

    //Inicializacion
    
    suma=0.0;
    opcion=0;
    posicion=0;
    media=0.0;
    menor=10.0;
    mayor=0.0;

    //Programa  

    printf("Introduzca el número de alumnos:(max 100)\n");
    scanf("%d",&alumnos);

    if (alumnos>100 && alumnos>0)
    {
        printf("ERROR. Excedido el número de alumnos!");
    }

    else
    {
        for(posicion=0;posicion<alumnos;posicion++)
        {
            printf("Introduza el valor numerico de la nota\n");
            scanf("%f",&notas[posicion]);
        }
        do
        { 
            printf("Seleccione una opcion:\n0-Salir\n1-Notas\n2-Media\n3-Menor\n4-Mayor\n");
            scanf("%d",&opcion);

            switch(opcion)
            {
                case 0:
                {
                    printf("Adios. Hasta pronto\n");
                    break;
                }
                case 1:
                {
                    for(posicion=0;posicion<alumnos;posicion++)
                    {
                        printf("%f\n",notas[posicion]);
                    } 
                    break;
                }

                case 2:
                {
                    for(posicion=0;posicion<alumnos;posicion++)
                    {
                        suma=suma+notas[posicion];
                    }   
                    media=suma/alumnos;
                    printf("La media es: %f\n",media);
                    break;
        
                }

                case 3:
                {
                    menor=10;
                    for(posicion=0;posicion<alumnos;posicion++)
                    {
                        if (notas[posicion]<menor)
                        {
                            menor=notas[posicion];
                        }
                    }
                    printf("La nota menor es: %f\n",menor);
                    break;

                }

                case 4:
                {
                    mayor=0;
                    for(posicion=0;posicion<alumnos;posicion++)
                    {
                        if (notas[posicion]>mayor)
                        {
                        mayor=notas[posicion];
                        }
                    }
                    printf("La nota mayor es: %f\n",mayor);
                    break;
                }

                default:
                {
                    printf("ERROR.Opcion no valida\n");
                    break;
                }



            }

        }while(opcion!=0);

    }
}