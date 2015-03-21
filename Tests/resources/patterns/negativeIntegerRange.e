define negativeInteger as: Integer attribute in [MIN_INTEGER..-1] 

define print as: native method receiving: Text value doing:
	Java: System.out.print(value);
	C#: System.Console.Write(value);
	Python2: print(objects=value,end="")
	Python3: print(objects=value,end="")
	JavaScript: process.stdout.write(value);

define printNeg as: method receiving: negativeInteger doing:
	print "/neg=" + negativeInteger

define main as: method receiving: Text{} options doing:
	printNeg -7
	switch on error doing:
		printNeg 42
	when any:
		print "/ok"
	
