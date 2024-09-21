#include <stdio.h>

#include "geometry.h"

int main(void)
{
	struct point tl;
	tl.x = 5;
	tl.y = 0;

	struct point br;
	br.x = 8;
	br.y = -0.5;

	struct rectangle r;
	r.top_left = tl;
	r.bottom_right = br;

	struct circle c;
	c.center = tl;
	c.radius = 10;

	double ra = rectangle_area(r);
	double ca = circle_area(c);

	printf("Rectangle area: %g\n", ra);
	printf("Circle area: %g\n", ca);


	return 0;
}
