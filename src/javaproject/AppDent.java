/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Doriane Lami
 */
public class AppDent extends App {

    protected int duration; //durée par défaut (30 min) ou durée spécifique

    public AppDent(String patient, String doc, int d, int m, int y, int hour, int min, int dur) throws AppException{

        super(patient, doc, d, m, y, hour, min);
        duration = dur;

    }

    public AppDent(String patient, String doc, int d, int m, int y, int hour, int min) throws AppException{

        super(patient, doc, d, m, y, hour, min);
        duration = 30;

    }

    public String toString() {

        String retour;
        retour = super.toString();
        retour = retour + ", duration: " + duration + " min";
        return retour;

    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int finalHour(App a) {

        int min = 0;
        int hour = a.getDebutHour();
        min = a.getDebutMin() + duration;
        while (min >= 60) {
            hour++;
            min = min - 60;
        }
        return hour;

    }

    public int finalMin(App a) {

        int min = 0;
        int hour = a.getDebutHour();
        min = a.getDebutMin() + duration;
        while (min >= 60) {
            hour++;
            min = min - 60;
        }
        return min;
    }

    public String finalTime(App a) {
        return finalHour(a) + ":" + finalMin(a);

    }
}
