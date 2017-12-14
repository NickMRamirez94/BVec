.class public sample3
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

; x,y,test,best:integer

.var 0 is x I
.var 1 is y I
.var 2 is test I
.var 3 is best I

; x:=0

	ldc	0
	istore_0

; y:=10

	ldc	10
	istore_1

; test:=8

	ldc	8
	istore_2

; best:=9

	ldc	9
	istore_3

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; print("Local variable x is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Local variable x is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; print(x)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_0
	invokevirtual	java/io/PrintStream/print(I)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; print("Local variable y is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Local variable y is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; print(y)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_1
	invokevirtual	java/io/PrintStream/print(I)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; print("Local variable test is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Local variable test is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; print(test)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_2
	invokevirtual	java/io/PrintStream/print(I)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; print("Local variable best is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Local variable best is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; print(best)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_3
	invokevirtual	java/io/PrintStream/print(I)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; 


	return

.limit stack 2
.limit locals 4
.end method


.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        sample3/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        sample3/_standardIn LPascalTextIn;

; alpha:=5.0

	ldc	5.0
	putstatic	sample3/alpha F

; print("alpha is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "alpha is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; println(alpha)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample3/alpha F
	invokevirtual	java/io/PrintStream/println(F)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("======Illustrating Type Checking. You can't assign a real to an integer variable=====")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "======Illustrating Type Checking. You can't assign a real to an integer variable====="
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println("======Prints Out to the Console that types do not match======")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "======Prints Out to the Console that types do not match======"
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; i:=alpha


; i:=32

	ldc	32
	putstatic	sample3/i I

; j:=i

	getstatic	sample3/i I
	putstatic	sample3/j I

; i:=-2+3*j

	ldc	2
	ineg
	ldc	3
	getstatic	sample3/j I
	imul
	iadd
	putstatic	sample3/i I

; q:=true

	ldc	1
	putstatic	sample3/q Z

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

; i:=15

	ldc	15
	putstatic	sample3/i I

; j:=12

	ldc	12
	putstatic	sample3/j I

; q:=i>j

	getstatic	sample3/i I
	getstatic	sample3/j I
	if_icmpgt	L005
	iconst_0
	goto	L006
L005:
	iconst_1
L006:
	putstatic	sample3/q Z

; IF(q)THEN{j:=40;println(" ");print("Entered First IF statement. J's value is: ");println(j);}ELSEj:=8

	getstatic	sample3/q Z
	ifeq	L008

; {j:=40;println(" ");print("Entered First IF statement. J's value is: ");println(j);}


; j:=40

	ldc	40
	putstatic	sample3/j I

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; print("Entered First IF statement. J's value is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Entered First IF statement. J's value is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; println(j)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample3/j I
	invokevirtual	java/io/PrintStream/println(I)V

; 

	goto	L007
L008:

; j:=8

	ldc	8
	putstatic	sample3/j I
L007:

; IF(i>j)THEN{j:=22;println(" ");print("Entered Second IF statement. J's value is: ");println(j);}ELSEj:=8

	getstatic	sample3/i I
	getstatic	sample3/j I
	if_icmpgt	L011
	iconst_0
	goto	L012
L011:
	iconst_1
L012:
	ifeq	L010

; {j:=22;println(" ");print("Entered Second IF statement. J's value is: ");println(j);}


; j:=22

	ldc	22
	putstatic	sample3/j I

; println(" ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual	java/io/PrintStream/println(Ljava/lang/String;)V

; print("Entered Second IF statement. J's value is: ")

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "Entered Second IF statement. J's value is: "
	invokevirtual	java/io/PrintStream/print(Ljava/lang/String;)V

; println(j)

	getstatic java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample3/j I
	invokevirtual	java/io/PrintStream/println(I)V

; 

	goto	L009
L010:

; j:=8

	ldc	8
	putstatic	sample3/j I
L009:

; func()

	invokestatic	sample3/func()V

; 


	getstatic     sample3/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
