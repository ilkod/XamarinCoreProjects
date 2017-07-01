package Rada;

import java.util.Scanner;

/**
 * Created by Ілюша on 25.06.2017.
 */
public class Main {

    public static final void Menu(){
        System.out.println("Введіть 1, щоб додати фракцію."+ "\nВведіть 2, щоб видалити фракцію."
                + "\nВведіть 3, щоб очистити фракцію"+ "\nВведіть 4, щоб вивести фракції"+ "\nВведіть 5, щоб вивести фракцію"
                + "\nВведіть 6, щоб додати депутата до фракції"+ "\nВведіть 7, щоб видалити депутата з фракції"
                + "\nВведіть 8, щоб вивести список хабарників фракції"+ "\nВведіть 9, щоб вивести найбільшого хабарника фракції."
                + "\nTo EXIT  press default button exclude numbers from 1 to 9");


    }

    public static void main(String[] args) {
        Menu();

        Parlament parlament=new Parlament();

        Scanner sc=new Scanner(System.in);
        int number =0;

        while (true) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
            } else {
                System.out.println("Please enter correct number for choose!");
            }

            switch (number)
            {
                case 1:
                    parlament.addFraction();
                    break;

                case 2:
                    parlament.deleteFraction();
                    break;

                case 3:
                    parlament.clearFraction();
                    break;

                case 4:
                    parlament.showAllFraction();
                    break;

                case 5:
                    parlament.showFraction();
                    break;

                case 6:
                    parlament.addDeputateToFraction();
                    break;

                case 7:
                    parlament.deleteDeputateFromFraction();
                    break;

                case 8:
                    parlament.showBribeTakersInFraction();
                    break;

                case 9:
                    parlament.showBiggestBribeTakersInFraction();
                    break;

                default:
                    sc.close();
                    System.exit(0);

            }

        }
    }
}
