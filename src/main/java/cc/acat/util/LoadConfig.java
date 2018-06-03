package cc.acat.util;

import java.util.ResourceBundle;

/**
 * 加载设置类
 *
 * Created by ACat on 2017/3/26.
 * ACat i lele.
 */
public class LoadConfig {

	private static final String FILE_DIR_PATH = "file_dir_path";
	private static final String SUMATRAPDF_PATH = "sumatraPDF_path";



	private static final ResourceBundle props = ResourceBundle.getBundle("config");

	private static String fileDirectoryPath;
	private static String sumatraPDF;

	static {
		fileDirectoryPath = getValueFromKey(FILE_DIR_PATH);
		sumatraPDF = getValueFromKey(SUMATRAPDF_PATH);
	}

	private static String getValueFromKey(String key) {
		String value = null;
		try {
			value = props.getString(key);
		} catch (Exception ignored) {}
		return value;
	}

	/**
	 * 获取文件存放地址
	 * @return
	 */
	public static String getFileDirectoryPath() {
		return fileDirectoryPath;
	}

	public static String getSumatraPDF() {
		return sumatraPDF;
	}
}
