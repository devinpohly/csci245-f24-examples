#include <stdio.h>
#include <stdlib.h>

struct array_stack {
	int *arr;
	int capacity;
	int size;
};

void as_init(struct array_stack *as) {
	as->capacity = 2;
	as->arr = malloc(as->capacity * sizeof(int));
	as->size = 0;
}

// if you call this on an empty stack,
// be it on your own head
int as_peek(struct array_stack *as) {
	return as->arr[as->size - 1];
}

void as_ensure_capacity(struct array_stack *as, int size) {
	if (size <= as->capacity) {
		return;
	}

	int newcap = as->capacity * 2;
	while (newcap < size)
		newcap *= 2;

	/* // allocate new array */
	/* int *newarr = malloc(newcap * sizeof(int)); */
	/* // copy old data over */
	/* for (int i = 0; i < as->size; i++) { */
	/* 	newarr[i] = as->arr[i]; */
	/* } */
	/* // free old array */
	/* free(as->arr); */
	/* as->arr = newarr; */
	/* as->capacity = newcap; */

	as->capacity = newcap;
	as->arr = realloc(as->arr, as->capacity * sizeof(int));
}

void as_push(struct array_stack *as, int item) {
	as_ensure_capacity(as, as->size + 1);

	as->arr[as->size] = item;
	as->size++;
}

int as_pop(struct array_stack *as) {
	as->size--;
	return as->arr[as->size];
}

void as_destroy(struct array_stack *as) {
	free(as->arr);
}

int main(void) {
	struct array_stack s;
	as_init(&s);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	printf("%d\n", as_pop(&s));
	as_push(&s, 4);
	as_push(&s, 5);
	printf("%d\n", as_pop(&s));
	printf("%d\n", as_pop(&s));
	printf("%d\n", as_pop(&s));
	as_destroy(&s);
	return 0;
}
