#include <netinet/in.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#include <arpa/inet.h>
#include <unistd.h>
 #include <string.h>
#include <stdio.h>

#define PORTNUMBER 12563
int main (void)
{
  char buf [1024];
  int s,n,ns,len;
  struct sockaddr_in name;

  /*Se crea el socket.*/
  s=socket(PF_INET,SOCK_STREAM,0);
  name.sin_family = AF_INET;
  name.sin_port= htons(PORTNUMBER);
  name.sin_addr.s_addr= htonl(INADDR_ANY);
  len = sizeof (struct sockaddr_in);

  /*se pública la dirección y el puerto por el que se va 
  a escuchar*/
  bind(s,(struct sockaddr *)&name,len);

  /*Escucha de peticiones*/

  listen(s,5);

  /* Aceptar conexiones*/
  ns= accept (s,(struct sockaddr*) &name,&len);

  /*Se lee del socket hasta el final de fichero*/
  while((n= recv(ns,buf,sizeof(buf),0))>0)
   /*Se imprime lo que se va leyendo*/
       {
       write(1,buf,n);
       sleep(1);
       send(ns,buf,n,0);
       }
     /*Se cierran conexiones*/
     close(ns);
     close(s);
}