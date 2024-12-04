	movi 12 r1
	out r0
	out r1
loop:
	add r1 r1
	out r1
	movi loop r2
	jmp r2
	halt
