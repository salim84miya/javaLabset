//class name exp11_1

//program using super keyword
class employee {
    int wt = 8;
   }
   
   class clerk extends employee {
    int wt = 10;  //work time
    void display() {
     System.out.println(super.wt); //will print work time of clerk
    }
   
    
   }
   class exp11_1 extends clerk{
    public static void main(String args[]) {
        clerk c = new clerk();
        c.display();
       }
}