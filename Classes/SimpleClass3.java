/**
 * 3. Создайте класс с именем Student, содержащий поля:
 * фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из
 * десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих
 * оценки, равные только 9 или 10.
 */

class Student {
    private String surname;
    private String initials;
    private int group;
    private byte[] progress;

    public void print() {
        for (int i = 0; i < this.progress.length; i++) {
            if (this.progress[i] < 9)
                break;
            if (i == this.progress.length - 1) {
                System.out.println(this.surname + " " + this.group);
            }
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setProgress(byte[] progress) {
        if (progress.length < 5)
            this.progress = progress;
    }

    public Student(String surname, String initials,
                   int group,
                   byte[] progress) {
        this.surname = surname;
        this.initials = initials;
        this.group = group;
        this.progress = progress;
    }
}

public class SimpleClass3 {
    public static void main(String[] args) {
        Student student1 = new Student("Johnson", "M.B.", 10701220, new byte[]{9, 9, 10, 9, 10});
        Student student2 = new Student("Smith", "M.M.", 11401120, new byte[]{8, 9, 10, 9, 10});
        Student student3 = new Student("Lennon", "J.W.", 10601120, new byte[]{9, 9, 9, 9, 9});
        Student student4 = new Student("Williams", "B.S.", 11401119, new byte[]{9, 9, 10, 9, 10});
        Student student5 = new Student("Brown", "C.F.", 10501218, new byte[]{9, 9, 10, 9, 10});
        Student student6 = new Student("Rodriguez", "S.A.", 10801219, new byte[]{9, 9, 10, 9, 10});
        Student student7 = new Student("Davis", "J.F.", 10702220, new byte[]{9, 9, 6, 9, 10});
        Student student8 = new Student("Lopez", "A.B.", 10301218, new byte[]{8, 5, 10, 6, 10});
        Student student9 = new Student("Taylor", "R.W.", 10701121, new byte[]{9, 9, 9, 9, 10});
        Student student10 = new Student("Moore", "F.F.", 10501120, new byte[]{9, 9, 7, 9, 10});
        Student[] students = new Student[]{student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        for (Student student : students) {
            student.print();
        }
    }
}
