import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Galaxy<N,P> {//data structure to create your own galaxy
    private HashMap<N,P> planets;//it takes numeration of planet as key and name of planet as value
    Galaxy(){
        planets=new HashMap<>();//it is based on hashmap
    }
    public void create(N numeration,P planet){//create method is simply adding element in your structure
        planets.put(numeration,planet);
    }
    public void reveal(int n){//reveal method outputs value of element based on key you input if it is not empty
        if(planets.isEmpty()){
            System.out.println("There are no planets in your galaxy");
        }
        System.out.println(planets.get(n));
    }
    public void extingush(){//this method clears whole structure
        planets.clear();
        System.out.println("There are no planets left in your galaxy");
    }
    public void destroy(int n){//this method removes element based on key you input
        if(planets.isEmpty()){
            System.out.println("There are no planets in your galaxy");
        }
        System.out.println(planets.get(n)+" is destroyed");
        planets.remove(n);
    }
}
