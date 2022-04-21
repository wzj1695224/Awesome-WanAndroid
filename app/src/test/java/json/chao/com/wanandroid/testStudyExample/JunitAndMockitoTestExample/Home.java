package json.chao.com.wanandroid.testStudyExample.JunitAndMockitoTestExample;


public class Home {

    private Person mPerson;

    public Home(Person person) {
        mPerson = person;
    }

    public int getAge(){
        return mPerson.getAge();
    }
}