define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	print "/" + ( 3.0 * 8 )
	print "/" + ( 3 * 8.0 )
	print "/" + ( 3.0 * 8.0 )
	