define id as: Integer attribute 
define name as: Text attribute

define Person as: category with attributes: id and name
define Company as: category with attributes: id and name
define company as: Company attribute
define Employee as: Person with attribute: company
define Entrepreneur as: Person and Company

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define printName as: method receiving: name doing:
	print with "/name=" + name as value

define printName as: method receiving: Person p doing:
	print with "/person=" + p.name as value

define printName as: method receiving: Employee e doing:
	print with "/employee=" + e.name as value

define main as: method receiving: Text{} options doing:
	c = Company with 1 as id and "IBM" as name
	printName c
	p = Person with 1 as id and "James" as name
	printName p
	e = Employee with 1 as id, "John" as name and c as company
	printName e
