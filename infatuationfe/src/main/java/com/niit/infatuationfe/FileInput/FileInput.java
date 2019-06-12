package com.niit.infatuationfe.FileInput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;




public class FileInput {

	public static void upload(String path, MultipartFile file, String fileName) {
		if (!file.isEmpty()) 
		{
			System.out.println("from ma= "+file+" path "+path);
			InputStream inputStream = null;
			OutputStream outputStream = null;
			if (file.getSize() > 0) 
			{
				try {
					inputStream = file.getInputStream();
					outputStream = new FileOutputStream(path+fileName);
					int readBytes = 0;
					byte[] buffer = new byte[1024];
					while ((readBytes = inputStream.read(buffer, 0, 1024)) != -1) {
						outputStream.write(buffer, 0, readBytes);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} 
				finally {
					try {
						outputStream.close();
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}



