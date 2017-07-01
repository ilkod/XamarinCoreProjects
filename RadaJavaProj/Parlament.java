package Rada;

import javax.sql.rowset.FilteredRowSet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ілюша on 25.06.2017.
 */
public class Parlament {
    private ArrayList<Fraction> listOfFractions;

    public Parlament() {
        this.listOfFractions = new ArrayList<Fraction>();
    }

    public void addFraction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть назву фракції.");
        String nameOfFraction = sc.nextLine();

        Fraction fraction = new Fraction(nameOfFraction);
        listOfFractions.add(fraction);

        sc.close();
    }

    public void deleteFraction() {
        System.out.println("Введіть назву фракції, яку необхідно видалити.");

        Scanner sc = new Scanner(System.in);
        String nameOfFractionToDelete = sc.nextLine();

        for (Fraction frac : listOfFractions) {
            if (frac.getNameOfFraction().equals(nameOfFractionToDelete)) listOfFractions.remove(frac);
        }

        sc.close();
    }

    public void showFraction(){
        Scanner sc=new Scanner(System.in);
        String nameOfFrac=sc.nextLine();

        for(Fraction frac:listOfFractions){
            if(frac.getNameOfFraction().equals(nameOfFrac)) frac.showAllDeptsInFraction();
        }

        sc.close();
    }

    public void addDeputateToFraction(){
        Scanner sc=new Scanner(System.in);
        String nameOfFrac=sc.nextLine();

        for(Fraction frac:listOfFractions){
            if(frac.getNameOfFraction().equals(nameOfFrac)) frac.addDeputateToFraction();
        }

        sc.close();
    }

    public void deleteDeputateFromFraction(){
        Scanner sc=new Scanner(System.in);
        String nameOfFrac=sc.nextLine();

        for(Fraction frac:listOfFractions){
            if(frac.getNameOfFraction().equals(nameOfFrac)) frac.deleteDeptFromFraction();
        }

        sc.close();
    }

    public void showBribeTakersInFraction(){
        Scanner sc=new Scanner(System.in);
        String nameOfFrac=sc.nextLine();

        for(Fraction frac:listOfFractions){
            if(frac.getNameOfFraction().equals(nameOfFrac)) frac.showBribeTakers();
        }

        sc.close();
    }

    public void showBiggestBribeTakersInFraction(){
        Scanner sc=new Scanner(System.in);
        String nameOfFrac=sc.nextLine();

        for(Fraction frac:listOfFractions){
            if(frac.getNameOfFraction().equals(nameOfFrac)) frac.showBiggestBrTaker();
        }

        sc.close();
    }

    public  void clearFraction(){
        Scanner sc=new Scanner(System.in);
        String nameOfFrac=sc.nextLine();

        for(Fraction frac:listOfFractions){
            if(frac.getNameOfFraction().equals(nameOfFrac)) frac.clearFraction();
        }

        sc.close();
    }

    public void showAllFraction(){
        for(Fraction frac:listOfFractions){
            System.out.println(frac.getNameOfFraction());
        }
    }
}

