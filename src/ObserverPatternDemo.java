/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author cvalley
 */
public class ObserverPatternDemo {

public static void main(String[] args) {

SubjectClass obj = new SubjectClass();

new HexaObserverClass(obj);

new BinaryObserverClass(obj);

System.out.println("First state change: 12");

obj.setCon(12);

System.out.println("Second state change: 11");

obj.setCon(11);

}
}