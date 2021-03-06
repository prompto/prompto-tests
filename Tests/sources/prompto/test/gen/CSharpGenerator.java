package prompto.test.gen;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class CSharpGenerator extends Generator {
	
	static final String ROOT = "prompto-csharp/CSharp-Tests/src/";

	@Override
	protected Target getTarget() {
		return Target.CSHARP;
	}
	
	@Override
	protected void enterSubdir(File subDir) {
	}

	@Override
	protected void exitSubdir(File subDir) throws IOException {
		if(libraryE!=null)
			endLibrary(libraryE);
		if(libraryO!=null)
			endLibrary(libraryO);
		if(libraryM!=null)
			endLibrary(libraryM);
		if(runtimeE!=null)
			endRuntime(runtimeE);
		if(runtimeO!=null)
			endRuntime(runtimeO);
		if(runtimeM!=null)
			endRuntime(runtimeM);
		if(translateEOE!=null)
			endTranslate(translateEOE);
		if(translateEME!=null)
			endTranslate(translateEME);
		if(translateOEO!=null)
			endTranslate(translateOEO);
		if(translateOMO!=null)
			endTranslate(translateOMO);
		closeAll();
	}

	@Override
	protected void addToTranslateEOE(File subDir, String fileName) throws IOException {
		if(translateEOE==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/translate/eoe/Test" + capDirName + ".cs";
			translateEOE = mkfile(testFilePath);
			beginTranslate(translateEOE, capDirName, "E", "eoe");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToTranslate(translateEOE, "EOE", capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToTranslateEME(File subDir, String fileName) throws IOException {
		if(translateEME==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/translate/eme/Test" + capDirName + ".cs";
			translateEME = mkfile(testFilePath);
			beginTranslate(translateEME, capDirName, "E", "eme");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToTranslate(translateEME, "EME", capFileName, subDir.getName(), fileName);
	}
	
	@Override
	protected void addToTranslateOEO(File subDir, String fileName) throws IOException {
		if(translateOEO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/translate/oeo/Test" + capDirName + ".cs";
			translateOEO = mkfile(testFilePath);
			beginTranslate(translateOEO, capDirName, "O", "oeo");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToTranslate(translateOEO, "OEO", capFileName, subDir.getName(), fileName);
	}
	
	@Override
	protected void addToTranslateOMO(File subDir, String fileName) throws IOException {
		if(translateOMO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/translate/omo/Test" + capDirName + ".cs";
			translateOMO = mkfile(testFilePath);
			beginTranslate(translateOMO, capDirName, "O", "omo");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToTranslate(translateOMO, "OMO", capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToTranslateMEM(File subDir, String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void addToTranslateMOM(File subDir, String fileName) {
		// TODO Auto-generated method stub
		
	}

	private void beginTranslate(OutputStreamWriter writer, String dirName, String dialect, String packageName) throws IOException {
		writer.write("using NUnit.Framework;\n");
		writer.write("using prompto.parser;\n");
		writer.write("\n");
		writer.write("namespace prompto.translate.");
		writer.write(packageName);
		writer.write("\n");
		writer.write("{\n");
		writer.write("\n");
		writer.write("\t[TestFixture]\n");
		writer.write("\tpublic class Test");
		writer.write(dirName);
		writer.write(" : Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest\n");
		writer.write("\t{\n");
		writer.write("\n");
	}


	private void addToTranslate(OutputStreamWriter writer, String suffix, String capFileName, String dirName, String fileName) throws IOException {
		writer.write("\t\t[Test]\n");
		writer.write("\t\tpublic void test");
		writer.write(capFileName);
		writer.write("()\n");
		writer.write("\t\t{\n");
		writer.write("\t\t\tcompareResource");
		writer.write(suffix);
		writer.write("(\"");
		writer.write(dirName);
		writer.write("/");
		writer.write(fileName);
		writer.write("\");\n");
		writer.write("\t\t}\n");
		writer.write("\n");
	}

	private void endTranslate(OutputStreamWriter writer) throws IOException {
		writer.write("\t}\n");
		writer.write("}\n");
		writer.write("\n");
	}
	


	@Override
	protected void addToRuntimeE(File subDir, String fileName, Options options) throws Exception {
		if(runtimeE==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/runtime/e/Test" + capDirName + ".cs";
			runtimeE = mkfile(testFilePath);
			beginRuntime(runtimeE, capDirName, "E");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToRuntime(runtimeE, capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToRuntimeO(File subDir, String fileName, Options options) throws IOException {
		if(runtimeO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/runtime/o/Test" + capDirName + ".cs";
			runtimeO = mkfile(testFilePath);
			beginRuntime(runtimeO, capDirName, "O");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToRuntime(runtimeO, capFileName, subDir.getName(), fileName);
	}

	private void addToRuntime(OutputStreamWriter writer, String capFileName, String dirName, String fileName) throws IOException {
		writer.write("\t\t[Test]\n");
		writer.write("\t\tpublic void test");
		writer.write(capFileName);
		writer.write("()\n");
		writer.write("\t\t{\n");
		writer.write("\t\t\tCheckOutput(\"");
		writer.write(dirName);
		writer.write("/");
		writer.write(fileName);
		writer.write("\");\n");
		writer.write("\t\t}\n");
		writer.write("\n");
	}

	@Override
	protected void addToRuntimeM(File subDir, String fileName, Options options) throws IOException {
		if(runtimeM==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/runtime/m/Test" + capDirName + ".cs";
			runtimeM = mkfile(testFilePath);
			beginRuntime(runtimeM, capDirName, "M");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToRuntime(runtimeM, capFileName, subDir.getName(), fileName);
	}

	private void beginRuntime(OutputStreamWriter writer, String dirName, String dialect) throws IOException {
		writer.write("using NUnit.Framework;\n");
		writer.write("using prompto.parser;\n");
		writer.write("using prompto.utils;\n");
		writer.write("\n");
		writer.write("namespace prompto.runtime.");
		writer.write(dialect.toLowerCase());
		writer.write("\n");
		writer.write("{\n");
		writer.write("\n");
		writer.write("\t[TestFixture]\n");
		writer.write("\tpublic class Test");
		writer.write(dirName);
		writer.write(" : Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest\n");
		writer.write("\t{\n");
		writer.write("\n");
		writer.write("\t\t[SetUp]\n");
		writer.write("\t\tpublic void before()\n");
		writer.write("\t\t{\n");
		writer.write("\t\t\tOut.init();\n");
		writer.write("\t\t}\n");
		writer.write("\n");
		writer.write("\t\t[TearDown]\n");
		writer.write("\t\tpublic void after()\n");
		writer.write("\t\t{\n");
		writer.write("\t\t\tOut.restore();\n");
		writer.write("\t\t}\n");
		writer.write("\n");
	}

	private void endRuntime(OutputStreamWriter writer) throws IOException {
		writer.write("\t}\n");
		writer.write("}\n");
		writer.write("\n");
	}
	
	@Override
	protected void addToLibraryE(File subDir, String fileName, Options options) throws Exception {
		if(libraryE==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/library/e/Test" + capDirName + ".cs";
			libraryE = mkfile(testFilePath);
			beginLibrary(libraryE, capDirName, "E");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToLibrary(libraryE, capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToLibraryO(File subDir, String fileName, Options options) throws IOException {
		if(libraryO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/library/o/Test" + capDirName + ".cs";
			libraryO = mkfile(testFilePath);
			beginLibrary(libraryO, capDirName, "O");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToLibrary(libraryO, capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToLibraryM(File subDir, String fileName, Options options) throws IOException {
		if(libraryM==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = ROOT + "prompto/library/m/Test" + capDirName + ".cs";
			libraryM = mkfile(testFilePath);
			beginLibrary(libraryM, capDirName, "M");
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToLibrary(libraryM, capFileName, subDir.getName(), fileName);
	}

	private void beginLibrary(OutputStreamWriter writer, String dirName, String dialect) throws IOException {
		writer.write("using NUnit.Framework;\n");
		writer.write("using prompto.parser;\n");
		writer.write("using prompto.utils;\n");
		writer.write("using prompto.runtime;\n");
		writer.write("\n");
		writer.write("namespace prompto.library.");
		writer.write(dialect.toLowerCase());
		writer.write("\n");
		writer.write("{\n");
		writer.write("\n");
		writer.write("\t[TestFixture]\n");
		writer.write("\tpublic class Test");
		writer.write(dirName);
		writer.write(" : Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest\n");
		writer.write("\t{\n");
		writer.write("\n");
		writer.write("\t\t[SetUp]\n");
		writer.write("\t\tpublic void before()\n");
		writer.write("\t\t{\n");
		writer.write("\t\t\tLoader.Load ();\n");
		writer.write("\t\t\tOut.init();\n");
		if(dependencies!=null) {
			writer.write("\t\t\tcoreContext = null;\n");
			for(String s : dependencies) {
				writer.write("\t\t\tLoadDependency(\"");
				writer.write(s);
				writer.write("\");\n");
			}
		}
		writer.write("\t\t}\n");
		writer.write("\n");
		writer.write("\t\t[TearDown]\n");
		writer.write("\t\tpublic void after()\n");
		writer.write("\t\t{\n");
		writer.write("\t\t\tOut.restore();\n");
		writer.write("\t\t}\n");
		writer.write("\n");
	}

	private void addToLibrary(OutputStreamWriter writer, String capFileName, String dirName, String fileName) throws IOException {
		writer.write("\t\t[Test]\n");
		writer.write("\t\tpublic void test");
		writer.write(capFileName);
		writer.write("()\n");
		writer.write("\t\t{\n");
		writer.write("\t\t\tCheckTests(\"");
		writer.write(dirName);
		writer.write("/");
		writer.write(fileName);
		writer.write("\");\n");
		writer.write("\t\t}\n");
		writer.write("\n");
	}

	private void endLibrary(OutputStreamWriter writer) throws IOException {
		writer.write("\t}\n");
		writer.write("}\n");
		writer.write("\n");
	}
	
}
