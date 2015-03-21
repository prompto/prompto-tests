define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define name as: Text attribute 

define Entity as: singleton with attribute: name

define main as: method receiving: Text{} options doing:
	with Entity, do:
		name = "John"
	with Entity, do:
		print "/name:" + name