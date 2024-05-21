package com.omrbranch.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
public static WebDriver driver;
	
	
	//1.Enter url
	public static void getUrl(String url) {
			driver.get(url);
		}
	//2.Maximize Window
	public static void maximunwindow() {
			driver.manage().window().maximize();
        }
		//3.Insert value in TextBox
	public void sendkey (WebElement element,String data) {
	     element.sendKeys(data);
       }
		//4.Click Button
	public void click(WebElement element) {
		element.click();
	}
	//5.Click Ok In alert
	public void okInAlert() {
		Alert al = driver.switchTo().alert();
         al.accept();
	}
	//6.Cancel In alert
	public void cancelInAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	//7.Get Text from WebPage
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	//8.Inserted value from Textbox
	public String valueFromTextBox(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}
	//9.close all window
	public void closeAllWindow() {
	driver.quit();
	}
	//10.close current Window
	public void currentwindow() {
		driver.close();
	}
	//11.Get the Tittle
	public String getTittle() {
		String title = driver.getTitle();
		return title;
	}
	//12.Get the entered URL
	public String getcurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	//13.Select Dropdown action by text
	public void dropdownActionBytext(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	//14.Select Dropdown action by AttributeVale
	public void dropdownActionByAttributeValue(WebElement element,String value) {
		Select select = new Select (element);
		select.selectByValue(value);
	}
	//15.Select Dropdown action By Index
	public void dropdownActionByIndex(WebElement element ,int num) {
		Select select = new Select(element);
           select.selectByIndex(num);
	}
    //16.insert value in textBox by JS
	public void InsertValueInTextBoxByJS(WebElement element,String data) {
		JavascriptExecutor exeutor = (JavascriptExecutor) driver;
		exeutor.executeScript("aruguments[0].setAttribute('value','"+ data +"')" ,element);
	}
	//17.click button by JS
	public void clickButtonByJS(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("aruguments[0].click", element);
	}
	//18.Launch the Chrome Browser
	public static void launchChromeBrowser(String browserType) {
		switch (browserType) {
		case "googleChrome":
			driver = new ChromeDriver();
			break;
		case "internetExplore":
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
	}
	//19.Switch to ChildWIndow
	public void SwitchToChild() {
	}
	//20.Switch to FramesByIndex
	public void SwitchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	//21.Switch to FrameById
	public void SwitchToFrameID(WebElement frameid) {
		driver.switchTo().frame(frameid);
	}
	//22.Find the Locator by Id
	public WebElement findLocatorByid(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
	//23.Find the Locator by name
	public WebElement findLocatorByname(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}
	//24.Find the Locator by className
	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}
	//25.Find the Locator By Xpath
	public WebElement findLocatorByxpath(String attributeValue) {
	WebElement element = driver.findElement(By.xpath(attributeValue));
	return element;
	}
	//26.Get all option from dropdown as text
	public void allOptionFromDropdownAsText() {
	}
	//27.Get all option from dropdown as attributeValue
	public void allOptionFromDropdownAsAttributeValue() {
	}
	//28.Get the First Selected Options text in dropdown
	public void firstSelectoptionTextindropdown(WebElement element,String text) {
		Select select = new Select (element);
	     select.getFirstSelectedOption();
	}
	//29.Verify in dropdown is multiSelected option
	public boolean isMultiSelectedOption(WebElement element) {
		Select select = new Select(element);
         boolean multiple = select.isMultiple();
		return multiple;
	}
	//30.Implicit Wait
	public static void implicitwait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}
	//31.Explicit Wait
	public void ExplicitWait(WebElement element,int secs) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(secs));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}
	//32.Fluent Wait
	public void FluentWait() {
	}
	//33.Verify is isDisplayed
	public boolean IsDisplayed(WebElement element) {
    boolean displayed = element.isDisplayed();
	return displayed;
	}
	//34.Verify is isEnabled
	public boolean IsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	//35.Verify is isSelcted
	public boolean IsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	//36.DeSelected By index
	public void deslectedByIndex(WebElement element,int index) {
	Select select = new Select(element);
	select.deselectByIndex(index);
	}
	//37.DeSelected By Attribute
	public void deSelectedByAttribute(WebElement element , String value) {
		Select select = new Select (element);
		select.deselectByValue(value);
	}
	//38.DeSelected By Text
	public void deSelectedByText(WebElement element,String value) {
		Select select = new Select(element);
         select.deselectByVisibleText(value);
	}
	//39.Deselect All
	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	//40.Get the Parent Window
	public void parentWindow() {
		driver.getWindowHandle();
	}
	//41.Get all windows
	public void AllWindows() {
		driver.getWindowHandles();
	}
	//42.Clear TextBox
	public void clearTextBox(WebElement element) {
		element.clear();
	}
	//43.TakeScreenShot
	public void takeScreenShot(String pathname) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File desfile = new File(pathname);
	}
	//44.TakeScreenshot For Element
	public void takeScreenshotForElement(WebElement element) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = element.getScreenshotAs(OutputType.FILE);
	}
	//45.MOuseOver Action for single option
	public void mouseoverAction(WebElement element) {
		Actions action = new Actions(driver);
         action.moveToElement(element).perform();
	}
	//46.Drag and Drop
	public void dragAndDrop(WebElement element1,WebElement element2) {
		Actions action = new Actions(driver);
           action.dragAndDrop(element1, element2).perform();
	}
	//47.Right click
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
        action.contextClick(element).perform();
	}
	//48.Double Click
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
          action.doubleClick(element).perform();
	}
	//49.Insert Value In textBox & enter
	public void valueInTextBoxandEnter(WebElement element,String data) {
		element.sendKeys(data,Keys.ENTER);
	}
	//50.Refresh Page
	public void refreshPage() {
//50.1
		Navigation navigate = driver.navigate();
            navigate.refresh();
//50.2
            driver.navigate().refresh();
	}
	//51.Read Value From Cell as String
	public String getCellData(String SheetName, int rownum,int cellnum) throws IOException {
		String res=null;
		File file = new File("C:\\Users\\Hi\\eclipse-workspace\\BaseClass1\\src\\excel\\Grocery.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInput);
            Sheet sheet = workbook.getSheet(SheetName);
            Row row = sheet.getRow(rownum);
            Cell cell = row.getCell(cellnum);
           CellType type = cell.getCellType();
           switch (type) {
           case STRING:
        	   res=cell.getStringCellValue();
        	   break;
           case NUMERIC:
        	   if (DateUtil.isCellDateFormatted(cell)){
        		   Date dateCellValue = cell.getDateCellValue();
        		   SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yy");
        		   res = dateformat.format(dateCellValue);
        	   }else {
        		   double value = cell.getNumericCellValue();
        		   long round = Math.round(value);
        		   if (value == round) {
					res = String.valueOf(round);
				}else {
					res = String.valueOf(value);
				}
        		   break;
        	   }
        	   default:
        		   break;
           }
		return res;
	}
	//52.Create cell and insert Value
	public void createcellandsetdata(String sheetname,int rownum,int cellnum,String data) throws IOException {
		File file = new File("C:\\Users\\Hi\\eclipse-workspace\\BaseClass1\\src\\excel\\Grocery.xlsx");
        FileInputStream fileinput = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileinput);
        Sheet sheet = workbook.getSheet(sheetname);
        Row row = sheet.getRow(rownum);
        Cell cell = row.createCell(cellnum);
        cell.setCellValue(data);
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        
	}
	//53.Get Project Path
	public String getprojectpath() {
		return System.getProperty("user.dir");
	}
	//54.Get Property file Value
	public String getpropertyfilevalue(String key) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileInputStream(getprojectpath()+"//config\\config.properties"));
		Object object = pro.get(key);
		String value = (String) object;
		return value;
		

	}
	

}


