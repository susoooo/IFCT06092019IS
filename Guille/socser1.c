#include <netinet/in.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <stdio.h>
#include <netdb.h>
#define PORTNUMBER 12543
int main (void)
{
char buf[1024];
int s,n,len;
struct sockaddr_in name;
int nm;
s = socket(PF_INET, SOCK_DGRAM,0);
name.sin_family = AF_INET;
name.sin_port = htons(PORTNUMBER);
name.sin_addr.s_addr =htonl(INADDR_ANY);
len = sizeof(struct sockaddr_in);

bind(s,(struct sockaddr*)&name,len);

while((n=recvfrom(s,buf,sizeof(buf),0,(struct sockaddr*)&name,&len))>0)
    
    
    if (*buf=='0')
    {
        printf ("mensaxe recibido\n");
    }
    else 
      {
         printf ("mensaxe recibido tamén\n");
      }
    sendto(s,buf,n,0,(struct sockaddr*)&name,len);
    printf ("envíame un 0 para realizar unha suma e un 1 para un cálculo factorial\n"); 
    
close(s);
}