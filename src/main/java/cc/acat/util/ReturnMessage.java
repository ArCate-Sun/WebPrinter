package cc.acat.util;

/**
 * Created by ACat on 2017/1/8.
 * ACat i lele.
 */
public class ReturnMessage {

	// Fields
	protected boolean result;
	protected String err_msg;

	public ReturnMessage(ReturnMessage msg) {
		this.result = msg.result;
		this.err_msg = msg.err_msg;
	}

	public ReturnMessage(Boolean result, String err_msg) {
		this.result = result;
		this.err_msg = err_msg;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

}
