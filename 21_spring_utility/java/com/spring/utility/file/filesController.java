package com.spring.utility.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
/*
@Controller
@RequestMapping("/file")
public class filesController {

	private final String FILE_REPO_PATH = "C:\\spring_file_test\\";
	
	@GetMapping("/filemain")
	public String filemain() {
		return "file/filemain";
		
	}
/*	
/*	@PostMapping("/upload")
	@ResponseBody
	public String upload(MultipartHttpServletRequest multipartRequest) throws IllegalStateException, IOException {
		
	 	Iterator<String> fileList =  multipartRequest.getFileNames();
	 	
	 	while (fileList.hasNext()) {
	 		
	 		MultipartFile uploadFile = multipartRequest.getFile(fileList.next());
	 		
	 		if (!uploadFile.getOriginalFilename().isEmpty()) {
				
	 			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	 			String uploadDate = sdf.format(new Date());
	 			
	 			UUID uuid = UUID.randomUUID();
	 			
	 			String fileName = uploadDate +"_"+ uuid +"_"+ uploadFile.getOriginalFilename();
	 			
	 			File file = new File(FILE_REPO_PATH + fileName);
	 			uploadFile.transferTo(file);
			}
	 	}
	 	String result= "<script>";
		result += "alert('success');";
	    result += "location.href = 'main'";
	    result +="</script>";
	    
		return result;
		
		
		
		
	}

}
*/