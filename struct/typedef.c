#include <stdio.h>

typedef struct point {
	double x;
	double y;
} point_t;

void print_point(struct point p)
{
	printf("(%g, %g)", p.x, p.y);
}

point_t flip_xy(point_t p)
{
	point_t new;
	new.x = p.y;
	new.y = p.x;
	return new;
}

int main(void)
{
	point_t p;
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
