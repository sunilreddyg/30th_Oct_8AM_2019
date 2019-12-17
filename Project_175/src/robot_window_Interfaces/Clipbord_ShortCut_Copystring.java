package robot_window_Interfaces;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Clipbord_ShortCut_Copystring {

	public static void main(String[] args) throws Exception 
	
	{
		
		//launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		String text="Primarily it is for automating web applications "
				+ "for testing purposes, but is certainly not limited "
				+ "to just that.";
		
		StringSelection Stext=new StringSelection(text);
		//get system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Selection string content to clipboard
		clipboard.setContents(Stext, Stext);
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);

		
		//Use Keyboard short Cntrl+V to copy text into Notepad interface
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
	
		//Press Control+S Shortcut
		robot.keyPress(KeyEvent.VK_S);
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		String path="C:\\Users\\Administrator\\git\\30th_Oct_8AM_2019\\Project_175\\src\\robot_window_Interfaces\\Demo.txt";
		//String selection for path
		StringSelection Spath=new StringSelection(path);
		clipboard.setContents(Spath, Spath);
		
		//Use Keyboard short Cntrl+V to copy text into Notepad interface
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
				
		
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		

	}

}
