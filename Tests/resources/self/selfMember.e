define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define name as: Text attribute

define Entity as: category with attribute: name, and methods:

	define printSelf as: method receiving: name doing:
		print "/name:" + self.name

define main as: method receiving: Text{} options doing:
	x = Entity with "John" as name
	x.printSelf "Not John"
	
