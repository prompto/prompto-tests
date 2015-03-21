define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define name as: Text attribute

define Root as: category with attribute: name

define Child as: Root with methods:

	define printName as: method doing:
		print "/child:" + name

define printName as: method receiving: Root root doing:
	c = root as Child
	c.printName
	
define main as: method receiving: Text{} options doing:
	c = Child with "ok" as name
	printName c
