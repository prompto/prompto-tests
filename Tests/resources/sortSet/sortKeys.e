define id as: Integer attribute 
define key as: Text attribute

define Entity as: category with attributes: id and key

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	e1 = Entity with 3 as id and "Peter" as key
	e2 = Entity with 2 as id and "Alan" as key
	e3 = Entity with 1 as id and "John" as key
	set = < e1, e2, e3 >
	print "" + sorted set
