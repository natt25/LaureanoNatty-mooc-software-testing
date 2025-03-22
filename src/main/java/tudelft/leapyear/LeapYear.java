package tudelft.leapyear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if ( year % 400 == 0)
            return true;
        if ( year % 100 == 0)
            return false;
        return  ( year % 4 == 0 ) ? false : true; //Actividad 1: cambio de true a false, genera errores en testing
        // debe ser: return  ( year % 4 == 0 ) ? true : false;
    }

}
