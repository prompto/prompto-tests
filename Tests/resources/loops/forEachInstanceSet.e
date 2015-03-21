define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define id as: Integer attribute
define name as: Text attribute
define Entity as: category with attributes: id and name

define main as: method receiving: Text{} options doing:
	e1 = Entity with 1 as id and "a" as name
	e2 = Entity with 2 as id and "b" as name
	for each e in <e1,e2>:
		print "/id=" + e.id + "/name=" + e.name