/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Calendar;

/**
 *
 * @author Janghun Yu
 */
public class CurrentTime {
    public void display()
    
    {         
        CurrentTime time = new CurrentTime();
        
        Calendar rightNow = Calendar.getInstance();
        int year = rightNow.get(Calendar.YEAR);
        int month =rightNow.get(Calendar.MONTH)+1;
        int dayOfMonth =rightNow.get(Calendar.DAY_OF_MONTH);
        int hour= rightNow.get(Calendar.HOUR_OF_DAY);
        int min =rightNow.get(Calendar.MINUTE);
        System.out.println("Today: " + year+ "/" + month + "/" + dayOfMonth + " Current Hour:" + hour + ":" + min); // Just doing this for the time being
    }
}
