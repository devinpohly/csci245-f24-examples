#include <stdio.h>

int g = 8;

long fac(long n) {
	if (n < 2)
		return 1;
	long nminus1 = n - 1;
	return n * fac(nminus1);
}

int main(void)
{
	int x;

	x = 5;
	printf("%ld\n", fac(g));

	return 0;
}
