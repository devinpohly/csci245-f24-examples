#include "length.h"

int length(int max, char str[]) {
	int i = 0;
	while (i < max && str[i] != '\0') {
		i++;
	}
	return i;
}
