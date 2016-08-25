/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import POJO.Artikel;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Wendy
 */
public class ArtikelView {
    private final static Logger LOGGER = LoggerFactory.getLogger(ArtikelView.class.getName());
    int userInput;
    Scanner scanner = new Scanner(System.in);
    
    public int startArtikelMenu() {
        System.out.println();
        System.out.println("Maak uw keuze: ");
        System.out.println("1. Nieuw artikel toevoegen.");
        System.out.println("2. Artikelgegevens opzoeken.");
        System.out.println("3. Artikelgegevens wijzigen.");
        System.out.println("4. Artikelgevens verwijderen.");
        System.out.println("5. Terug naar het hoofdmenu.");       
        
        try{
             userInput = Integer.parseInt(scanner.nextLine());
        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, kies van de opties hierboven.");
        }
        
        return userInput;
        
    }
    
    public String voerArtikelNaamIn() {
        System.out.print("Artikelnaam: ");
        String artikelNaam = scanner.next();
        scanner.nextLine();
        return artikelNaam;   
    }
    
    public double voerAtrikelPrijsIn() {
        System.out.print("ArtikelPrijs: ");
        double artikelPrijs = scanner.nextDouble();
        scanner.nextLine();
        return artikelPrijs;
    }
    public void printArtikelOverzicht(Artikel artikel) {
        System.out.println("Het artikel heeft de volgende gegevens:");
        System.out.println("artikel id: " + artikel.getArtikelId());
        System.out.println("artikel naam: " + artikel.getArtikelNaam());
        System.out.println("artikel prijs: " + artikel.getArtikelPrijs() + "\n");
        
        
        /** System.out.println("Kloppen deze gegevens?");
            System.out.println("1. Ja, bevestigen.");
            System.out.println("2. Nee, gegevens wijzigen.");
        
            try{
            userInput = scanner.nextInt();  
            }
            catch(InputMismatchException ex){
                System.out.print("Foute input, kies van de opties hierboven.");
            }
        
            return userInput;
            */
    }
    
    public int menuArtikelZoeken(){
        System.out.println("Wat wilt u zoeken in het artikelbestand?");
        System.out.println("1. naar één artikel.");
        System.out.println("2. naar alle artikelen.");
        System.out.println("3. terug naar het menu Artikel.");
        
        try{
            userInput = Integer.parseInt(scanner.nextLine());            

        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, kies van de opties hierboven.");
        }
        
        return userInput;
    }
    
    
    
    public int hoeWiltUZoeken() {
        System.out.println("Kies met wat u wilt zoeken:");
        System.out.println("1. Zoeken met artikel id.");
        System.out.println("2. Zoeken met artikel naam.");
        System.out.println("3. Zoeken met artikel prijs.");
        System.out.println("4. Terug naar het artikel hoofd menu.");
        try{
            userInput = scanner.nextInt();  
            scanner.nextLine();
        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, kies van de opties hierboven.");
        }
        
        return userInput;          
    }
    
    
    public void printArtikelenLijst(ArrayList<Artikel> lijst){
        System.out.println();
        System.out.println("Lijst met artikelen");
        System.out.printf("%-12s%-25s%-15s%n", "ArtikelId", "Artikel naam", "Artikel prijs");
        for (int i = 0; i< lijst.size(); i++){

            System.out.printf ("%-12s%-25s%-15s%n",(lijst.get(i)).getArtikelId(),
                    (lijst.get(i)).getArtikelNaam(),(lijst.get(i)).getArtikelPrijs());
        }        
    }
    
    
    public int isArtikelIdBekend() {
        System.out.println("Is het ariktel id bekend?");
        System.out.println("1. Ja.");
        System.out.println("2. Nee.");
        
        try{
            userInput = scanner.nextInt();  
            scanner.nextLine();
        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, kies van de opties hierboven.");
        }
        
        return userInput;  
    }
    
    public int voerArtikelIdIn() {
        System.out.println("Voer het artikel id in.");
        userInput = scanner.nextInt();
        scanner.nextLine();
        return userInput;
    }
    
    public int checkInputString(String inputString) {
        System.out.println("Is het volgende gegeven juist: " + inputString + "?");
        System.out.println("1. ja.");
        System.out.println("2. nee");
        
        try{
            userInput = scanner.nextInt();  
            scanner.nextLine();
        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, kies van de opties hierboven.");
        }
        
        return userInput;
        
    }
    
    
    public int printVerwijderMenu() {
        System.out.println("Wat wilt u verwijderen uit het artikelenbestand?");
        System.out.println("1. één artikel.");
        System.out.println("2. alle artikelen.");
        System.out.println("3. terug naar het artikel menu.");
        
        try{
            userInput = scanner.nextInt();  
            scanner.nextLine();
        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, kies van de opties hierboven.");
        }
        
        return userInput;
    }
    
    public int printDeleteArtikelView() {
        System.out.println("Voer het artikel id in van het artikel dat u wilt verwijderen.");
        
        try{
            userInput = scanner.nextInt();  
            scanner.nextLine();
        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, voer het artikel id in.");
        }
        
        return userInput;
    }
    
    
    public void printDeleteResultaat(boolean deleted, int artikelId) {
        if (deleted) 
            System.out.println("Het artikel met artikel id " + artikelId + " is verwijderd.");
        else
            System.out.println("Verwijderen mislukt.");
    }   


    public int bevestigingsVraag(){
        
        System.out.println("Weet u zeker dat u alle artikel gegevens definitief verwijderen wil?");
        System.out.println("1. ja");
        System.out.println("2. nee");
        
        try{
            userInput = Integer.parseInt(scanner.nextLine());        
        }
        catch(InputMismatchException ex){
            LOGGER.warn("Foute input, kies van de opties hierboven.");
        }
        
        return userInput;
        
    }
 
}// einde klasse