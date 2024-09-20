/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author DELL
 */
public class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;
    
    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem){
        
        this.attendanceSystem = attendanceSystem;
        
    }
    
    @Override
    public void integrateSystem(){
        
        attendanceSystem.markAttendance();
        
    }
    
}
