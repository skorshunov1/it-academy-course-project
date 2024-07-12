# Author - Stanislav Korshunov 

## website: https://www.gornation.com/ - clothing and equipment for сalisthenics. UITest.
## website: https://www.onliner.by/ - commercial resource of the Limited Liability Company "Onliner". APITest.

### Project structure:
1. src/main/java/com.itacademy

2. src/main/java/com.itacademy/listeners - TestListeners created for listeners with LOGGER

3. src/main/java/com.itacademy/pages - pages for web tests(LoginPage,MainPage,ProductPage,SearchPage) 

4. src/main/java/com.itacademy/utils/ScreenshotUtils - for screenshots

5. src/main/java/com.itacademy/utils/RetryTest - runs again if the test fails the first time

6. src/main/java/com.itacademy/waiters/Waiters - to use explicit waits

7. src/main/resources/log4j2.xml - configuration file for loggers

8. src/test/java/com.itacademy

9. src/test/java/com.itacademy/tests/BaseTest - created for Before- and AfterMethod for UI tests

10. src/test/java/com.itacademy/tests/TestAPI - created for API tests
 
11. src/test/java/com.itacademy/tests/TestUI - created for UI tests

12. src/test/resources/json/body.json -  to use parameters in API test

13. src/test/resources/testng - to create testngAPI.xml, testngUI.xml files tests separately

14. src/test/resources/allure.properties - to use Allure report
