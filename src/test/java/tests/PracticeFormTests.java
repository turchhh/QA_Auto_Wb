package tests;

import dto.Student;
import enums.Gender;
import enums.Hobbies;
import enums.StateCity;
import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends AppManager {
    @Test(groups = "smoke")
    public void studentRegFormPositiveTest() {
        List<Hobbies> hobbies = new ArrayList<>();
        hobbies.add(Hobbies.MUSIC);
        hobbies.add(Hobbies.SPORTS);
        Student student = new Student("Vasya", "Vasilev", "vasyavasilev@gmail.com",
                Gender.MALE, "0123456789", "23 Mar 2013",
                "Maths,Physics,Chemistry", hobbies,
                "", "avenue 12", StateCity.RAJASTHAN.getState(),
                StateCity.RAJASTHAN.getCity()[1]);
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
        Assert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessage());
    }

    @Test
    public void studentRegFormPositiveTestSoftAssert() {
        List<Hobbies> hobbies = new ArrayList<>();
        hobbies.add(Hobbies.READING);
        hobbies.add(Hobbies.SPORTS);
        Student student = new Student("Monkey","Shoulders","ya@ya.com", Gender.OTHER,"0503969396","03 Mar 1993",
                "Maths,Physics,Chemistry",hobbies,"","Raanana,Israel", StateCity.RAJASTHAN.getState(), StateCity.RAJASTHAN.getCity()[1]);
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
        Assert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessageNegative());
        System.out.println("Test failed!");
        Assert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessage());
    }


}