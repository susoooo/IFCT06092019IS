#include <stdio.h>
#include <math.h>
main()
{
printf("\n    - Hola soy el programa calcuplus diseñado por Nestor Rois para hacer calculos  matematicos - \n");

int numero1;
int n1;
int n2;
int seleccion;
int suma;
int resta;
int multiplicacion;
double division;



double seno1;
double coseno1;
double tangente1;
double raiz1;
double logbase1;

numero1=0;
n1=0;
n2=0;
suma=0;
resta=0;
multiplicacion=0;
division=0;
seleccion=1;

seno1=0;
coseno1=0;
tangente1=0;
raiz1=0;
logbase1=0;

suma=n1+n2;
resta=n1-n2;
multiplicacion=n1*n2;
division=(float)n1/n2;

if (numero1!=6)
   {
printf("\nPor favor introduce un numero para realizar calculos cuando no quieras realizar mas calculos introduce el numero 6 = %d");
scanf("%d",&numero1);


printf("\n          POR FAVOR INDIQUE QUE OPERACION QUIERE REALIZAR \n");
printf("\nSi desea realizar el seno de %d introduzca                   1 \n",numero1);
printf("Si desea realizar el coseno de %d introduzca                 2 \n",numero1);
printf("Si desea realizar el tangente de %d introduzca               3 \n",numero1);
printf("si desea realizar el raiz cuadrada de %d introduzca          4 \n",numero1);
printf("si desea realizar el logaritmo en base 10 de %d introduzca   5 \n",numero1);
scanf("%d",&seleccion);
  while (seleccion>6||seleccion<1)
       {
printf("\n Entrada de dato erroneo el numero tiene que ser de 1 a 5\n");
      
        }
seno1=sin(numero1*3.14159/180);
coseno1=cos(numero1*3.14159/180);
tangente1=tan(numero1*3.14159/180);
raiz1=sqrt((float)numero1);
logbase1=log((float)numero1);
  
      if(seleccion==1)
         {
           printf("El seno de %d es = %f\n",numero1,seno1);
         }
         else
         {
           if(seleccion==2)
             {
               printf("El coseno de %d es = %f\n",numero1,coseno1);
             }
           else
             {
               if(seleccion==3)
                 {
                   printf("La tangente de %d es = %f\n",numero1,tangente1);
                 }
                else
                 {
                   if(seleccion==4)
                     {
                       printf("La raiz cuadrada de %d es = %f6\n",numero1,raiz1);
                     }
                    else
                     { 
                       if(seleccion==5) 
                         {
                           printf("logaritmo en base 10 de %d es = %f6\n",numero1,logbase1);
                         }
                     }
                 }
             }
         }   
        
  

printf("\n El programa tambien realiza las operaciones basicas entre los dos numeros\n");
printf("por favor introduzca el primer numero %d");
scanf("%d",&n1);
printf("por favor introduzca el segundo numero %d");
scanf("%d",&n2);
printf("\nLa suma de %d y %d es = %d\n",n1,n2,suma);
printf("La resta de %d y %d es = %d\n",n1,n2,resta);
printf("La multiplicación de %d y %d es = %d\n",n1,n2,multiplicacion);
printf("La división entre %d y %d es = %f6\n\n",n1,n2,division);
printf("                           GRACIAS POR USAR EL PROGRAMA CALCUPLUSPRO\n\n");
}
