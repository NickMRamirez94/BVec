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

; q,w:boolean

.field private static q Z
.field private static w Z

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method static func()V

; x,y,z:integer


; x:=1

	ldc	1
	istore_0

; y:=2

	ldc	2
	istore_1

; z:=3

	ldc	3
	istore_2

; x:=z

	iload_2
	istore_0

; IF(x>y)THEN{x:=5;}ELSEx:=10

	iload_0
	iload_1
	if_icmpgt	L003
	iconst_0
	goto	L004
L003:
	iconst_1
L004:
	ifeq	L002

; {x:=5;}


; x:=5

	ldc	5
	istore_0

; 

	goto	L001
L002:

; x:=10

	ldc	10
	istore_0
L001:

; println(x)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_0
	invokevirtual	java/io/PrintStream/println(I)V

; 


	return

.limit stack 2
.limit locals 3
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

; q:=true

	ldc	1
	putstatic	sample/q Z

; print("I is equal to: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "I is equal to: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; println(i)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/i I
	invokevirtual	java/io/PrintStream/println(I)V

; IF(3<5)THEN{j:=7;i:=40;println(j);}ELSEj:=8

	ldc	3
	ldc	5
	if_icmplt	L015
	iconst_0
	goto	L016
L015:
	iconst_1
L016:
	ifeq	L014

; {j:=7;i:=40;println(j);}


; j:=7

	ldc	7
	putstatic	sample/j I

; i:=40

	ldc	40
	putstatic	sample/i I

; println(j)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/j I
	invokevirtual	java/io/PrintStream/println(I)V

; 

	goto	L013
L014:

; j:=8

	ldc	8
	putstatic	sample/j I
L013:

; IF(false)THEN{println(i);}ELSEprintln("I skipped it")

	ldc	0
	ifeq	L018

; {println(i);}


; println(i)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/i I
	invokevirtual	java/io/PrintStream/println(I)V

; 

	goto	L017
L018:

; println("I skipped it")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "I skipped it"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V
L017:

; i:=0

	ldc	0
	putstatic	sample/i I

; WHILE(i<10)DO{println(i);i:=i+1;}

L019:
	getstatic	sample/i I
	ldc	10
	if_icmplt	L021
	iconst_0
	goto	L022
L021:
	iconst_1
L022:
	iconst_1
	ixor
	ifne	L020

; {println(i);i:=i+1;}


; println(i)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/i I
	invokevirtual	java/io/PrintStream/println(I)V

; i:=i+1

	getstatic	sample/i I
	ldc	1
	iadd
	putstatic	sample/i I

; 

	goto	L019
L020:

; i:=0

	ldc	0
	putstatic	sample/i I

; DOj:=2*i;println(j);i:=i+1;WHILEi<10

L023:

; j:=2*i

	ldc	2
	getstatic	sample/i I
	imul
	putstatic	sample/j I

; println(j)

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
	if_icmplt	L025
	iconst_0
	goto	L026
L025:
	iconst_1
L026:
	iconst_1
	ixor
	ifne	L024
	goto	L023
L024:

; alpha:=9.3

	ldc	9.3
	putstatic	sample/alpha F

; println(alpha)

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

; func()

	invokestatic	sample/func()V

; 


	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
