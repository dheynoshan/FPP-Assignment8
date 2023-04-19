package problem1;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] perArray;
    private int size;
    public MyPersonList(){
        this.perArray = new Person[INITIAL_LENGTH];
        size = 0;
    }
    //Resizing the array
    private void resize(){
        System.out.println("Resizing....");
        Person[] temp = new Person[2* perArray.length];
        System.arraycopy(perArray, 0, temp, 0, size);
        perArray = temp;
        temp = null;
    }
    //Adding person to array
    public void add(Person person){
        if(person==null) return;
        if(size==perArray.length)
            resize();

        perArray[size++] = person;

    }
    //Get person by index
    public Person get(int pos){
        if(pos < 0 || pos>=size || size==0) return null;

        return perArray[pos];
    }
    //Search by last name
    public boolean find(String lastName){
        if(lastName==null) return false;
        for (Person p:perArray) {
            if(p.getLast().equals(lastName))
                return true;
        }
        return false;
    }
    //insert to position
    public void insert(Person person, int pos){
        if(pos<0 || pos>size) return;
        if(size+1==perArray.length) resize();
        Person[] temp = new Person[perArray.length];
        System.arraycopy(perArray,0,temp,0,pos);
        temp[pos] = person;
        System.arraycopy(perArray, pos, temp, pos+1,size-pos);
        perArray = temp;
        temp = null;
        size++;
    }
    //Remove by last name
    public boolean remove(String lastName){
        if(lastName==null || size==0) return false;
        int pos = -1;
        for(int i=0; i<size; i++){
            if(perArray[i].getLast().equals(lastName)) {
                pos = i;
                break;
            }
        }
        if(pos==-1) return false;
        Person[] temp = new Person[perArray.length];
        System.arraycopy(perArray,0,temp,0,pos);
        System.arraycopy(perArray,pos+1, temp,pos, size-pos);
        perArray = temp;
        temp = null;
        size--;
        return true;
    }

    public String toString(){
        String s = "";
        for(int i=0; i<size; i++){
            s+=perArray[i].toString();
            s+="\n";
        }
        return s;
    }
    public int size() {
        return  size;
    }
    public boolean isEmpty(){
        if(size==0)
            return true;
        else
            return false;

    }
    public Object clone()
    {
        Person[] temp = Arrays.copyOf(perArray, size);
        return temp;
    }
}
