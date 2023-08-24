import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory



public class SelectDropDownValue {

	@Keyword
	def selectValue(TestObject object,String value) {

		String path = object.getSelectorCollection().get(SelectorMethod.XPATH)
		print path
		List<WebElement> optionsList = DriverFactory.getWebDriver().findElements(By.xpath(path))
		optionsList
				.stream()
				.filter({options->options.getAttribute('title').equalsIgnoreCase(value)})
				.findFirst().get().click()
	}
}
