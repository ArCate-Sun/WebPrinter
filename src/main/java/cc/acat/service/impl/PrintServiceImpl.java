package cc.acat.service.impl;

import cc.acat.service.interf.PrintService;
import cc.acat.util.LoadConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by ACat on 2017/2/6.
 * ACat i lele.
 */
@Service
@Transactional
public class PrintServiceImpl implements PrintService {

	@Override
	public String saveFileAndPrint(MultipartFile file) throws Exception {

		String fileName = file.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf('.'));
		// 生成存放文件名
		String parentDirPath = LoadConfig.getFileDirectoryPath();
		fileName = "prt" + "_" + System.currentTimeMillis() + suffix;
		File newFile = new File(parentDirPath + fileName);

		// 如若头像图片存放地址的父目录不存在, 新建父目录
		File parentDir = new File(parentDirPath);
		if (!parentDir.exists()) {
			parentDir.mkdirs();
		}

		file.transferTo(newFile);
		return newFile.getAbsolutePath();
	}

	@Override
	public void print(String filePath, String password, int copies) throws IOException {

		String cmd = "write " + "/p \"" + filePath + "\"";
		while (copies-- > 0) {
			Runtime.getRuntime().exec(cmd);
		}

	}

	@Override
	public void print(String filePath, String password, int copies, String range) throws IOException {

		String cmd = LoadConfig.getSumatraPDF() + " -print-to-default -print-settings \"x, " + range + "\" \"" + filePath + "\"";
		while (copies-- > 0) {
			Runtime.getRuntime().exec(cmd);
		}
	}

}
