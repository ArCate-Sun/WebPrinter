package cc.acat.controller;

import cc.acat.service.interf.PrintService;
import cc.acat.util.ReturnJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;

@Controller
@RequestMapping
public class PrintController {

    @Resource
    private PrintService printService;

    @ResponseBody
    @RequestMapping(value = "print", method = RequestMethod.POST)
    public ReturnJson printFile(
            @RequestPart("file") MultipartFile file,
            @RequestParam(value = "password", defaultValue = "") String password,
            @RequestParam(value = "copies", defaultValue = "1") Integer copies,
            @RequestParam(value = "range", defaultValue = "") String range
    ) {

        try {


            String fileName = file.getOriginalFilename();
            String suffix = fileName.substring(fileName.lastIndexOf('.')).trim().toLowerCase();

            // 将待打印文件储存至本地
            String filePath = this.printService.saveFileAndPrint(file);

            // 调取命令行, 打印
            if (suffix.equals(".pdf")) {
                this.printService.print(filePath, password, copies, range);
            } else {
                this.printService.print(filePath, password, copies);
            }

            return new ReturnJson();

        } catch (Exception e) {
            e.printStackTrace();
            return new ReturnJson(false, e.getMessage());
        }

    }

}
