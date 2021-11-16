package com.example.beeradvisor;

public class BeerExpert {
  public static   String getSuggestion(String s){
        String suggestion = null;;

        switch (s) {
            case "light":
                suggestion = "Qi dao" + "\n " + "SnowFlack";
                break;
            case "Amber":
                suggestion = "Ha pi " + "\n " + "Blue Arrow ";
                break;
            case "Brown":
                suggestion = "jack amber" + "\n " + "Red moose";
                break;
            case "Black":
                suggestion = "Jiali paol" + "\n " + "Gout speed";
                break;
            default:
                break;
        }

       return suggestion;
    }
}
