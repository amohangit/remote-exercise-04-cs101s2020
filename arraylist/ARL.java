import java.util.ArrayList;
public class ARL{
    public static void main(String[] args){
        ArrayList<Integer> stud_ids = new ArrayList<Integer>();
        stud_ids.add(10001);  
        stud_ids.add(10002);
        stud_ids.add(10003);
        stud_ids.add(10004);
        stud_ids.add(10005);
        stud_ids.add(10006);
        stud_ids.add(10007);
        stud_ids.add(10008);
        stud_ids.add(10009);
        stud_ids.add(10010);
        System.out.println(stud_ids);
        stud_ids.remove(2); // by index (position no)
        stud_ids.remove(4); // by index (position no)
        System.out.println(stud_ids);
        stud_ids.remove((Integer) 10007); // remove by value of the element
        System.out.println(stud_ids);
        stud_ids.set(4, 20008); // update
        stud_ids.set(5, 20009); // update
        stud_ids.set(6, 20010); // update
        System.out.println(stud_ids);


    }
}