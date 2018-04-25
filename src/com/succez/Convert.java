package com.succez;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Convert {

	
	public byte[] file2buf(File fobj)  
    {  
		FileInputStream fileInputStream=null;
		ByteArrayOutputStream bytear=null;
        byte[] buffer=null;  
        try  
        {    
            if (!fobj.exists())  
            {  
                System.out.println("文件不存在");  
                return null;  
            }  
            fileInputStream = new FileInputStream(fobj);  
            bytear = new ByteArrayOutputStream(1000);               
            byte[] b = new byte[1000];  
            int n;  
            while ((n = fileInputStream.read(b)) != -1)  
            {  
                bytear.write(b, 0, n);  
            }  
            buffer = bytear.toByteArray();  
        }  
        catch (FileNotFoundException e)  
        {  
            e.printStackTrace();  
        }  
        catch (IOException e)  
        {  
            e.printStackTrace();  
        }
	finally{
        	 try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
             try {
				bytear.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
        } 
        return buffer;  
    }  
}
