#include "length.c"

int inputlen(void) {
	char input[100];
	scanf("%s", input);
	return length(input);
}
