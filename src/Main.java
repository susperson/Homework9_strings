public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1:");

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2
        System.out.println("Задание 2:");

        String fullNameInCaps = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameInCaps);

        //Задание 3
        System.out.println("Задание 3:");

        //с методами split и contains
        String[] fullNameSplitted = fullName.split(" ");
        for (int i = 0; i < fullNameSplitted.length; i++) {
            if (fullNameSplitted[i].contains("Ё")) {
                fullNameSplitted[i] = fullNameSplitted[i].replace("Ё", "Е");
            } else if (fullNameSplitted[i].contains("ё")) {
                fullNameSplitted[i] = fullNameSplitted[i].replace("ё", "е");
            }
        }
        String fixedFullName = fullNameSplitted[0] + ' ' + fullNameSplitted[1] + ' ' + fullNameSplitted[2];
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);

        //почему нельзя так?
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}