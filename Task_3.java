// 3. Дан следующий код, исправьте его там, где требуется (задание 3 
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

// Оригинал задания:
// public static void main(String[] args) throws Exception {
//     try {
//         int a = 90;
//         int b = 3;
//         System.out.println(a / b);
//         printSum(23, 234);
//         int[] abc = { 1, 2 };
//         abc[3] = 9;
//     } catch (Throwable ex) {
//         System.out.println("Что-то пошло не так...");
//     } catch (NullPointerException ex) {
//         System.out.println("Указатель не может указывать на null!");
//     } catch (IndexOutOfBoundsException ex) {
//         System.out.println("Массив выходит за пределы своего размера!");
//     }
//  }
//  public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//     System.out.println(a + b);
//  }
 


public class Task_3 {
    public static void main(String[] args) throws Throwable {
        try {
            int a = 90;
            int b = 3;
            //int b = 0;
            System.out.println(a / b);
            printSum(23, 234);
            //int[] abc = { 1, 2 };
            //int[] abc = null;
            int[] abc = { 1, 2, 3, 4};  // Вариант массива без ошибок
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0 не допустимо!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {    // Throwable - включает в себя все ислючения
            // поэтому должно идти после конкретных исключений
            System.out.println("Что-то пошло не так...");
        }
    }

    // throws FileNotFoundException - здесь нет работы с файлами, это лишнее
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
     
    
}
