#include <stdio.h>

int main(void)
{
	int x = 5;
	int y = 7;
	int *px = &x;

	printf("%ld\n", x);
	printf("%ld\n", *px);

	x = 10;

	printf("%ld\n", x);
	printf("%ld\n", *px);

	px = &y;

	*px = 20;

	printf("%ld\n", x);
	printf("%ld\n", *px);
	printf("%ld\n", y);

	return 0;
}
