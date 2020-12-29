

class str{
 public static void main(String args[])
 { 
       String s ="hello"+"!";
       s = s.toUpperCase();
       s = s.concat("how is u");
      s = s.toLowerCase();
       System.out.println(s); 
       System.out.println(s.endsWith("u"));   

     StringBuffer sb = new StringBuffer("I m Remy"+"james");
    sb.append("this is java class");
    System.out.println(sb);
    sb.insert(13,"!!!");
    System.out.println(sb);
    sb.insert(24," new");
    System.out.println(sb);
   Sring si=String s + String sb;
  System.out.println(si);
    
  
  
}}
     
