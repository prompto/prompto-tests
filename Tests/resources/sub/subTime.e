define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	print "/" + ('13:03:13.005' - 'PT7.005S')
	print "/" + ('13:03:13.005' - '03:03:13.005')
	