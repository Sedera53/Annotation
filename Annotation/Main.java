package affi;
import personne.Emp;
import test2.Dao;
import java.util.*;
import java.lang.annotation.*;
public class Main {
    public static void main(String[] args){
        Emp emp = new Emp();
        Dao vv = new Dao();
        emp.setid(5);
        Vector<Object> obj = new Vector<>();
        obj.add(emp);
        obj.add(vv);
        
        for(Object o :obj){
            Annotation[] annotations = o.getClass().getDeclaredAnnotations();
            if(annotations.length > 0){
                System.out.println(o.getClass().getSimpleName()+" "+"nom class");
                
            }
            else{
                System.out.println("vide");
            }
        }
    }
}
