define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define id as: Integer attribute 

define Entity as: category with attribute: id, and methods:

	define printName as: method receiving: Text arg doing:
		s = "/Text, id=" + id + ", arg=" + arg
		print s

	define printName as: method receiving: Integer arg doing:
		s = "/Integer, id=" + id + ", arg=" + arg
		print s

define printEntity as: method receiving: Entity e doing:
	e.printName "string"
	e.printName 32

define main as: method receiving: Text{} options doing:
	e = Entity with 1 as id
	printEntity e