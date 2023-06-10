package basicJava;

class constructorDemo2{  
	
    int id;  
    String name;  
   
    constructorDemo2(int id,String name)
    {  
    this.id = id;  
    this.name = name;  
    }  

    void display()
    {
    System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
  
    constructorDemo2 s1 = new constructorDemo2(111,"Karan");  
    constructorDemo2 s2 = new constructorDemo2(222,"Aryan");  
    
    s1.display();  
    s2.display();  
    
   }  
}