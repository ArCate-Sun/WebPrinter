package cc.acat.service.interf;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

/**
 * Created by ACat on 2017/1/6.
 * ACat i lele.
 */
public interface PrintService {

	String saveFileAndPrint(MultipartFile file) throws Exception;
	void print(String filePath, String password, int copies) throws IOException;
	void print(String filePath, String password, int copies, String range) throws IOException;

}
