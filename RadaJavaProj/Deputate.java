package Rada;

import java.util.Scanner;

/**
 * Created by Ілюша on 25.06.2017.
 */
public class Deputate extends Human {
    private String name;
    private String surname;
    private int age;
    private boolean isBribeTaker;
    private int valueOfBribe;

    public Deputate(int weight, int height, String name, String surname, int age, boolean isBribeTaker) {
        super(weight, height);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isBribeTaker = isBribeTaker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return isBribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        isBribeTaker = bribeTaker;
    }

    public int getValueOfBribe() {
        return valueOfBribe;
    }

    public void setValueOfBribe(int valueOfBribe) {
        this.valueOfBribe = valueOfBribe;
    }

    public void giveBribe() {
        Scanner sc = new Scanner(System.in);

        if (this.isBribeTaker = false) {
            System.out.println("Цей депутат не бере хабарів.");
        }
        {
            System.out.println("Введіть суму хабаря:");
            if (sc.hasNextInt()) {
                int sumOfBribe = sc.nextInt();
                if (sumOfBribe > 5000) {
                    System.out.println("Поліція ув’язнить депутата за хабар у розірі більше 5000 грн.");
                } else {
                    this.valueOfBribe = sc.nextInt();
                }
            } else {
                System.out.println("Ви ввели невірне значення для хабаря.");
            }
        }
        sc.close();
    }
}

