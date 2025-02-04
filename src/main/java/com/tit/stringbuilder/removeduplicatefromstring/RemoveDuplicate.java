package com.tit.stringbuilder.removeduplicatefromstring;
public class RemoveDuplicate {
    public String removeDuplicate(String string){
        StringBuilder sb=new StringBuilder();
        boolean flag;
        for (int i=0;i<string.length();i++){
            flag=true;

              for (int j=0;j<sb.length();j++){
                  if (string.charAt(i)==sb.charAt(j))
                  {
                     flag=false;
                     break;
                  }

              }
              if(flag==true||sb.length()==0){
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }
}
