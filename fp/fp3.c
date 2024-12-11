#include <stdio.h>
#include <stdlib.h>

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

int (*pickone(int n))(void) {
	switch (n) {
		case 0:
			return f;
		case 1:
			return g;
		case 2:
			return h;
		default:
			abort();
	}
}

int (*(*pop)(int))(void) = pickone;

int (*(**return_ptr_to_ptr_to_the_pickone_function(void))(int))(void) {
	return &pop;
}

//typedef int (*foo_func)(void);

int main(void)
{
	for (int i = 0; i < 3; i++) {
		int x = (*return_ptr_to_ptr_to_the_pickone_function())(i)();
		//int x = foo();
		printf("returned %d\n", x);
	}

	return 0;
}
