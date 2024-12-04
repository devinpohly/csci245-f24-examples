// print(111 % 8)
// i = 1;
// do {
//   print(29 % i);
//   i++;
// } while (i != 11);

// i = r6


	MOVI 111 r2
	MOVI 8 r6

	MOVI aftermod1 r5
	MOVI mod r7
	JMP r7

aftermod1:
	OUT r3


	// initialization
	MOVI 1 r6
topofloop:


	// body
	MOVI 29 r2

	MOVI aftermod2 r5
	MOVI mod r7
	MOVI mod r7
	JMP r7

aftermod2:
	OUT r3


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
	// calculates r3 = r2 % r6
	// returns to the address in r5 (return address)
	MOV r2 r3
	IDIV r6 r2
	MUL r6 r2
	SUB r2 r3

	JMP r5
