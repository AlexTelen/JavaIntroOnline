/*
 * Задача 1.
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        // Создаем директорию, где будут храниться (распологаться) файлы
        Directory directory = new Directory("d:\\sdfgsdfg\\");

        // Создаем файл
        System.out.println("\n1. Создаем файл");
        TextFile textFile = TextFile.create("test.pdf", directory);
        System.out.println(textFile.name);

        // Создаем файл
        System.out.println("\n2. Создаем еще файл");
        TextFile textFileTest = TextFile.create("test2.doc", directory);
        textFileTest.add("1234567890-0987654321");
        System.out.println(textFileTest.name);

        //Показать список файлов в заданной директории
        System.out.println("\n3. Показываем содержимое directory");
        directory.getFiles().forEach(System.out::println);

        //Добавляем текст
        System.out.println("\n4. Добавляем текст: '12iofgejgpiojee059jbve09jv09jer90jbigt5rjh9gjidjg9tjgdfjifgdjiidf\njrgierrveibvjib'");
        textFile.add("12iofgejgpiojee059jbve09jv09jer90jbigt5rjh9gjidjg9tjgdfjifgdjiidf\njrgierrveibvjib");

        //Показываем содержимое
        System.out.println("\n5. Показываем содержимое");
        try {
            textFile.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Переименовываем файл
        System.out.println("\n6. Переименовываем файл");
        System.out.println("\nимя до переименовывания: " + textFile.name);

        System.out.println("\n7. Переименовываем файл на 'asdasdasd.34'");
        textFile.rename("asdasdasd.34");
        System.out.println("имя после переименовывания (не правильное расширение файла, имя не изменится): " + textFile.name);

        System.out.println("\n8. Переименовываем файл на 'asdasdasd.doc'");
        textFile.rename("asdasdasd.doc");
        System.out.println("имя после переименовывания: " + textFile.name);

        // Показываем содержимое
        System.out.println("\n9. Показываем содержимое");
        try {
            textFile.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // удаляем файл
        System.out.println("\n10. Удаляем файл - " + textFile.name);
        directory.deleteFile(textFile);

        System.out.println("\n11 Показываем содержимое directory");
        directory.getFiles().forEach(System.out::println);

        // Показываем содержимое
        System.out.println("\n12. Пробуем показываем содержимое удаленного файла");
        try {
            textFile.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
