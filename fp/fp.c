#include <stdio.h>

int f(void) {
	printf("pay respects\n");
	return 2;
}

int g(void) {
	return 10;
}

int h(void) {
	int i = 11;
	printf("hi %d\n", i);
	return -2;
}

int main(void) {
	int (*foo)(void) = &g;

	int x = foo();
	printf("returned %d\n", x);

	return 0;
}
