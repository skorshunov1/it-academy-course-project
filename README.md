# Author - Stanislav Korshunov 

## website: https://www.gornation.com/ - clothing and equipment for сalisthenics. UITest.
## website: https://www.onliner.by/ - commercial resource of the Limited Liability Company "Onliner". APITest.

### Project structure:
1.src/main/java/com.itacademy

2.listeners - TestListeners created for listeners with LOGGER

3.pages - pages for web tests(LoginPage,MainPage,ProductPage,SearchPage) 

4.utils/ScreenshotUtils - for screenshots  

5.waiters - to use explicit waits

5.resources.log4j2.xml - configuration file for loggers

6.src/test/java/com.itacademy

7.tests.BaseTest - created for Before- and AfterMethod for UI tests

8.TestAPI - created for API tests
 
9.TestUI - created for UI tests

10.resources.json -  to use parameters in API test

11.resources.testng - to create testngAPI.xml, testngUI.xml files tests separately

12.resources.allure.properties - to use Allure report
