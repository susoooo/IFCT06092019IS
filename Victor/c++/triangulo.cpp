#include <iostream>

using namespace std;

class ClasePunto
{
    int x;
    int y;
    int z;
    public:
    void PosPunto (int a, int b, int c);
};

class ClaseTriangulo
{
    class ClasePunto
    public:
    void Distancia (int a, int b, int c);
};

void ClasePunto::PosPunto (int a, int b, int c)
{
    x=a;
    y=b;
    z=c;
    cout << "Posición: " << x << ", " << y << ", " << z << endl;
}

void ClaseTriangulo::Distancia (int a, int b, int c)
{
    x=a;
    y=b;
    z=c;
    cout << "Posición: " << x << ", " << y << ", " << z << endl;
}



int main()
{
    int random1;
    int random2;
    int random3;
    ClasePunto objPunto1;
    ClasePunto objPunto2;
    ClasePunto objPunto3;
    ClaseTriangulo objT;
    random1=rand()%50;
    random2=rand()%50;
    random3=rand()%50;
    objT.objPunto1.PosPunto(random1,random2,random3);
    random1=rand()%50;
    random2=rand()%50;
    random3=rand()%50;
    objT.objPunto2.PosPunto(random1,random2,random3);
    random1=rand()%50;
    random2=rand()%50;
    random3=rand()%50;
    objT.objPunto3.PosPunto(random1,random2,random3);
}
