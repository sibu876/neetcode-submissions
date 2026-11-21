class Solution {

    public String encode(List<String> strs) {
                 StringBuilder sb = new StringBuilder();

                 for(int i=0;i<strs.size();i++){
                     sb.append(strs.get(i));
        
                    
                     
                     sb.append("<!>");
                 }

                 return sb.toString();
    }

    public List<String> decode(String str) {
           List<String> list = new ArrayList<>();
           StringBuilder sb = new StringBuilder();
           for(int i=0;i<str.length();i++){
               if(str.charAt(i) == '<' && str.charAt(i+1) == '!'  && str.charAt(i+2) == '>'){
                  list.add(sb.toString());
                  sb.setLength(0);
                  i += 2;
               }else{
                  sb.append(str.charAt(i));
               }

           }
           return list;
    }
}
