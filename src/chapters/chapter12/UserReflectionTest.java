package chapters.chapter12;

import chapters.chapter12.anotation.FirstAnotation;

import java.lang.reflect.Method;

public class UserReflectionTest {

    public static void main(String[] args) {

        User user = new User("poxos", "poxosyan", "poxos@gmail.com", Language.ENG);
//        Class<? extends User> aClass = user.getClass();
        Method[] declaredMethods = User.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(FirstAnotation.class)){
                System.out.println(declaredMethod);
            }
        }
    }

}
