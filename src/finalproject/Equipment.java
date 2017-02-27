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
public class Equipment {
    //create a FINAL String array of equipment
    //jet ski, pontoon boat, rowboat, canoe, kayak, beach chair, umbrella, other
    // create a FINAL double array of equipment charges
    // 50, 40, 15, 12, 10, 2, 1, 0
    
    int equipType;
    String equipName;
    double equipFee;

    public Equipment(int Equipment) {
        this.equipType = Equipment;
        //set other two fields based on corresponding arrays (0-6)
        // if number is negative or greater than range of the array set value to "other"
    }
    public String lesson(){
        String policy = "A lesson is required for all Jet Ski and Pontoon Boat rentals.";
        return policy;
    }

    //GETTERS
    public int getEquipType() {
        return equipType;
    }

    public String getEquipName() {
        return equipName;
    }
   
    public double getEquipFee() {
        return equipFee;
    }

    
    //SETTERS
    public void setEquipFee(double equipFee) {
        this.equipFee = equipFee;
    }
    
    public void setEquipType(int equipType) {
        this.equipType = equipType;
    }
    
     public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

}
