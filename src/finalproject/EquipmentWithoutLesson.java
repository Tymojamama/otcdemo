/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldemo;

/**
 *
 * @author wizar
 */
public class EquipmentWithoutLesson extends Equipment{
    
    public EquipmentWithoutLesson(int Equipment) {
        super(Equipment);
        //cannot accept jet ski or pontoon boat, all others may use this class
        // system out "no lesson required, lesson is $27"
        
    }
    
}
