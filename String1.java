public String longestCommonPrefix(String[] strs) {
int a=strs.length();
 +    String longestPrefix = "";
 +    if(>0){
 +        longestPrefix = strs[0];
 +    }
 +    for(int i=1; i<a; i++){
 +        String analyzing = strs[i];
 +        int j=0;
 +        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
 +            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
 +                break;
 +            }
 +        }
 +        longestPrefix = strs[i].substring(0, j);
 +    }
 +    return longestPrefix;
 +}
