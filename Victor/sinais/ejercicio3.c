#include <sys/types.h>
#include <signal.h>
#include <stdio.h>
#include <unistd.h>

void trataSenhal (int);
int control=0;

int main()
{
	pid_t idProceso;
	idProceso = fork();

    switch(idProceso)
    {
		case -1: perror ("No se puede lanzar proceso");
			break;
        case 0: signal (SIGUSR1, trataSenhal);
			while (1)	pause ();
			break;
		default:
			while (1)
			{
				sleep (5);
				kill (idProceso, SIGUSR1);
			}
	}
}
void trataSenhal (int numeroSenhal)
{
    printf ("Recibida señal del padre\n");
    control++;
    //printf ("%d\n",control);
    if (control==3)
    {
        kill(getppid(), SIGTERM);
        kill(getpid(), SIGTERM);
    }
}
