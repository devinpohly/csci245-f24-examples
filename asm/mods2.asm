// print(111 % 8)
// i = 1;
// do {
//   print(29 % i);
//   i++;
// } while (i != 11);

// i = r6


	MOVI 111 r2
	MOVI 8 r6

	PUSH r2
	PUSH r6
	MOVI printmod r7
	JAL r7
	POP r10
	POP r10


	// initialization
	MOVI 1 r6
topofloop:


	// body
	MOVI 29 r2

	PUSH r2
	PUSH r1
	MOVI printmod r7
	JAL r7
	POP r10
	POP r10


	// increment
	MOVI 1 r2
	ADD r2 r6

	// test
	MOV r6 r5
	MOVI 11 r2
	SUB r2 r5
	MOVI topofloop r3
	JNZ r5 r3

	HALT


mod:
	PUSH fp
	MOV sp fp

	// get a
	LDLO -3 r3
	// get b
	LDLO -2 r2

	// mod(a, b) returns a % b
	MOV r3 r1
	IDIV r2 r3
	MUL r2 r3
	SUB r3 r1


	POP fp
	RET

printmod:
	PUSH fp
	MOV sp fp
	// printmod(a, b) prints a % b
	PUSH rp

	// get a
	LDLO -3 r1
	// get b
	LDLO -2 r2

	PUSH r1
	PUSH r2
	MOVI mod r7
	JAL r7
	POP r10
	POP r10

	OUT r1

	POP rp
	POP fp
	RET
