package com.vms.helloword.constroller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        System.out.println(photo.getOriginalFilename());//获取图片原始名称
        System.out.println(photo.getContentType());//获取文件类型
        String path=request.getServletContext().getRealPath("/upload/");//获取web服务器存放的路径/上传文件存放的路径
        System.out.println(path);
        saveFile(photo,path);
        return "上传成功";
    }

    private void saveFile(MultipartFile photo, String path) throws IOException {
        File dir=new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }
        File file=new File(path+photo.getOriginalFilename());
        photo.transferTo(file);
    }

}
