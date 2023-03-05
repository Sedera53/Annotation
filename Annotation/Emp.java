package personne;
import annotation.Field;
import annotation.Model;
@Model (nomTable = "olona") 
public class Emp {
    @Field (nomcolonne = "idolona")
    int id;
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }
}
