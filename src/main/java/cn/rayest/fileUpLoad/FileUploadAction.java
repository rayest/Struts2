package cn.rayest.fileUpLoad;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by Rayest on 2016/8/22 0022.
 */
public class FileUploadAction extends ActionSupport {
    private File file;
    private String fileName;
    private String ContentType;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("文件名：" + fileName);
        System.out.println("文件类型：" + ContentType);
        String filePath = "F:/" + fileName;
        File saveFile = new File(filePath);
        FileUtils.copyFile(file, saveFile);
        return SUCCESS;
    }
}
