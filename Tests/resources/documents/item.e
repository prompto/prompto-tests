define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define main as: method receiving: Text{} options doing:
	doc = Document
	doc.vals = [1,2,3,4,5]
	doc.vals[2] = 10
	print "doc.vals[2]=" + doc.vals[2]
	
