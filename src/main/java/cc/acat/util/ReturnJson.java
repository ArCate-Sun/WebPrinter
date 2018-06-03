package cc.acat.util;

/**
 * Created by ACat on 2017/1/8.
 * ACat i lele.
 */
public class ReturnJson extends ReturnMessage {

	// Fields
	private Object data;

	//<editor-fold desc="Constructors">

	/**
	 * 返回成功的构造器
	 */
	public ReturnJson() {
		super(true, null);
	}

	/**
	 * 返回失败和错误信息的构造器
	 *
	 * @param err_msg 错误信息
	 */
	public ReturnJson(String err_msg) {
		super(false, err_msg);
	}

	/**
	 * 仅返回成功失败以及错误信息的构造器
	 * @param result true 成功, false 失败
	 * @param err_msg 错误信息
	 */
	public ReturnJson(boolean result, String err_msg) {
		super(result, err_msg);
	}

	/**
	 * 返回成功失败, 错误信息及数据构造器
	 *
	 * @param result true 成功, false 失败
	 * @param err_msg 错误信息
	 * @param data 数据
	 */
	public ReturnJson(Boolean result, String err_msg, Object data) {
		super(result, err_msg);
		this.data = data;
	}

	public ReturnJson(ReturnMessage msg) {
		super(msg);
	}

	//</editor-fold>

	//<editor-fold desc="Setters and Getters">

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	//</editor-fold>

}
