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

; x,y:integer

.var 0 is x I
.var 1 is y I

; test,best:real

.var 2 is test F
.var 3 is best F

; x:=0

	ldc	0
	istore_0

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("Entered function")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Entered function"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("======Testing WHILE Loop In Function=====")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "======Testing WHILE Loop In Function====="
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; WHILE(x<10)DO{print("The value of x is: ");println(x);x:=x+1;}

L001:
	iload_0
	ldc	10
	if_icmplt	L003
	iconst_0
	goto	L004
L003:
	iconst_1
L004:
	iconst_1
	ixor
	ifne	L002

; {print("The value of x is: ");println(x);x:=x+1;}


; print("The value of x is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "The value of x is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; println(x)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_0
	invokevirtual	java/io/PrintStream/println(I)V

; x:=x+1

	iload_0
	ldc	1
	iadd
	istore_0

; 

	goto	L001
L002:

; 


	return

.limit stack 2
.limit locals 4
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

; alpha:=5.0

	ldc	5.0
	putstatic	sample/alpha F

; print("alpha is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "alpha is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; println(alpha)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/alpha F
	invokevirtual	java/io/PrintStream/println(F)V

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

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("======Testing IF Statement=====")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "======Testing IF Statement====="
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; IF(q)THEN{j:=7;i:=40;print("Entered if statement. Its value is: ");println(j);}ELSEj:=8

	getstatic	sample/q Z
	ifeq	L010

; {j:=7;i:=40;print("Entered if statement. Its value is: ");println(j);}


; j:=7

	ldc	7
	putstatic	sample/j I

; i:=40

	ldc	40
	putstatic	sample/i I

; print("Entered if statement. Its value is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Entered if statement. Its value is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; println(j)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/j I
	invokevirtual	java/io/PrintStream/println(I)V

; 

	goto	L009
L010:

; j:=8

	ldc	8
	putstatic	sample/j I
L009:

; i:=0

	ldc	0
	putstatic	sample/i I

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("======Testing DO WHILE Loop=====")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "======Testing DO WHILE Loop====="
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; DOj:=2*i;print("The value of j is: ");println(j);i:=i+1;WHILEi<10

L011:

; j:=2*i

	ldc	2
	getstatic	sample/i I
	imul
	putstatic	sample/j I

; print("The value of j is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "The value of j is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

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
	if_icmplt	L013
	iconst_0
	goto	L014
L013:
	iconst_1
L014:
	iconst_1
	ixor
	ifne	L012
	goto	L011
L012:

; alpha:=9.3

	ldc	9.3
	putstatic	sample/alpha F

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

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("======Testing User Defined Function=====")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "======Testing User Defined Function====="
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; func()

	invokestatic	sample/func()V

; 


	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
