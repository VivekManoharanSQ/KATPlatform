import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory



















public class WebUIHelper {

	WebDriver driver = DriverFactory.getWebDriver();

	@Keyword
	def int getElementCount(TestObject object) {
		String path = object.getSelectorCollection().get(SelectorMethod.XPATH)
		return driver.findElements(By.xpath(path)).size()
	}
}
