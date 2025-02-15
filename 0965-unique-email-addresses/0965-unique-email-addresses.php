class Solution {

    /**
     * @param String[] $emails
     * @return Integer
     */
function numUniqueEmails($emails) {
       
       $uniqueEmails = [];
        foreach($emails as $key => $v):
            $v= strtolower($v);
            list ($locals,$domains) =  explode('@',$v);
            
            $locals = preg_replace('/\./','',$locals);
            
    
             $locals= preg_replace('/\+.*/','',$locals);
           

        $uniqueEmails[$key]= $locals. '@' . $domains;
             print_r($uniqueEmails);
        endforeach;
      
    return count(array_unique($uniqueEmails));

 }
}