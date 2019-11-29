package Pages;

import org.openqa.selenium.By;

public class HomePage {

    //BaseFunc vnutri class
    private BaseFunc baseFunc;

    private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");

    //Basefunc toljko vnutri metoda, nizhe idjot konstruktor. baseFunc vverhu i vnizu ne odno i tozhe
    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void openFirstArticle() {

        //Find element
        baseFunc.getElement(TITLE).click();


        //Click element


    }

}
