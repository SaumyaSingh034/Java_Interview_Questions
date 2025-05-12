package test;

import java.util.HashMap;

public class Test {
    public static void main(String[] args){
        String str = "Saumya123";
        countLettersandIntegers(str);
    }

    private static void countLettersandIntegers(String str) {
        int countLetter = 0;
        int countDigits = 0;

        for(char c : str.toCharArray()){
            if(Character.isDigit(c))
                countDigits++;
            else if(Character.isLetter(c))
                countLetter++;
        }

        System.out.println("Letters Count : "+countLetter+" Digits Count : "+countDigits);
    }

   // WebDriver driver;

    //driver = new ChromeDriver();
    //driver.get("");
   // Map<String, String> querParms = new HashMap<>()
    /*
    RestAssured.baseUri = "";
    Response response = given().header("Authetization","").contentType(ContentType.JSON).body("").queryParams(querParms)
    whrn().post("basePath")
    then().statusCode(201).extract().response();
    response.jsonPath.as(User.class)


    String message = response.jsonPath().get("mesaage");
    Assert
     */
}
