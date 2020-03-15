#include<stdio.h>
#include<math.h>

float ex(float x, float c)
{
	float ex = 1, ms = 1, ts =x;
	int n = 2;
	while(ts / ms > c)
		{
			ex += ts / ms;
			ts *= x;
			ms *= n++; 	
		} 
	
}

int main ()
{
	float x, c;
	scanf("%f%f", &x,&c);
	printf("%f", ex(x,c));
	return 0;
}
