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

//typedef int (*foo_func)(void);

int main(void) {
	int (*arr[3])(void);

	arr[0] = f;
	arr[1] = g;
	arr[2] = h;

	for (int i = 0; i < 3; i++) {
		int (*foo)(void) = arr[i];
		int x = foo();
		printf("returned %d\n", x);
	}

	return 0;
}
