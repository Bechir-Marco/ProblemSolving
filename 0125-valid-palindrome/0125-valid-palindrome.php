class Solution {

    /**
     * @param String $s
     * @return Boolean
     */
  function isPalindrome($s) {
        if (strlen($s)==1) return true;
        
        $s = strtolower($s);
        $news= "";
        $res="";
         for ($i =0; $i<strlen($s);$i++): 
            
            if(($s[$i]>='a' && $s[$i]<='z' || is_numeric($s[$i]))):
                
                $news.=$s[$i];
                $res= $s[$i]. $res;
            endif; 
        endfor;
        ;
        return  ($news == $res);
        
    }
}