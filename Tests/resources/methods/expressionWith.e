define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define printName as: method receiving: Text name and Text suffix doing:
	print with name + suffix as value

define main as: method receiving: Text{} options doing:
	printName "IBM" with " is a fine company" as suffix
