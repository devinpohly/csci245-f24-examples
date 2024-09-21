#include <stdio.h>

#include "geometry.h"

void print_point(struct point p)
{
	printf("(%g, %g)", p.x, p.y);
}

struct point flip_xy(struct point p)
{
	struct point new;
	new.x = p.y;
	new.y = p.x;
	return new;
}

int main(void)
{
	struct point p;
	p.x = 3.9;
	p.y = -0.12;

	printf("P:");
	print_point(p);
	printf("\n");

	p = flip_xy(p);

	printf("P:");
	print_point(p);
	printf("\n");

	return 0;
}
