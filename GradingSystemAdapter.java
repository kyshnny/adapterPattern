/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author DELL
 */
public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;
    
    public GradingSystemAdapter(GradingSystem gradingSystem){
        
        this.gradingSystem = gradingSystem;
        
    }
    
    @Override
    public void integrateSystem(){
        
        gradingSystem.recordGrades();
        
    }
    
}
