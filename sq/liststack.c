#include <stdio.h>
#include <stdlib.h>

struct node {
	int datum;
	struct node *next;
};

struct list_stack {
	struct node *head;  // = top of stack
};

void ls_init(struct list_stack *ls) {
	ls->head = NULL;
}

// if you call this on an empty stack,
// be it on your own head
int ls_peek(struct list_stack *ls) {
	return ls->head->datum;
}

void ls_push(struct list_stack *ls, int item) {
	struct node *new_node = malloc(sizeof(struct node));
	new_node->datum = item;
	new_node->next = ls->head;
	ls->head = new_node;
}

int ls_pop(struct list_stack *ls) {
	int remember_me = ls->head->datum;
	struct node *remember_to_free_me = ls->head;
	ls->head = ls->head->next;
	free(remember_to_free_me);
	return remember_me;
}

void ls_destroy(struct list_stack *ls) {
	while (ls->head != NULL)
		ls_pop(ls);
}

int main(void) {
	struct list_stack s;
	ls_init(&s);
	ls_push(&s, 1);
	ls_push(&s, 2);
	ls_push(&s, 3);
	printf("%d\n", ls_pop(&s));
	ls_push(&s, 4);
	ls_push(&s, 5);
	printf("%d\n", ls_pop(&s));
	printf("%d\n", ls_pop(&s));
	printf("%d\n", ls_pop(&s));
	ls_destroy(&s);
	return 0;
}
