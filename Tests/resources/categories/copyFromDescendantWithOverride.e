define id as: Text attribute 
define name as: Text attribute
define other as: Text attribute
define again as: Text attribute

define Entity as: category with attributes: id and name
define Person as: Entity with attribute: other
define Employee as: Person with attribute: again

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	e1 = Employee with "1" as id, "John" as name, "other" as other and "again" as again
	e2 = Entity from e1, with "Peter" as name
	print "/id:" + e2.id
	print "/name:" + e2.name
	
