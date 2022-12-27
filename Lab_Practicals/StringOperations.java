public class StringOperations {
    public static void main(String[] args) {
        String S1="Ranjit";
        String S2="Chhetri";
        System.out.println("The strings are "+S1+" and "+S2);
        int len1=S1.length();
        int len2=S2.length();

        System.out.println("length of "+S1+" is = "+len1);
        System.out.println("length of "+S2+" is = "+len2);

        System.out.println("The concatenation of two strings is "+S1.concat(S2));
        
        System.out.println("The first character of strings "+S1+" is "+S1.charAt(0));

        System.out.println("The uppercase of string"+S1+" is "+S1.toUpperCase());
        
        System.out.println("The lowercase of string"+S2+" is "+S2.toLowerCase());

        System.out.println("J occurs at position "+S1.indexOf("j")+" in "+S1);
       
        System.out.println("substring of "+S1+" starting from index 2 and ending at 4 is= "+S1.substring(1,5));
        System.out.println("replacing 'a' with 'o' in "+S1+" is "+S1.replace('a','o'));
        
        boolean check=S1.equals(S2);
        if(check==false)
        {
            System.out.println(" "+S1+" and "+S2+" are not same");
        }
        else{
            System.out.println(" "+S2+" and "+S2+" are same");
        }
        
       

    }
}
