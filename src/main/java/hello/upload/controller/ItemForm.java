package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    //MultipartFile은 @ModelAttribute에서 사용할 수 있다.
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;
}
