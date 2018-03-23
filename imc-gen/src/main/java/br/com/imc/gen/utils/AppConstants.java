package br.com.imc.gen.utils;

public final class AppConstants {

	/** Opposite of {@link #FAILS}. */
	public static final boolean PASSES = true;
	/** Opposite of {@link #PASSES}. */
	public static final boolean FAILS = false;

	/** Opposite of {@link #FAILURE}. */
	public static final boolean SUCCESS = true;
	/** Opposite of {@link #SUCCESS}. */
	public static final boolean FAILURE = false;

	/**
	 * Useful for {@link String} operations, which return an index of <tt>-1</tt>
	 * when an item is not found.
	 */
	public static final int NOT_FOUND = -1;

	/** System property - <tt>line.separator</tt> */
	public static final String NEW_LINE = System.getProperty("line.separator");
	/** System property - <tt>file.separator</tt> */
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	/** System property - <tt>path.separator</tt> */
	public static final String PATH_SEPARATOR = System.getProperty("path.separator");
	/** System property - <tt>user.dir</tt> */
	public static final String USER_DIR = System.getProperty("user.dir");

	public static final String EMPTY_STRING = "";
	public static final String SPACE = " ";
	public static final String TAB = "\t";
	public static final String SINGLE_QUOTE = "'";
	public static final String PERIOD = ".";
	public static final String DOUBLE_QUOTE = "\"";
	 
	public static final String SRC_JAVA = "src" + AppConstants.FILE_SEPARATOR + "main" + AppConstants.FILE_SEPARATOR + "java" + AppConstants.FILE_SEPARATOR;
	public static final String SRC_RESOURCES = "src" + AppConstants.FILE_SEPARATOR + "main" + AppConstants.FILE_SEPARATOR + "resources" + AppConstants.FILE_SEPARATOR;
	public static final String SRC_TEST = "src" + AppConstants.FILE_SEPARATOR + "test" + AppConstants.FILE_SEPARATOR + "java" + AppConstants.FILE_SEPARATOR;

	public static final String POM_XML = "pom.xml";
	public static final String JENKINS_FILE = "Jenkinsfile";
	// PRIVATE // 
	/**
	 * The caller references the constants using <tt>Consts.EMPTY_STRING</tt>, and
	 * so on. Thus, the caller should be prevented from constructing objects of this
	 * class, by declaring this private constructor.
	 */
	private AppConstants() {
		// this prevents even the native class from
		// calling this ctor as well :
		throw new AssertionError();
	}
}