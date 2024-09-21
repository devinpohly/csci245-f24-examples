#include <stdio.h>
#include "inputlen.h"
#include "length.h"

int inputlen(void) {
	char input[100];
	scanf("%s", input);
	return length(100, input);
}
