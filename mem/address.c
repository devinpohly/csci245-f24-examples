#include <stdio.h>

long g;

void foo(int a) {
	printf("addr a: %ld\n", &a);
	printf("size a: %ld\n", sizeof(a));
}

int main(void)
{
	int x = 1000;
	foo(10);

	printf("addr g: %ld\n", &g);
	printf("size g: %ld\n", sizeof(g));
	printf("addr x: %ld\n", &x);
	printf("size x: %ld\n", sizeof(x));

	int *x_addr = &x;
	printf("addr x: %ld\n", x_addr);
	printf("*x_addr = %d\n", *x_addr);
	*x_addr = 24;
	printf("*x_addr = %d\n", *x_addr);
	printf("x = %d\n", x);

	return 0;
}
