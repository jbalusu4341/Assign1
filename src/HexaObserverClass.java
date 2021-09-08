/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author cvalley
 */
public class HexaObserverClass extends ObserverClass{
    private SubjectClass subject;

public HexaObserverClass(SubjectClass subject){

this.subject = subject;

this.subject.attach(this);

}

@Override

public void update() {

System.out.println( "Hex String: " + Integer.toHexString( subject.getCon() ).toUpperCase() );

}

}
