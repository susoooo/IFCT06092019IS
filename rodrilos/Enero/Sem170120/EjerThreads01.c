#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#include <unistd.h>

void * thread_function(void *arg)
{
    int i;
    for(i=0;i<3;i++)
    {
        printf("Thread says hi!\n");
        sleep(1);
    }
    printf("Thread exists\n");
    return NULL;
}

int main(int argc, char ** argv)
{
    pthread_t mythread;
        printf("Launching new thread...\n");
    if(pthread_create(&mythread, NULL, thread_function, NULL))
    {
        printf("error creating thread.");
        abort();
    }
    if(pthread_join(mythread, NULL))
    {
        printf("error on join\n");
        abort();
    }
    printf("Waiting on join\n");
    //TO_DO: controlar el error con el JOIN
    exit(0);
}