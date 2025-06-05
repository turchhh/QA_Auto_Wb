package tests;

import dto.Student;
import enums.Gender;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {
    @Test
    public void studentRegFormPositiveTest() {
        Student student = new Student("Monkey","Shoulders","ya@ya.com", Gender.OTHER,"0503969396","03 Mar 1993",
                "Maths,Physics,Chemistry","Reading","","Raanana,Israel","NCR","Delhi");
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
    }

}