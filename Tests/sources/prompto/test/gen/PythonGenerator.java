package prompto.test.gen;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public abstract class PythonGenerator extends Generator {
	
	protected abstract String getCoreRoot();
	protected abstract String getLibraryRoot();

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
			String testFilePath = getCoreRoot() + "prompto/translate/eoe/Test" + capDirName + ".py";
			translateEOE = mkfile(testFilePath);
			beginTranslate(translateEOE, "E", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToTranslate(translateEOE, "EOE", capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToTranslateEME(File subDir, String fileName) throws IOException {
		if(translateEME==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getCoreRoot() + "prompto/translate/eme/Test" + capDirName + ".py";
			translateEME = mkfile(testFilePath);
			beginTranslate(translateEME, "E", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToTranslate(translateEME, "EME", capFileName, subDir.getName(), fileName);
	}
	
	@Override
	protected void addToTranslateOEO(File subDir, String fileName) throws IOException {
		if(translateOEO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getCoreRoot() + "prompto/translate/oeo/Test" + capDirName + ".py";
			translateOEO = mkfile(testFilePath);
			beginTranslate(translateOEO, "O", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToTranslate(translateOEO, "OEO", capFileName, subDir.getName(), fileName);
	}
	
	@Override
	protected void addToTranslateOMO(File subDir, String fileName) throws IOException {
		if(translateOMO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getCoreRoot() + "prompto/translate/omo/Test" + capDirName + ".py";
			translateOMO = mkfile(testFilePath);
			beginTranslate(translateOMO, "O", capDirName);
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

	private void addToTranslate(OutputStreamWriter writer, String suffix, String capFileName, String dirName, String fileName) throws IOException {
		writer.write("    def test");
		writer.write(capFileName);
		writer.write("(self):\n");
		writer.write("        self.compareResource");
		writer.write(suffix);
		writer.write("(\"");
		writer.write(dirName);
		writer.write("/");
		writer.write(fileName);
		writer.write("\")\n");
		writer.write("\n");
	}

	private void beginTranslate(OutputStreamWriter writer, String dialect, String dirName) throws IOException {
		writer.write("from prompto.parser.");
		writer.write(dialect.toLowerCase());
		writer.write(".Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest import Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest\n");
		writer.write("\n");
		writer.write("class Test");
		writer.write(dirName);
		writer.write("(Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest):\n");
		writer.write("    \n");
		writer.write("    def setUp(self):\n");
		writer.write("        super(type(self), self).setUp()\n");
		writer.write("    \n");
	}

	private void endTranslate(OutputStreamWriter writer) throws IOException {
		writer.write("\n");
	}
	

	@Override
	protected void addToRuntimeE(File subDir, String fileName, Options options) throws Exception {
		if(runtimeE==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getCoreRoot() + "prompto/runtime/e/Test" + capDirName + ".py";
			runtimeE = mkfile(testFilePath);
			beginRuntime(runtimeE, "E", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToRuntime(runtimeE, capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToRuntimeO(File subDir, String fileName, Options options) throws IOException {
		if(runtimeO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getCoreRoot() + "prompto/runtime/o/Test" + capDirName + ".py";
			runtimeO = mkfile(testFilePath);
			beginRuntime(runtimeO, "O", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToRuntime(runtimeO, capFileName, subDir.getName(), fileName);
	}


	@Override
	protected void addToRuntimeM(File subDir, String fileName, Options options) throws IOException {
		if(runtimeM==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getCoreRoot() + "prompto/runtime/m/Test" + capDirName + ".py";
			runtimeM = mkfile(testFilePath);
			beginRuntime(runtimeM, "M", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToRuntime(runtimeM, capFileName, subDir.getName(), fileName);
	}
	
	
	private void addToRuntime(OutputStreamWriter writer, String capFileName, String dirName, String fileName) throws IOException {
		writer.write("    def test");
		writer.write(capFileName);
		writer.write("(self):\n");
		writer.write("        self.checkOutput(\"");
		writer.write(dirName);
		writer.write("/");
		writer.write(fileName);
		writer.write("\")\n");
		writer.write("\n");
	}

	private void beginRuntime(OutputStreamWriter writer, String dialect, String dirName) throws IOException {
		writer.write("from prompto.parser.");
		writer.write(dialect.toLowerCase());
		writer.write(".Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest import Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest\n");
		writer.write("from prompto.runtime.utils.Out import Out\n");
		writer.write("\n");
		writer.write("class Test");
		writer.write(dirName);
		writer.write("(Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest):\n");
		writer.write("    \n");
		writer.write("    def setUp(self):\n");
		writer.write("        super(type(self), self).setUp()\n");
		writer.write("        Out.init()\n");
		writer.write("    \n");
		writer.write("    def tearDown(self):\n");
		writer.write("        Out.restore()\n");
		writer.write("\n");
	}

	private void endRuntime(OutputStreamWriter writer) throws IOException {
		writer.write("\n");
	}
	

	@Override
	protected void addToLibraryE(File subDir, String fileName, Options options) throws Exception {
		if(libraryE==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getLibraryRoot() + "e/Test" + capDirName + ".py";
			libraryE = mkfile(testFilePath);
			beginLibrary(libraryE, "E", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToLibrary(libraryE, capFileName, subDir.getName(), fileName);
	}

	@Override
	protected void addToLibraryO(File subDir, String fileName, Options options) throws IOException {
		if(libraryO==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getLibraryRoot() + "o/Test" + capDirName + ".py";
			libraryO = mkfile(testFilePath);
			beginLibrary(libraryO, "O", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToLibrary(libraryO, capFileName, subDir.getName(), fileName);
	}


	@Override
	protected void addToLibraryM(File subDir, String fileName, Options options) throws IOException {
		if(libraryM==null) {
			String capDirName = capitalize(subDir.getName());
			String testFilePath = getLibraryRoot() + "m/Test" + capDirName + ".py";
			libraryM = mkfile(testFilePath);
			beginLibrary(libraryM, "M", capDirName);
		}
		String capFileName = capitalize(fileName.substring(0, fileName.lastIndexOf('.')));
		capFileName = capFileName.replaceAll("-", "_");
		addToLibrary(libraryM, capFileName, subDir.getName(), fileName);
	}
	
	
	private void beginLibrary(OutputStreamWriter writer, String dialect, String dirName) throws IOException {
		writer.write("from prompto.parser.");
		writer.write(dialect.toLowerCase());
		writer.write(".Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest import Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest\n");
		writer.write("from prompto.runtime.utils.Out import Out\n");
		writer.write("\n");
		writer.write("class Test");
		writer.write(dirName);
		writer.write("(Base");
		writer.write(dialect.toUpperCase());
		writer.write("ParserTest):\n");
		writer.write("    \n");
		writer.write("    def setUp(self):\n");
		writer.write("        super(type(self), self).setUp()\n");
		writer.write("        Out.init()\n");
		if(dependencies!=null) {
			writer.write("        self.coreContext = None\n");
			for(String s : dependencies) {
				writer.write("        self.loadDependency(\"");
				writer.write(s);
				writer.write("\")\n");
			}
		}
		writer.write("    \n");
		writer.write("    def tearDown(self):\n");
		writer.write("        Out.restore()\n");
		writer.write("\n");
	}
	
	private void addToLibrary(OutputStreamWriter writer, String capFileName, String dirName, String fileName) throws IOException {
		writer.write("    def test");
		writer.write(capFileName);
		writer.write("(self):\n");
		writer.write("        self.runTests(\"");
		writer.write(dirName);
		writer.write("/");
		writer.write(fileName);
		writer.write("\")\n");
		writer.write("\n");
	}


	private void endLibrary(OutputStreamWriter writer) throws IOException {
		writer.write("\n");
	}
	

	
}

