define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	print "/" + (3.0 <= 4)
	print "/" + (3.0 <= 3)
	print "/" + (3.1 <= 3)
	print "/" + (3.0 <= 4.0)
	print "/" + (3.0 <= 3.0)
	print "/" + (3.1 <= 3.0)
	