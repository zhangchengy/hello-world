package com.succez;

/*
 * 
 * 将文件内容转换成byte数组返回
 * 
 * 
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-4-25
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Convert {
	Logger logger;
	FileHandler fileHandler;
	 public Convert() throws SecurityException, IOException{
			logger = Logger.getLogger("testlogjava");
			fileHandler = new FileHandler("d:\\testlog.txt",true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
	 }
	
	public byte[] file2buf(File fobj) throws IOException  
    {  
		FileInputStream fileInputStream=null;
		ByteArrayOutputStream bytear=null;
        byte[] buffer=null;  
        try  
        {    
            if (!fobj.exists())  
            {  
                logger.log(Level.SEVERE,"文件不存在");
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
           logger.log(Level.SEVERE,e.getMessage());  
        }  
        catch (IOException e)  
        {  
        	logger.log(Level.SEVERE,e.getMessage());  
        }
        finally{
				fileInputStream.close();
				bytear.close();	
        } 
        return buffer;  
    }  
}