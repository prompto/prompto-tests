define Entity as: category with attributes: id and name

define id as: Integer attribute
define name as: Text attribute 

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	e = Entity with 1 as id and "John" as name
	print "name=" + e.name
	
