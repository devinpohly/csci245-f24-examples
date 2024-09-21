#include <stdio.h>
#include <math.h>

#include "geometry.h"

void print_point(struct point p)
{
	printf("(%g, %g)", p.x, p.y);
}

double rectangle_area(struct rectangle r) {
	double width = fabs(r.bottom_right.x - r.top_left.x);
	double height = fabs(r.bottom_right.y - r.top_left.y);
	return width * height;
}

double circle_area(struct circle c) {
	return M_PI * c.radius * c.radius;
}
