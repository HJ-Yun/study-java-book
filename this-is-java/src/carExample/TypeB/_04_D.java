package carExample.TypeB;

import carExample.TypeA._01_A;

public class _04_D extends _01_A{ //"_04_D" is child of "_01_A"
    public _04_D(){
        super(); //Child can use
        this.field = "value"; //Child can use
        this.method(); //Child can use
    }
}
