.class public sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; i,j,k:integer

.field private static i I
.field private static j I
.field private static k I

; alpha,beta5x:real

.field private static alpha F
.field private static beta5x F

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        sample/_standardIn LPascalTextIn;

; i:=32

	ldc	32
	putstatic	sample/i I

; j:=i

	getstatic	sample/i I
	putstatic	sample/j I

; i:=-2+3*j

	ldc	2
	ineg
	ldc	3
	getstatic	sample/j I
	imul
	iadd
	putstatic	sample/i I

; print("I is equal to")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "I is equal to"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; print(i)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/i I
	invokevirtual	java/io/PrintStream/println(I)V

; IF(3<5)THEN{j:=7;i:=40;print(j);}ELSEj:=8

	ldc	3
	ldc	5
	if_icmplt	L003
	iconst_0
	goto	L004
L003:
	iconst_1
L004:
	ifeq	L002

; {j:=7;i:=40;print(j);}


; j:=7

	ldc	7
	putstatic	sample/j I

; i:=40

	ldc	40
	putstatic	sample/i I

; print(j)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/j I
	invokevirtual	java/io/PrintStream/println(I)V

; 

	goto	L001
L002:

; j:=8

	ldc	8
	putstatic	sample/j I
L001:

; i:=0

	ldc	0
	putstatic	sample/i I

; WHILE(i<10)DO{print(i);i:=i+1;}

L005:
	getstatic	sample/i I
	ldc	10
	if_icmplt	L007
	iconst_0
	goto	L008
L007:
	iconst_1
L008:
	iconst_1
	ixor
	ifne	L006

; {print(i);i:=i+1;}


; print(i)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/i I
	invokevirtual	java/io/PrintStream/println(I)V

; i:=i+1

	getstatic	sample/i I
	ldc	1
	iadd
	putstatic	sample/i I

; 

	goto	L005
L006:

; i:=0

	ldc	0
	putstatic	sample/i I

; DOj:=2*i;print(j);i:=i+1;WHILEi<10

L009:

; j:=2*i

	ldc	2
	getstatic	sample/i I
	imul
	putstatic	sample/j I

; print(j)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/j I
	invokevirtual	java/io/PrintStream/println(I)V

; i:=i+1

	getstatic	sample/i I
	ldc	1
	iadd
	putstatic	sample/i I

; 

	getstatic	sample/i I
	ldc	10
	if_icmplt	L011
	iconst_0
	goto	L012
L011:
	iconst_1
L012:
	iconst_1
	ixor
	ifne	L010
	goto	L009
L010:

; alpha:=9.3

	ldc	9.3
	putstatic	sample/alpha F

; print(alpha)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/alpha F
	invokevirtual	java/io/PrintStream/println(F)V

; beta5x:=alpha

	getstatic	sample/alpha F
	putstatic	sample/beta5x F

; beta5x:=alpha/3.7-alpha*2.88

	getstatic	sample/alpha F
	ldc	3.7
	fdiv
	getstatic	sample/alpha F
	ldc	2.88
	fmul
	fsub
	putstatic	sample/beta5x F

; beta5x:=8.45*(alpha+9.12)

	ldc	8.45
	getstatic	sample/alpha F
	ldc	9.12
	fadd
	fmul
	putstatic	sample/beta5x F

	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
