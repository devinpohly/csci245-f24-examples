#include <stdio.h>

union hmmm {
	char name[5];
	int x;
	float f;
};

int main(void)
{
	union hmmm thing;

	thing.x = 10;
	thing.f = 3.1415;

	printf("%f %d\n", thing.f, thing.x);
	
	return 0;
}
