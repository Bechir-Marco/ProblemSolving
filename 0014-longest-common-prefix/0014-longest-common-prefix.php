class Solution {

    /**
     * @param String[] $strs
     * @return String
     */
    function longestCommonPrefix($strs) {
    
        if (count($strs) <1 ) return "";
        if (count($strs)==1) return $strs[0];
        $str =$strs[0];
        
        $prefix=$str;
        for ($i=1;$i<count($strs);$i++):
             $j=0;
            while ($j<strlen($str) && $j <strlen($strs[$i]) && $str[$j]==$strs[$i][$j]): 
                    $j++;
                endwhile;
   
                    $prefix= substr($prefix,0,$j);
                    
                    
            if ($prefix == "") break;
            endfor;
            return $prefix;
    }
}