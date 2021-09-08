/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;

import java.util.List;

public class SubjectClass

{

private List<ObserverClass> observers = new ArrayList<ObserverClass>();

private int con;

public int getCon() {

return con;

}

public void setCon(int con) {

this.con = con;

notifyAllObservers();

}

public void attach(ObserverClass observer){

observers.add(observer);  

}

public void notifyAllObservers(){

for (ObserverClass observer : observers) {

observer.update();

}

}  

}