/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author DELL
 */
public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;
    
    public LibrarySystemAdapter(LibrarySystem librarySystem){
        
        this.librarySystem = librarySystem;
        
    }
    
    @Override
    public void integrateSystem(){
        
        librarySystem.manageBooks();
        
    }
    
}
