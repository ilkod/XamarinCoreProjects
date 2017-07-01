package Rada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Ілюша on 25.06.2017.
 */
public class Fraction {
    private String nameOfFraction;
    private ArrayList<Deputate> listOfDept;

    public Fraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
        this.listOfDept = new ArrayList();
    }

    public String getNameOfFraction() {
        return nameOfFraction;
    }

    public void setNameOfFraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    public void addDeputateToFraction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введiть вагу");
        int weightOfDept = sc.nextInt();

        System.out.println("Введіть ріст");
        int heightOfDept = sc.nextInt();

        System.out.println("Введіть ім’я депутата");
        String nameOfDept = sc.nextLine();

        System.out.println("Введіть прізвище депутата");
        String surnameOfDept = sc.nextLine();

        System.out.println("Введіть вік депутата");
        int ageOfDept = sc.nextInt();

        System.out.println("Чи бере депутат хабарі (true/false)");
        boolean isBribeTaker_ = sc.nextBoolean();

        Deputate dept = new Deputate(weightOfDept, heightOfDept, nameOfDept, surnameOfDept, ageOfDept, isBribeTaker_);
        listOfDept.add(dept);

        sc.close();
    }

    public void deleteDeptFromFraction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть прiзвище депутата, якого необхідно видалити з фракції");
        String surnForDel = sc.nextLine();

        for (Deputate dept : listOfDept) {
            if (dept.getSurname().equals(surnForDel)) {
                listOfDept.remove(dept);
            }
        }
        sc.close();
    }

    public void showBribeTakers() {
        for (Deputate dept : listOfDept) {
            if (dept.isBribeTaker() == true) {
                System.out.println(dept.getName().toString() + " " + dept.getSurname().toString());
            }
        }
    }

    public void showBiggestBrTaker() {
        int indexOfBribeTaker = 0;
        int maxValueOfBribe = listOfDept.get(0).getValueOfBribe();

       // Iterator<Deputate> iter = listOfDept.iterator();

//        while(iter.hasNext()){
//          maxValueOfBribe= iter.next().getValueOfBribe();
//          indexOfBribeTaker=listOfDept.indexOf(iter.next());
//          if(iter.next().getValueOfBribe()>maxValueOfBribe){
//              maxValueOfBribe= iter.next().getValueOfBribe();
//              indexOfBribeTaker=listOfDept.indexOf(iter.next());
//          }
//        }
//

        for (int i = 1; i < listOfDept.size(); i++) {
            if (listOfDept.get(i).getValueOfBribe() > maxValueOfBribe) {
                maxValueOfBribe = listOfDept.get(i).getValueOfBribe();
                indexOfBribeTaker = i;
            }
        }

        System.out.println("Найбільшим хабарником є: " + listOfDept.get(indexOfBribeTaker).getName() + " "
                + listOfDept.get(indexOfBribeTaker).getSurname() + ",з хабарем у розмірі: " +
                listOfDept.get(indexOfBribeTaker).getValueOfBribe() + " uah.");
    }

    public void showAllDeptsInFraction(){
        for(Deputate dept:listOfDept){
            System.out.println(dept.getName()+" " +dept.getSurname());
        }
    }

    public void clearFraction(){
        listOfDept.clear();
        System.out.println("Депутатів у данійфракції більше нема.");
    }

}
