package opps;

public class CustomGenrticArraylist<T>{
    private Object[] data;
    private static int Default_Size = 10;
    private int size = 0;

    public CustomGenrticArraylist(){
        data = new Object[Default_Size];
    }


    public void add (T num){
        if (isfull()){
            resize();
        }
        data[size++]= num;
    }

    private void resize(){
        Object[] temp = new Object[Default_Size*2];
        for (int i = 0; i < data.length ; i++) {
            temp[i]=data[i];
        }

        data=temp;
    }

    private boolean isfull(){
        return size== data.length;
    }

    public T remove(){
        T remove = (T)(data[size--]);
        return remove;
    }
    public T get (int index){
        return (T) data[index];
    }
    public int Size(){
        return size;
    }
    public void set(int index , T value) {
        data[index] = value;
    }
//    public String toString() {
//
//        return super.toString();
//    }

    public static void main(String[] args) {
      CustomGenrticArraylist<Integer> list = new CustomGenrticArraylist<Integer>();
      list.add(34);
    }
} 
