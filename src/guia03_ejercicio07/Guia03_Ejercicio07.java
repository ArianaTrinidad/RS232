package guia03_ejercicio07;

import java.util.Scanner;

public class Guia03_Ejercicio07 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        read.useDelimiter("\n");
        
        int quantity, hits, mistakes;
        
        boolean assessQuantity, assessMsg, assessHits, assessFDE;
        
        String userMsg, firstType, lastType,specialMsg, userMsgLower, firstPosition, lastPosition;
        
        specialMsg = "&&&&&";
        quantity = 5;
        hits = 0;
        mistakes = 0;
        
        do{
           
            System.out.print("Mensaje: ");
            
            userMsg = read.next();
            userMsgLower = userMsg.toLowerCase();
            
            firstType = "x";
            lastType = "o";
            
            firstPosition = userMsgLower.substring(0,1);
            lastPosition = userMsgLower.substring(4);
            
            assessMsg = firstPosition.equals(firstType) & lastPosition.equals(lastType);
            
            assessQuantity = userMsgLower.length() == quantity;
            
            assessHits = assessQuantity && assessMsg;
            
            assessFDE = userMsgLower.equals(specialMsg);
            
            if (assessHits || assessFDE){
                hits = hits + 1;
            }
            else if (!assessQuantity || !assessMsg ){
                mistakes = mistakes +1;
            }
            
        } while(!assessFDE);
        
        
        System.out.println("Lecturas correctas: "+ hits +"\nLecturas incorrectas: " + mistakes);
        
    }
    
}
