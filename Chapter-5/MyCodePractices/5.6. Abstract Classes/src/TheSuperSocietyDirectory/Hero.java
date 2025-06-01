package TheSuperSocietyDirectory;
import java.time.LocalDate;



public class Hero extends Person{
    private String superPower;
    private LocalDate joinDate;


    public Hero(String name, String superPower, int year, int month, int day) {
        super(name);
        this.superPower = superPower;
        this.joinDate =  LocalDate.of(year, month, day);
    }


    public String  getDescription(){
        return "a hero with the power of " + superPower + ", joined on " + joinDate;
    }

}
