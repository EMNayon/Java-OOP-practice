
package settergetter;
public class NewClass {
    private String name = "EM Nayon";
    private String newName;
    
    // Create a Getter method
    public String Getter(){
        return name;
    }
    public void Setter(String name){
        this.newName = name;
        System.out.println(this.newName);
    }
    
}
