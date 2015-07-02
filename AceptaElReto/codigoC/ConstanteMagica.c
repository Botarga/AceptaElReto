#include <stdio.h>
#include <math.h>

int main ()
{
    float n, k;

    while(1)
    {
        scanf("%f %f", &n, &k);
        if (n != 0 || k != 0 )
            printf("%.0f\n", ((pow(n, 3))+n)/2 + (--k*n));
        else
            break;
    }

    return 0;
}
